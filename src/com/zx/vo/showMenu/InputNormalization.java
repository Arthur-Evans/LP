package com.zx.vo.showMenu;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNormalization {

    public int choice;

    public void show() {


        try {
            choice = new Scanner(System.in).nextInt();
        }catch (InputMismatchException inputMismatchException) {

            System.out.println("Input Error");
            throw inputMismatchException;
        }
    }
}
