package org.andrewdpadula.taskmastr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DayRepository extends CrudRepository<Day, Long>{

	Day findByName(String dayName);

}
