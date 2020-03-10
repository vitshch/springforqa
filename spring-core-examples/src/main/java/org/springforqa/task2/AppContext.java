package org.springforqa.task2;

import org.springforqa.task2.bean.TaskData;
import org.springforqa.task2.bean.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppContext {

    @Bean(name = "taskData")
    public TaskData taskData() {
        return new TaskData(
                Arrays.asList(
                        "Cook meals",
                        "Do English homework",
                        "Pay taxes"
                )
        );
    }

    @Bean(name = "taskService")
    public TaskService taskService(@Autowired TaskData taskData) {
        return new TaskService(taskData);
    }

}
