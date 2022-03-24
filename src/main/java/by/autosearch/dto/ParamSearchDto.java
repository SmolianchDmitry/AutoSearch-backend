package by.autosearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParamSearchDto {

    String brand;
    String model;
    String color;
    Integer productionYear;
}
