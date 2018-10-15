package org.andrewdpadula.taskmastr;

import org.springframework.boot.CommandLineRunner;

public interface DayRepository extends CommandLineRunner{

	Day findAll();

	Day findByName(String dayName);

}
