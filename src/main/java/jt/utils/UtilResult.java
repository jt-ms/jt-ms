package jt.utils;

/**
 *返回结果封装
 * Created by cutesimba on 16/6/30.
 */

public class UtilResult {
    private int status;//状态:1代表成,0代表失败
    private String msg;//返回状态信息
    private Object data;//返回数据

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
