package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {
    private Integer tr;
    private Integer id;
    private String name;
    private double price;
    private Integer year;
    private String color;
    private double memory;
}
