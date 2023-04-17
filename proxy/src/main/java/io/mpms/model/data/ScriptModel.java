package io.mpms.model.data;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import io.jpom.JpomApplication;
import io.jpom.model.BaseModel;
import io.jpom.system.AgentConfigBean;
import io.jpom.util.CommandUtil;

import java.io.File;

/**
 * 脚本模板
 */
public class ScriptModel extends BaseModel {

    /**
     * 最后执行人员
     */
    private String lastRunUser;
    /**
     * 最后修改时间
     */
    private String modifyTime;
    /**
     * 脚本内容
     */
    private String context;

    public String getLastRunUser() {
        return StrUtil.emptyToDefault(lastRunUser, StrUtil.DASHED);
    }

    public void setLastRunUser(String lastRunUser) {
        this.lastRunUser = lastRunUser;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}
