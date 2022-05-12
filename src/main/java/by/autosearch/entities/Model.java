package by.autosearch.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "model")
public class Model {

    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Brand brand;
    private String model;
}
