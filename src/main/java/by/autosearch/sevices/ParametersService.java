package by.autosearch.sevices;

import by.autosearch.entities.Brand;
import by.autosearch.repositories.ParametersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParametersService {

    ParametersRepository parametersRepository;

    @Autowired
    public ParametersService(ParametersRepository parametersRepository) {
        this.parametersRepository = parametersRepository;
    }

    public void setBrand(Brand brand) {

        parametersRepository.save(brand);
    }

    public void setModel(String model) {

    }

    public void setColor(String color) {

    }
}
