package org.andrewdpadula.taskmastr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

	Task findOne(Long taskId);

}
