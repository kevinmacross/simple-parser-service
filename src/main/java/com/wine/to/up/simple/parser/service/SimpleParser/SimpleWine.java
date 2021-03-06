package com.wine.to.up.simple.parser.service.SimpleParser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.File;
import java.util.UUID;

@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SimpleWine {
    private UUID wineID = UUID.randomUUID();
    private File picture;
    private String brandID;
    private String countryID;
    private Float volume;
    private Float abv; // alcohol by volume
    private String colorType;
    private String sugarType;
    private int year;
    private String price;
    private String name;
    private String grapeType;

}
