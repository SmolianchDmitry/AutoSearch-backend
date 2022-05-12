package by.autosearch.converters;

import by.autosearch.dto.ModelDto;
import by.autosearch.entities.Brand;
import by.autosearch.entities.Model;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ModelDtoToModel implements Converter<ModelDto, Model> {

    @Override
    public Model convert(ModelDto source) {
        return new Model(null, new Brand(source.getBrand_id(), null), source.getModel());
    }
}
