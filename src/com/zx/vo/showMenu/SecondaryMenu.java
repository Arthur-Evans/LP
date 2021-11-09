package com.zx.vo.showMenu;

import com.zx.entity.User;
import com.zx.vo.ShowMainBody;

import java.util.Scanner;

public class SecondaryMenu {

    public static void login(){
        String inputUserName;
        String inputPassword;
        int statusCode;

        System.out.println("请输入用户名");
        inputUserName = new Scanner(System.in).next();

        System.out.println("请输入密码");
        inputPassword = new Scanner(System.in).next();

        statusCode = User.tryLogin(inputUserName, inputPassword);
    }

    public static void primaryMenu2(int tp){
        switch (tp){
            case 1:
                break;
            case 2:
                SecondaryMenu.login();
                break;
            case 3:
                ShowMainBody.mainMenu();
                break;
        }
    }
}
