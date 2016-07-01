package jt.dao;

import jt.utils.UtilResult;
import org.springframework.stereotype.Repository;

/**
 * Created by cutesimba on 16/6/30.
 */
public interface userDao {
    //检查用户名是否重复
    public UtilResult checkName(String name);
    //注册
    public UtilResult userRegister(String name,String pwd,String sex);
    //登录
    public UtilResult userLogin(String name,String pwd);
}
