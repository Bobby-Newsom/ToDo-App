package com.newsom.bobby.bobbys_todo_list.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed); //find all tasks marked incomplete

    List<Task> findByTitleContaining(String title); //search tasks by partial string match

    List<Task> findAllByOrderByCompletedAsc(); //sorts tasks by completion incomplete first

    Long countByCompleted(boolean completed); //returns the number of completed tasks



}
