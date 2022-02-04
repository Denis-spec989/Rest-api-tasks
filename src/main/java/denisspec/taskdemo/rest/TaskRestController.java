package denisspec.taskdemo.rest;

import denisspec.taskdemo.model.Task;
import denisspec.taskdemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks/")
public class TaskRestController
{
    @Autowired
    private TaskService taskService;
    @RequestMapping(value = "{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> getCustomer(@PathVariable("id") Long taskId)
    {
//        if(taskId == null)
//        {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        Task task = taskService.getById(taskId);
//        if(task == null)
//        {
//            return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<Task>(task,HttpStatus.OK);
        return null;
    }
    @RequestMapping(value = "",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> saveTask(@RequestBody  Task task)
    {
        HttpHeaders headers= new HttpHeaders();
        if(task == null) {
            return new ResponseEntity<Task>(HttpStatus.BAD_REQUEST);
        }
        this.taskService.save(task);
        return new ResponseEntity<Task>(task,headers,HttpStatus.CREATED);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> updateTask(@RequestBody Task task, UriComponentsBuilder builder)
    {
        HttpHeaders headers = new HttpHeaders();
        if(task == null) {
            return new ResponseEntity<Task>(HttpStatus.BAD_REQUEST);
        }
        this.taskService.save(task);
        return new ResponseEntity<Task>(task,headers,HttpStatus.OK);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> deleteTask(@PathVariable("id") Long id)
    {
        Optional<Task> task = taskService.getById(id);
        if(task == null) {
            return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
        }
        this.taskService.delete(id);
        return new ResponseEntity<Task>(HttpStatus.NO_CONTENT);
    }
    @RequestMapping(value = "",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Task>> getAllTasks()
    {
        List<Task> tasks = this.taskService.getAll();
        System.out.println(tasks.size());
        if(tasks.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<List<Task>>(tasks,HttpStatus.OK);
    }
}
