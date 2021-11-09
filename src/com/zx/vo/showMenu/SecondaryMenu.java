package com.zx.vo.showMenu;

import com.zx.entity.User;
import com.zx.vo.ShowMainBody;

import java.util.Scanner;

public class SecondaryMenu {

    private static void login(){
        String inputUserName;
        String inputPassword;
        int statusCode;

        System.out.println("请输入用户名:");
        inputUserName = new Scanner(System.in).next();

        System.out.println("请输入密码:");
        inputPassword = new Scanner(System.in).next();

        statusCode = User.tryLogin(inputUserName, inputPassword);

        switch (statusCode) {
            case 200:
                System.out.println("登录成功");
                ShowMainBody.mainMenu();
                break;
            case 403:
            case 404:
                System.out.println("用户不存在");
                PrimaryMenu.showPrimaryMenu(2);
                break;
        }
    }

    private static void register(){
        String username, nickname, password;
        int statusCode;

        System.out.println("请输入你的用户名");
        username = new Scanner(System.in).next();

        System.out.println("请输入你的昵称");
        nickname = new Scanner(System.in).next();

        System.out.println("请输入你的密码");
        password = new Scanner(System.in).next();

        statusCode = User.register(username, nickname, password);

        switch (statusCode){
            case 200:
                System.out.println("注册成功！");
                PrimaryMenu.showPrimaryMenu(2);
        }
    }

    private static void exitLogin(){
        User.nowLoginUser = "";
        User.nowLoginNick = "";
    }

    private static void userDetails(){
        int status;
        InputNormalization inputNormalization = new InputNormalization();
        System.out.println("这里是用户详细信息");
        System.out.println("--------------------------------");
        System.out.printf("用户名：%s", "s");
        System.out.println();
        System.out.printf("：%s", "s");
        System.out.println();
        System.out.printf("用户名：%s", "s");
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("0. 返回");
        System.out.println("--------------------------------");

        do {
            try {
                inputNormalization.show();
                status = inputNormalization.choice;
                break;
            }catch (Exception ignored){ }
        }while(true);

        switch (status){
            case 0:
                PrimaryMenu.showPrimaryMenu(2);
        }
    }

    public static void primaryMenu2Login(int tp){
        switch (tp) {
            case 1:
                SecondaryMenu.register();
                break;
            case 2:
                SecondaryMenu.login();
                break;
            case 3:
                ShowMainBody.mainMenu();
                break;
        }
    }

    public static void primaryMenu2IsLogin(int tp){
        switch (tp) {
            case 1:
                exitLogin();
                break;
            case 2:
                userDetails();
                break;
            case 3:
                ShowMainBody.mainMenu();
        }
    }
}
