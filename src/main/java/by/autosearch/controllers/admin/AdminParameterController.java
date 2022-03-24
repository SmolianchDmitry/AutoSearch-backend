package by.autosearch.controllers.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/api/param")
public class AdminParameterController {

    @PostMapping("/brand")
    public void postBrand(@RequestBody final String brand) {

    }

    @PostMapping("/model")
    public void postModel(@RequestBody final String model) {

    }

    @PostMapping("/color")
    public void postColor(@RequestBody final String color) {

    }
}
