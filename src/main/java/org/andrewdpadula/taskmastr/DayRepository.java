package org.andrewdpadula.taskmastr;

import org.springframework.data.repository.CrudRepository;

public interface DayRepository extends CrudRepository<Day, Long>{

	Day findByName(String dayName);

}
