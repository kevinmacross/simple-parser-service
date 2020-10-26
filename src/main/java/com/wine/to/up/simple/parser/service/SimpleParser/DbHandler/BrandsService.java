package com.wine.to.up.simple.parser.service.SimpleParser.DbHandler;

import com.wine.to.up.simple.parser.service.domain.entity.Brands;
import com.wine.to.up.simple.parser.service.repository.BrandsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BrandsService {
    private final BrandsRepository brandsRepository;

    @Autowired
    public BrandsService(BrandsRepository brandsRepository) {
        this.brandsRepository = brandsRepository;
    }

    protected Brands saveBrand(String brand) {
        Brands brandEntity;
        if (brandsRepository.existsBrandsByBrandNameEquals(brand)) {
            brandEntity = brandsRepository.findBrandByBrandName(brand);
            return brandEntity;
        }
        brandEntity = new Brands(brand);
        brandsRepository.save(brandEntity);
        log.trace("New Brand was added to DB: " + brand);
        return brandEntity;
    }
}