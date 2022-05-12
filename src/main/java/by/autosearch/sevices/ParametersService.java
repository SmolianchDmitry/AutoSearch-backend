package by.autosearch.sevices;

import by.autosearch.entities.Brand;
import by.autosearch.entities.Model;
import by.autosearch.repositories.BrandRepository;
import by.autosearch.repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParametersService {

    BrandRepository brandRepository;
    ModelRepository modelRepository;

    @Autowired

    public ParametersService(BrandRepository brandRepository, ModelRepository modelRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
    }



    public void setBrand(Brand brand) {

        brandRepository.save(brand);
    }

    public void setModel(Model model) {
        modelRepository.save(model);

    }

    public void setColor(String color) {

    }
}
