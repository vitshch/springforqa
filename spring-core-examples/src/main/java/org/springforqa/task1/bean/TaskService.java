package org.springforqa.task1.bean;

public class TaskService {

    private TaskData taskData;

    public TaskService(TaskData taskData) {
        this.taskData = taskData;
    }

    public void initBean() {
        System.out.println("Hello");
    }

    public void printTasks() {
        taskData.getTaskList().forEach(System.out::println);
    }
}
