package io.mpms.service.manage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.jpom.model.TaskQueueModel;
import io.jpom.model.data.DelayedTask;

import java.util.ArrayList;
import java.util.List;

public class TaskParser {
    private static volatile TaskParser taskParserInstance;

    private static final TaskQueueModel taskQueue = TaskQueueModel.getInstance();

    public TaskParser() {

    }
}
