package com.staimov.hellogit.controller;

import com.staimov.hellogit.json.Geo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GeoRestController {
    private static final Logger logger = LoggerFactory.getLogger(GeoRestController.class);

    @GetMapping("/geo")
    public Geo getGeo() {
        logger.info("Geo get request");
        return new Geo("Novolazarevskaya",
               -70.773889, 11.865);
    }
}
