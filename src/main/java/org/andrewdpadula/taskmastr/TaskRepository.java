package org.andrewdpadula.taskmastr;

import org.springframework.boot.CommandLineRunner;

public interface TaskRepository extends CommandLineRunner{

	Task findOne(Long taskId);

}
