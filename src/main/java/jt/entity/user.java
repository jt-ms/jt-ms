package jt.entity;


import java.util.Date;

/**
 * Created by cutesimba on 16/6/25.
 */
public class user {
    private String user_id; // '用户ID',
    private String group_id;   //'用户组ID',
    private String user_name ;// '用户名',
    private String user_pwd ;//'用户密码',
    private Integer user_phone ;// '用户手机号码',
    private String user_sex;// '用户性别',
    private Integer user_qq ;// '用户QQ号码',
    private String user_email ;//'用户EMAIL地址',
    private String user_address ;// '用户地址',
    private Integer user_mark ;// '用户积分',
    private Integer user_rank_id;// '用户等级',
    private String user_last_login_ip ;// '用户上一次登录IP地址',
    private Integer user_birthday ;//'用户生日',
    private String user_description ;// '自我描述',
    private String user_image_url ;// '用户头像存储路径',
    private String user_school ;//'毕业学校',
    private Date user_register_time ;// '用户注册时间',
    private String user_register_ip ;// '用户注册时IP地址',
    private Integer user_last_update_time ;// '用户上次更新资料时间',
    private String user_weibo ;// '用户微博',
    private String user_blood_type ;// '用户血型',
    private String user_says ;// '用户语录',
    private Integer user_lock ;// '是否锁定，0为不锁定，1为锁定',
    private Integer user_freeze ;// '是否冻结，0为不冻结，1为冻结',
    private String user_power ;// '拥有权限',

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public Integer getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(Integer user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public Integer getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(Integer user_qq) {
        this.user_qq = user_qq;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public Integer getUser_mark() {
        return user_mark;
    }

    public void setUser_mark(Integer user_mark) {
        this.user_mark = user_mark;
    }

    public Integer getUser_rank_id() {
        return user_rank_id;
    }

    public void setUser_rank_id(Integer user_rank_id) {
        this.user_rank_id = user_rank_id;
    }

    public String getUser_last_login_ip() {
        return user_last_login_ip;
    }

    public void setUser_last_login_ip(String user_last_login_ip) {
        this.user_last_login_ip = user_last_login_ip;
    }

    public Integer getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Integer user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    public String getUser_image_url() {
        return user_image_url;
    }

    public void setUser_image_url(String user_image_url) {
        this.user_image_url = user_image_url;
    }

    public String getUser_school() {
        return user_school;
    }

    public void setUser_school(String user_school) {
        this.user_school = user_school;
    }

    public Date getUser_register_time() {
        return user_register_time;
    }

    public void setUser_register_time(Date user_register_time) {
        this.user_register_time = user_register_time;
    }

    public String getUser_register_ip() {
        return user_register_ip;
    }

    public void setUser_register_ip(String user_register_ip) {
        this.user_register_ip = user_register_ip;
    }

    public Integer getUser_last_update_time() {
        return user_last_update_time;
    }

    public void setUser_last_update_time(Integer user_last_update_time) {
        this.user_last_update_time = user_last_update_time;
    }

    public String getUser_weibo() {
        return user_weibo;
    }

    public void setUser_weibo(String user_weibo) {
        this.user_weibo = user_weibo;
    }

    public String getUser_blood_type() {
        return user_blood_type;
    }

    public void setUser_blood_type(String user_blood_type) {
        this.user_blood_type = user_blood_type;
    }

    public String getUser_says() {
        return user_says;
    }

    public void setUser_says(String user_says) {
        this.user_says = user_says;
    }

    public Integer getUser_lock() {
        return user_lock;
    }

    public void setUser_lock(Integer user_lock) {
        this.user_lock = user_lock;
    }

    public Integer getUser_freeze() {
        return user_freeze;
    }

    public void setUser_freeze(Integer user_freeze) {
        this.user_freeze = user_freeze;
    }

    public String getUser_power() {
        return user_power;
    }

    public void setUser_power(String user_power) {
        this.user_power = user_power;
    }
}
