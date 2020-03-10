package org.springforqa.task1;

import org.springforqa.task1.bean.TaskService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTask.xml");
        TaskService taskService = context.getBean("taskService", TaskService.class);
        taskService.printTasks();
    }

}
