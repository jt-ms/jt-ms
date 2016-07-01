package jt.utils;

/**密码加密*/
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
/**
 * Created by cutesimba on 16/6/30.
 */
public class UtilTools {
    public static String md5(String pwd){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] input = pwd.getBytes();//密码转换为字节数组
            byte[] output = md5.digest(input);//字节数组转换为MD5字节
            return Base64.encodeBase64String(output);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
    public static String generalUUID(){
        UUID id = UUID.randomUUID();
        return id.toString();
    }
}
