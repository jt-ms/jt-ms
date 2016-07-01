package jt.dao;

import javafx.scene.input.DataFormat;
import jt.entity.user;
import jt.utils.UtilResult;
import jt.utils.UtilTools;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by cutesimba on 16/6/30.
 */
@Repository("userDao")
public class userDaoImpl implements userDao{
    @Resource
    private JdbcTemplate jdbcTemplate;


    public UtilResult checkName(String name) {
        return null;
    }
/*用户注册*/
    public UtilResult userRegister(String name, String pwd, String sex) {
        String id = UtilTools.generalUUID();
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(date);
        Date register_time = null;
        try {
            register_time = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String password = UtilTools.md5(pwd);

        user user = new user();
        user.setUser_id(id);
        user.setUser_name(name);
        user.setUser_pwd(password);
        user.setUser_sex(sex);
        user.setUser_register_time(register_time);

        UtilResult result = new UtilResult();

        String sql = "INSERT INTO jt_ms_user(user_id,user_name,user_pwd,user_sex,user_register_time)VALUES (?,?,?,?,?)";
        int flag = this.jdbcTemplate.update(sql,new Object[]{user.getUser_id(),user.getUser_name(),user.getUser_pwd(),user.getUser_sex(),user.getUser_register_time()});
        if(flag>0){
            result.setStatus(1);
            result.setMsg("注册成功");
            result.setData(id);
        }else {
            result.setMsg("未知原因,请稍后重试");
            result.setStatus(0);
        }
        return result;
    }

    public UtilResult userLogin(String name, String pwd) {
        return null;
    }
}
