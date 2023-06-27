package io.mpms.controller;

import cn.hutool.core.util.StrUtil;
import cn.jiangzeyin.common.DefaultSystemLog;
import cn.jiangzeyin.common.JsonMessage;
import cn.jiangzeyin.controller.base.AbstractController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.jpom.common.BaseFileOpr;
import io.jpom.common.commander.AbstractSystemCommander;
import io.jpom.model.data.*;
import io.jpom.model.system.ProcessModel;
import io.jpom.model.system.SourceConfig;
import io.jpom.service.PackageInfoTemplateService;
import io.jpom.service.UserPkgPlanService;
import io.jpom.service.manage.*;
import io.jpom.service.mysqldb.DelayedTaskService;
import io.jpom.service.mysqldb.MiniSysLogService;
import io.jpom.service.mysqldb.SourceConfigService;
import io.jpom.system.AgentExtConfigBean;
import io.jpom.system.TopManager;
import io.jpom.util.CommandUtil;
import io.jpom.util.ListOper;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
// 控制代码执行顺序
@DependsOn("sourcePackageInfoConfig")
public class WelcomeController extends AbstractController {

}
