package by.autosearch.repositories;

import by.autosearch.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametersRepository extends JpaRepository<Brand, Integer> {
}
