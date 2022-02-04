package denisspec.taskdemo;

import denisspec.taskdemo.model.Task;
import denisspec.taskdemo.repository.TaskRepository;
import denisspec.taskdemo.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

@SpringBootTest
public class TaskTest
{
    @Autowired
    TaskRepository tRepo;

    @Test
    public void testCreate()
    {
        Task t = new Task();
        t.setTitle("test task two");
        t.setContent("test task content two");
        tRepo.save(t);
        assertNotNull(tRepo.findById(1L).get());
    }



}
