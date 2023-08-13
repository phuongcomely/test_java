package handle;

import entities.User;
import view.Menu;
import view.MenuLoginSuccess;

import java.util.Map;
import java.util.Scanner;

public class ForgotPassword {
    public void resetPassword(Scanner scanner, Map<String, User> users, LoginHandle loginHandle, ForgotPassword forgotPassword, SuccessLogin successLogin, MenuLoginSuccess menuLoginSuccess,
                              FunctionSuccessLogin functionSuccessLogin, Menu menu, Register register, StartProgram startProgram){
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        for(User user: users.values()){
            if(user.getEmail().equalsIgnoreCase(email)){
                System.out.println("Email hợp lệ: ");
                System.out.println("Nhập pass mới: ");
                String newPassword = scanner.nextLine();
                user.setPassword(newPassword);
                System.out.println("Đổi mật khẩu thành công!");
                loginHandle.loginHandle(scanner, users,loginHandle, forgotPassword, successLogin, menuLoginSuccess, functionSuccessLogin, menu, register , startProgram);
                return;
            }
        }
        System.out.println("email chưa tồn tại!");
    }
}
