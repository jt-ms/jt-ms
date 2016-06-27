package jt.action;

import jt.dao.helloDao;
import jt.entity.user;
import jt.utils.printJson;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

import java.util.List;

import static com.opensymphony.xwork2.Action.NONE;

/**
 * Created by cutesimba on 16/6/25.
 */
@Controller
public class helloAction extends printJson {
    @Resource
    private helloDao dao;
    private String msg;

    public String execute(){
        msg = dao.say();
        return "success";
    }

    public String findAll(){
        List list = dao.findALl();
        this.printJsonList(list);
        return NONE;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
