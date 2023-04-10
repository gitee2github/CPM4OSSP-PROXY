package io.mpms.service.mysqldb.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.jpom.service.mysqldb.DelayedTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DelayedTask)表服务实现类
 *
 * 
 * @since 2021-10-21 14:34:09
 */
@Service("delayedTaskService")
public class DelayedTaskServiceImpl implements DelayedTaskService {

    @Resource
    private DelayedTaskDao delayedTaskDao;

    private final TaskParser taskParser = new TaskParser();

    private String nodeId;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DelayedTask queryById(Integer id) {
        return this.delayedTaskDao.queryById(this.nodeId, id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DelayedTask> queryAllByLimit(int offset, int limit) {
        return this.delayedTaskDao.queryAllByLimit(this.nodeId, offset, limit);
    }

    /**
     * 新增数据
     *
     * @param delayedTask 实例对象
     * @return 实例对象
     */
    @Override
    public DelayedTask insert(DelayedTask delayedTask) {
        this.delayedTaskDao.insert(delayedTask);
        this.delayedTaskDao.setLastInsertTaskId();
        return delayedTask;
    }

    /**
     * 修改数据
     *
     * @param delayedTask 实例对象
     * @return 实例对象
     */
    @Override
    public int update(DelayedTask delayedTask) {
        return this.delayedTaskDao.update(delayedTask);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.delayedTaskDao.deleteById(this.nodeId, id) > 0;
    }

    @Override
    public List<DelayedTask> queryAllData() {
        return this.delayedTaskDao.queryAllData(this.nodeId);
    }

    @Override
    public DelayedTask getOneNotStartedTask() {
        return delayedTaskDao.queryByStatusEq0or1(this.nodeId);
    }
}