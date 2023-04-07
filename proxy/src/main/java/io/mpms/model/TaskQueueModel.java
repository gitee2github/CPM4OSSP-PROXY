/*
 *耗时任务队列实体类
 *
 * 
 
 */

package io.mpms.model;

import io.jpom.model.data.DelayedTaskModel;

import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

public class TaskQueueModel {


    private static volatile TaskQueueModel taskQueueInstance;

    private TaskQueueModel() {

    }

    public static TaskQueueModel getInstance() {
        if (taskQueueInstance == null) {
            synchronized (TaskQueueModel.class) {
                if (taskQueueInstance == null) {
                    taskQueueInstance = new TaskQueueModel();
                }
            }
        }

        return taskQueueInstance;
    }

    /*
     * 任务队列
     */
    private final PriorityBlockingQueue<DelayedTaskModel> taskModels = new PriorityBlockingQueue<>();

    private DelayedTaskModel findTask(Integer id) {

        for (DelayedTaskModel item : taskModels) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public boolean addTask(DelayedTaskModel task) {
        task.setTaskStatus(0);
        return taskModels.offer(task);
    }

    public DelayedTaskModel getTask(Integer id) {
        return findTask(id);
    }
}
