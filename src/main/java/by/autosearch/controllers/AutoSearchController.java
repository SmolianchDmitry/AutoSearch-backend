package by.autosearch.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auto-search")
public class AutoSearchController {

    @GetMapping
    public void getAll() {

    }
}
