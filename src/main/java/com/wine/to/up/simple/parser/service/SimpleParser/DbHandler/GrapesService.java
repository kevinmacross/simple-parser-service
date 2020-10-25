package com.wine.to.up.simple.parser.service.SimpleParser.DbHandler;

import com.wine.to.up.simple.parser.service.domain.entity.Grapes;
import com.wine.to.up.simple.parser.service.repository.GrapesRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GrapesService {

    private final GrapesRepository grapesRepository;

    public GrapesService(GrapesRepository grapesRepository) {
        this.grapesRepository = grapesRepository;
    }

    protected Grapes saveGrape(@NonNull String grape) {
        Grapes grapeEntity;
        if (grapesRepository.existsGrapesByGrapeName(grape)) {
            grapeEntity = grapesRepository.findGrapeByGrapeName(grape);
            return grapeEntity;
        }
        grapeEntity = new Grapes(grape);
        grapesRepository.save(grapeEntity);
        log.trace("New Grape was added to DB: " + grape);
        return grapeEntity;
    }
}
