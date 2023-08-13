package view;

import entities.User;
import handle.*;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    public void displayMenu(){
        System.out.println("====CHÀO MỪNG BẠN ĐẾN VỚI HỆ THỐNG=====");
        System.out.println("1--Đăng nhập");
        System.out.println("2--Đăng ký");

    }
    public int selectMenu(Scanner scanner){
        do {
            System.out.println("Please choose: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("try again!");
            }
        } while (true);
    }

}
