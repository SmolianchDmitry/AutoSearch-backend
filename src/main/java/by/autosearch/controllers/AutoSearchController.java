package by.autosearch.controllers;

import by.autosearch.dto.ParamSearchDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auto-search")
public class AutoSearchController {

    @GetMapping
    public ParamSearchDto getAll() {
        return new ParamSearchDto("BMW", "530", "black", 2022);
    }
}
