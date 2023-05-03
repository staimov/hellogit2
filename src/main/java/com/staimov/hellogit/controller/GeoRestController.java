package com.staimov.hellogit.controller;

import com.staimov.hellogit.json.Geo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GeoRestController {
    @GetMapping("/geo")
    public Geo getGeo() {
       return new Geo("Molodezhnaya",
               -67.671667, 45.8558333);
    }
}
