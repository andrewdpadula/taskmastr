package org.andrewdpadula.taskmastr;

import org.springframework.data.repository.CrudRepository;

public interface TimeslotRepository extends CrudRepository<Timeslot, Long>{

	Timeslot findOne(Long timeslotId);

}
