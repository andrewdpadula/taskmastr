package org.andrewdpadula.taskmastr;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{

	Task findOne(Long taskId);

}
