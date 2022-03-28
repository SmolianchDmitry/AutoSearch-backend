package by.autosearch.controllers.admin;

import by.autosearch.sevices.ParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/api/param")
public class AdminParameterController {

    ParametersService parametersService;

    @Autowired
    public AdminParameterController(ParametersService parametersService) {
        this.parametersService = parametersService;
    }

    @PostMapping("/brand")
    public void postBrand(@RequestBody final String brand) {
        parametersService.setBrand(brand);
    }

    @PostMapping("/model")
    public void postModel(@RequestBody final String model) {
        parametersService.setModel(model);
    }

    @PostMapping("/color")
    public void postColor(@RequestBody final String color) {
        parametersService.setColor(color);
    }
}
