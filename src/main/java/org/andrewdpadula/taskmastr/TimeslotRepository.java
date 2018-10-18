package org.andrewdpadula.taskmastr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TimeslotRepository extends CrudRepository<Timeslot, Long>{

	Timeslot findOne(Long timeslotId);

}
