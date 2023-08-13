package handle;

import entities.User;
import view.Menu;
import view.MenuLoginSuccess;

import java.util.Map;
import java.util.Scanner;

public class FunctionSuccessLogin {
    public void changeUsername(Scanner scanner, Map<String, User> users, User user){
        System.out.println("Nhập username mới: ");
        String newUsername = scanner.nextLine();

        if(users.containsKey(newUsername)){
            System.out.println("Tên người dùng đã tồn tại! ");
            return;
        }
        users.remove(user.getUserName());
        users.put(newUsername, user);
        user.setUserName(newUsername);
        System.out.println("Thay đổi usename thành công!");

    }
    public  void changeEmail(Scanner scanner, Map<String, User> users, User user){
        System.out.println("Nhập email mới: ");
        String newEmail = scanner.nextLine();
        if(users.containsKey(newEmail)){
            System.out.printf("Email đã tồn tại!");
            return;
        }
        users.remove(user.getEmail());
        users.put(newEmail, user);
        user.setEmail(newEmail);
        System.out.println("Thay đổi email thành công");
    }
    public void changePassword(Scanner scanner){
        System.out.println("Nhập password mới: ");
        String newPassword = scanner.nextLine();

    }
    public  void logout(Scanner scanner, Menu menu, LoginHandle loginHandle, Map<String, User> users, ForgotPassword forgotPassword, Register register, SuccessLogin successLogin, FunctionSuccessLogin functionSuccessLogin, MenuLoginSuccess menuLoginSuccess, StartProgram startProgram){
       menu.displayMenu();
       startProgram.handleSelectUser(scanner,users, loginHandle, forgotPassword, register,successLogin, functionSuccessLogin,menuLoginSuccess, menu, startProgram);

    }
    public void exitProgram(){
        System.out.println("Thoát chương trình ");
        System.exit(0);
    }

}
