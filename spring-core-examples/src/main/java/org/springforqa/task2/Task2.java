package org.springforqa.task2;

import org.springforqa.task2.bean.TaskService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Task2 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        TaskService taskService = context.getBean("taskService", TaskService.class);
        taskService.printTasks();
    }

}
