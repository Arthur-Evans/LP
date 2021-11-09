package com.zx.vo;

import com.zx.vo.showMenu.PrimaryMenu;
import com.zx.vo.showMenu.InputNormalization;

public abstract class ShowMainBody {

    public static int getStartOption;

    public static void mainMenu(){

        InputNormalization showMenu = new InputNormalization();

        System.out.println("--------------------------------");
        System.out.println("1. 查看图书类型");
        System.out.println("2. 登陆与注册");
        System.out.println("3. 退出");
        System.out.println("--------------------------------");

        do{
            try{
                showMenu.show();
                getStartOption = showMenu.choice;
                break;
            }catch (Exception ignored){ }
        }while(true);

        PrimaryMenu.showPrimaryMenu();
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
