package denisspec.taskdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="task")
@Getter
@Setter
@ToString
public class Task extends BaseEntity
{
    @Column(name="title")
    private String title;
    @Column(name="content")
    private String content;
    @Column(name="dt_updated")
    private LocalDateTime dtUpdated;
}
