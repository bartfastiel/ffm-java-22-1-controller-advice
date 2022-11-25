package com.example.ffmjava221controlleradvice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cats")
class CatController {

    @GetMapping
    public String getCat() {
        throw new CatNotFoundException();
    }
}