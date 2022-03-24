package by.autosearch.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/param")
public class ParametersController {

    @GetMapping("/brand")
    public List<String> getBrand() {
        return new ArrayList<>();
    }

    @GetMapping("/model")
    public List<String> getModel() {
        return new ArrayList<>();
    }

    @GetMapping("/color")
    public List<String> getColor() {
        return new ArrayList<>();
    }

}
