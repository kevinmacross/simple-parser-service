package com.wine.to.up.simple.parser.service.simple_parser;

import com.wine.to.up.parser.common.api.schema.ParserApi;
import com.wine.to.up.simple.parser.service.domain.entity.Brands;
import com.wine.to.up.simple.parser.service.domain.entity.Countries;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**Data structure for storing parsed information
 * @see com.wine.to.up.simple.parser.service.domain.entity.Wine*/
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SimpleWine {
    private String image;
    private String brand;
    private Brands brandID;
    private String country;
    private Countries countryID;
    private Float capacity;
    private Float strength; // alcohol by volume
    private ParserApi.Wine.Color color;
    private ParserApi.Wine.Sugar sugar;
    private Integer year;
    private Float discount;
    private Float newPrice;
    private Float oldPrice;
    private String name;
    private Iterable<String> grapeSort;
    private String region;
    private String link;
    private float rating;
    private boolean sparkling;
    private String gastronomy;
    private String taste;
}
