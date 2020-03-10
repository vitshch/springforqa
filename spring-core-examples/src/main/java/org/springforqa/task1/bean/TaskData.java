package org.springforqa.task1.bean;

import java.util.List;

public class TaskData {

    private List<String> taskList;

    public TaskData(List<String> taskList) {
        this.taskList = taskList;
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
