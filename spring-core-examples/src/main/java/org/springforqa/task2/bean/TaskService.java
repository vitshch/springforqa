package org.springforqa.task2.bean;

import javax.annotation.PostConstruct;

public class TaskService {

    private TaskData taskData;

    public TaskService(TaskData taskData) {
        this.taskData = taskData;
    }

    @PostConstruct
    public void initBean() {
        System.out.println("Hello");
    }

    public void printTasks() {
        taskData.getTaskList().forEach(System.out::println);
    }
}
