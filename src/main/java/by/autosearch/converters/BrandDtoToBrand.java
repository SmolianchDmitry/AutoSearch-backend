package by.autosearch.converters;

import by.autosearch.dto.BrandDto;
import by.autosearch.entities.Brand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BrandDtoToBrand implements Converter<BrandDto, Brand> {
    @Override
    public Brand convert(BrandDto source) {
        return new Brand(null, source.getBrand());
    }
}
