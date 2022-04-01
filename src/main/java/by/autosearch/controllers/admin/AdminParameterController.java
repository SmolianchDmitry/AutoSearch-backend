package by.autosearch.controllers.admin;

import by.autosearch.dto.BrandDto;
import by.autosearch.dto.ModelDto;
import by.autosearch.entities.Brand;
import by.autosearch.entities.Model;
import by.autosearch.sevices.ParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/api/param")
public class AdminParameterController {

    ParametersService parametersService;
    ConversionService conversionService;

    @Autowired
    public AdminParameterController(ParametersService parametersService, ConversionService conversionService) {
        this.parametersService = parametersService;
        this.conversionService = conversionService;
    }




    public AdminParameterController(ParametersService parametersService) {
        this.parametersService = parametersService;
    }

    @PostMapping("/brand")
    public void postBrand(@RequestBody final BrandDto brand) {
        parametersService.setBrand(conversionService.convert(brand, Brand.class));
    }

    @PostMapping("/model")
    public void postModel(@RequestBody final ModelDto model) {
        parametersService.setModel(conversionService.convert(model, Model.class));
    }

    @PostMapping("/color")
    public void postColor(@RequestBody final String color) {
        parametersService.setColor(color);
    }
}
