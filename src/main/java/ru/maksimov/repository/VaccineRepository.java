package ru.maksimov.repository;

import org.springframework.data.repository.CrudRepository;
import ru.maksimov.model.Vaccine;

/**
 * Created by iMac on 09.11.2017.
 */
public interface VaccineRepository extends CrudRepository<Vaccine,Integer>{
}
