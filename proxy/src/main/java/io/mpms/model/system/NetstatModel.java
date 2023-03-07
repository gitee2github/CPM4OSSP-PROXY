package io.mpms.model.system;

import cn.hutool.core.util.StrUtil;
import io.jpom.model.BaseJsonModel;

/**
 * 网络端口信息实体
 */
public class NetstatModel extends BaseJsonModel {
    private String protocol;
    private String receive = StrUtil.DASHED;
    private String send = StrUtil.DASHED;
    private String local;
}
