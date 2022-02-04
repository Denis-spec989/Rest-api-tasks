package denisspec.taskdemo.service;

import denisspec.taskdemo.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

     Optional<Task> getById(Long id);

     void save(Task task);

     void delete(Long id);

     List<Task> getAll();


}
