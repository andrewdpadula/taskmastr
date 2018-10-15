package org.andrewdpadula.taskmastr;

import org.springframework.boot.CommandLineRunner;

public interface TimeslotRepository extends CommandLineRunner{

	Timeslot findOne(Long timeslotId);

}
