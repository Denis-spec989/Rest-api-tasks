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
import java.util.Optional;

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
        assertNotNull(tRepo.findById(4L).get());
    }

    @Test
    public void testReadAll()
    {
        int size = tRepo.findAll().size();
        assertEquals(3,size);
    }
    @Test
    public void testSingleTask()
    {
        Task t = this.tRepo.findById(1L).get();
        assertEquals("First task",t.getTitle());
    }
    @Test
    public void testUpdate()
    {
        Task t = this.tRepo.findById(1L).get();
        t.setTitle("changed");
        tRepo.save(t);
        assertNotEquals("First task",tRepo.findById(1L).get().getTitle());
    }
    @Test
    public void testDelete()
    {
        tRepo.deleteById(1L);
       assertFalse(tRepo.existsById(1L));
    }


}
