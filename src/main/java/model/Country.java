package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {
    private Integer tr;
    private Integer id;
    private String name;
}
