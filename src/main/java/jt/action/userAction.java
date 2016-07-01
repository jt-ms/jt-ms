package jt.action;

import jt.utils.UtilResult;
import jt.dao.userDao;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by cutesimba on 16/6/30.
 */
@Controller
public class userAction {
    @Resource
    private userDao userDao;

    public UtilResult register(){
        UtilResult result = userDao.userRegister(name,pwd,sex);
        return result;
    }

    /*-------------------------------------------------------------*/
    private String name;
    private String pwd;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
