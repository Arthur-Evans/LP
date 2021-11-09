package com.zx.vo.showMenu;

import com.zx.entity.User;
import com.zx.vo.ShowMainBody;

public class PrimaryMenu {

    public static int primaryChoice;

    public static void primaryMenu2(){

        InputNormalization showMenu = new InputNormalization();

        if("".equals(User.nowLoginUser)){
            System.out.println("--------当前没有登录用户-----------");
            System.out.println("1. 注册");
            System.out.println("2. 登录");
            System.out.println("3. 返回");
            System.out.println("--------------------------------");

            do{
                try{
                    showMenu.show();
                    primaryChoice = showMenu.choice;
                    break;
                }catch (Exception ignored){ }
            }while(true);

            SecondaryMenu.primaryMenu2(primaryChoice);

        }else {
            System.out.println("--------------------------------");
            System.out.printf("----当前登录的用户名为：%s--------", User.nowLoginUser);
            System.out.println("1. 退出登录");
            System.out.println("2. 查看登录者详细信息");
            System.out.println("3. 返回");
            System.out.println("--------------------------------");
        }
    }

    public static void showPrimaryMenu() {

        switch (ShowMainBody.getStartOption){
            case 1:
                System.out.println("没写完");
                break;
            case 2:
                PrimaryMenu.primaryMenu2();
                break;
            case 3:
                System.out.println("Exit Success!");
                break;

        }
    }
}
