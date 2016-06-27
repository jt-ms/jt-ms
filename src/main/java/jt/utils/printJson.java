package jt.utils;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.JSONObject;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;
import java.util.List;
/**
 * Created by cutesimba on 16/6/25.
 */
public class printJson {
    protected final void printJsonList(List list){
        JSONArray jsonstr = JSONArray.fromObject(list);
        String jsonStr= jsonstr.toString();
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().print(jsonstr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
