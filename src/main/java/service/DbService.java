package service;

import model.Phone;
import model.Result;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbService {
    //    private static final String dbName = "web-4-first-spring";
//    private static final String url = "jdbc:postgresql://localhost:5432/" + dbName;
//    private static final String username = "postgres";
//    private static final String password = "root123";
    private static final String dbName = "dbm7kcj6rkrdf2";
    private static final String url = "postgres://pxqdzszbkhztpm:f54d80f803d46b6d9b828453f7c9f5704d0091d47bfec26bacdc06f64023be31@ec2-3-234-126-10.compute-1.amazonaws.com:5432/dbm7kcj6rkrdf2";
    private static final String username = "pxqdzszbkhztpm";
    private static final String password = "f54d80f803d46b6d9b828453f7c9f5704d0091d47bfec26bacdc06f64023be31";

    public List<Phone> getPhoneList() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from phone");
        int tr = 1;
        List<Phone> phones = new ArrayList<>();
        while (resultSet.next()) {
            phones.add(
                    Phone.builder()
                            .tr(tr)
                            .id(resultSet.getInt("id"))
                            .name(resultSet.getString("name"))
                            .price(resultSet.getDouble("price"))
                            .year(resultSet.getInt("year"))
                            .color(resultSet.getString("color"))
                            .memory(resultSet.getDouble("memory"))
                            .build()
            );
            tr++;
        }
        return phones;
    }

    public Result addPhone(Phone phone) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "{call add_phone(?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.setString(1, phone.getName());
        callableStatement.setDouble(2, phone.getPrice());
        callableStatement.setInt(3, phone.getYear());
        callableStatement.setString(4, phone.getColor());
        callableStatement.setDouble(5, phone.getMemory());
        callableStatement.registerOutParameter(6, Types.VARCHAR);
        callableStatement.registerOutParameter(7, Types.BOOLEAN);
        callableStatement.executeUpdate();
        return new Result(callableStatement.getString(6), callableStatement.getBoolean(7));
    }
}
