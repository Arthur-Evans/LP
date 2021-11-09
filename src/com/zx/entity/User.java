package com.zx.entity;


/**
 * 用户状态
 */
public class User {
    public static String nowLoginUser = "";
    public static String nowLoginNick = "";

    public static int tryLogin(String username, String password){
        /**
         * Database中查用户名和密码，并返回状态码
         * 200：登录成功
         * 404：用户名错误
         * 403：密码错误
         * 登录成功后从网站中获取nickname
         */

        String nickname = "Kototo";

        if ("mandysa".equals(username)){
            nowLoginUser = username;
            nowLoginNick = nickname;
            return 200;
        }else {
            return 404;
        }
    }

    public static int register(String username, String nickname, String password){
        /**
         * 向database中存储用户名，昵称，密码等。
         * 200：注册成功
         * 403：用户名已使用
         */
        return 200;
    }
}
