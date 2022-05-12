package by.autosearch.controllers;

import by.autosearch.dto.BrandDto;
import by.autosearch.dto.ColorDto;
import by.autosearch.dto.ModelDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/param")
public class ParametersController {

    @GetMapping("/brand")
    public List<BrandDto> getBrand() {
        return new ArrayList<>();
    }

    @GetMapping("/model")
    public List<ModelDto> getModel() {
        return new ArrayList<>();
    }

    @GetMapping("/color")
    public List<ColorDto> getColor() {
        return new ArrayList<>();
    }

}
