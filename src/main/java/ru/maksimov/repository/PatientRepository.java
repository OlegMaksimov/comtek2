package ru.maksimov.repository;

import org.springframework.data.repository.CrudRepository;
import ru.maksimov.model.Patient;

/**
 * Created by iMac on 10.11.2017.
 */
public interface PatientRepository extends CrudRepository<Patient,Integer> {
}
