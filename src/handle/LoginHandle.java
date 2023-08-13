package handle;

import entities.User;
import view.Menu;
import view.MenuLoginSuccess;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginHandle {
   private Map<String, User> users = new HashMap<>();
    public void loginHandle(
            Scanner scanner, Map<String, User> users,LoginHandle loginHandle,  ForgotPassword forgotPassword, SuccessLogin successLogin,
            MenuLoginSuccess menuLoginSuccess, FunctionSuccessLogin functionSuccessLogin, Menu menu, Register register, StartProgram startProgram) {

            System.out.println("Mời bạn nhập userName: ");
            String userName = scanner.nextLine();
            if (!users.containsKey(userName)) {
                System.out.println("Sai tên đăng nhập: ");
                loginHandle.loginHandle(scanner, users, loginHandle, forgotPassword, successLogin, menuLoginSuccess, functionSuccessLogin, menu, register, startProgram);

            }


            User user = users.get(userName);
            System.out.println("Mời bạn nhập password: ");
            String password = scanner.nextLine();
            if (!user.getPassword().equals(password)) {
                System.out.println("Sai mật khẩu: ");
                while (true) {
                    System.out.println("1--Đăng nhập lại.");
                    System.out.println("2--Quên mật khẩu");
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1) {
                        loginHandle(scanner, users, loginHandle, forgotPassword, successLogin, menuLoginSuccess, functionSuccessLogin, menu, register, startProgram);
                        break;
                    } else if (choice == 2) {
                        forgotPassword.resetPassword(scanner, users, loginHandle, forgotPassword, successLogin, menuLoginSuccess, functionSuccessLogin, menu, register, startProgram);
                        break;
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }

                }
            } else {
                successLogin.successLogin(scanner, user, menuLoginSuccess, functionSuccessLogin, users, menu, loginHandle, forgotPassword, register, successLogin, startProgram);


            }
    }
}
