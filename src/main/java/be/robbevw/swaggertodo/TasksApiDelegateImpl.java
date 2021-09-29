package be.robbevw.swaggertodo;

import be.robbevw.swaggertodo.api.TasksApiDelegate;
import be.robbevw.swaggertodo.models.Task;
import be.robbevw.swaggertodo.models.TasksBody;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TasksApiDelegateImpl implements TasksApiDelegate {
    @Override
    public ResponseEntity<List<Task>> tasksGet() {
        Task task = new Task();
        task.setTitle("Title of this task");
        task.setDescription("Description of this task");
        task.setDeadline("30/09/2021T12:00");

        return ResponseEntity.ok(Arrays.asList(task, task));
    }

    @Override
    public ResponseEntity<Task> tasksIdGet(BigDecimal id) {
        if (!id.equals(BigDecimal.TEN)) {
            return ResponseEntity.notFound()
                    .build();
        }

        Task task = new Task();
        task.setTitle("Title of this task, filtered by ID");
        task.setDescription("Description of this task, filtered by ID");
        task.setDeadline("30/09/2021T12:00");

        return ResponseEntity.ok(task);
    }

    @Override
    public ResponseEntity<Void> tasksPost(TasksBody body) {
        return null;
    }
}
