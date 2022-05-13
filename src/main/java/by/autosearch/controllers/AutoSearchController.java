package by.autosearch.controllers;

import by.autosearch.dto.ParamSearchDto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/auto-search")
public class AutoSearchController {

    @GetMapping
    public ParamSearchDto getAll() {
        return new ParamSearchDto("BMW", "530", "black", 2022);
    }

    @PutMapping("/{id}")
    public ParamSearchDto updateParamAutoSearch(@PathVariable Integer id, @RequestBody ParamSearchDto paramSearchDto) {
        return paramSearchDto;
    }

    @DeleteMapping("/{id}")
    public void deleteParamSearchById(@PathVariable Integer id) {

    }

    @PostMapping
    public void createParamAutoSearch(@RequestBody ParamSearchDto paramSearchDto) {

    }
}
