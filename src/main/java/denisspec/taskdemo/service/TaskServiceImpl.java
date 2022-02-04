package denisspec.taskdemo.service;

import denisspec.taskdemo.model.Task;
import denisspec.taskdemo.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskRepository taskRepository;


    @Override
    public Optional<Task> getById(Long id) {
        //return taskRepository.findById(id);
        return null;
    }

    @Override
    public void save(Task task) {
        log.info("In TaskServiceImpl save {}",task);
    taskRepository.save(task);
    }

    @Override
    public void delete(Long id) {
        log.info("In TaskServiceImpl getAll");
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }
}
