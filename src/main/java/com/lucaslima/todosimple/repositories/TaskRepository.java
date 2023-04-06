package com.lucaslima.todosimple.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucaslima.todosimple.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    
    List<Task> findByUser_id(long id);

}
