package com.example.tasks;

import com.example.tasks.dto.TaskCreateRequest;
import com.example.tasks.model.Task;
import com.example.tasks.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    void testCreateTask() {
        TaskCreateRequest req = new TaskCreateRequest();
        req.setTitle("Test");
        req.setCompleted(false);

        Task task = taskService.create(req);

        assertNotNull(task.getId());
        assertEquals("Test", task.getTitle());
    }
}
