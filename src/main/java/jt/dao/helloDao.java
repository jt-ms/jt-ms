package jt.dao;

import jt.entity.user;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cutesimba on 16/6/25.
 */
@Repository
public class helloDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public String say(){
        return "hello,world!";
    }
    public List findALl(){
        String sql = "select * from clients_info";
        return this.jdbcTemplate.queryForList(sql);
    }
}
