package handle;

import entities.User;
import view.Menu;
import view.MenuLoginSuccess;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Register {

    public void registerUser(Scanner scanner, Map<String, User> users, LoginHandle loginHandle, ForgotPassword forgotPassword,
                             SuccessLogin successLogin, MenuLoginSuccess menuLoginSuccess, FunctionSuccessLogin functionSuccessLogin, Menu menu, Register register, StartProgram startProgram){
        System.out.println("=======ĐIỀN THÔNG TIN NGƯỜI DÙNG======");
        System.out.println("Nhập username: ");
        String username = scanner.nextLine();

        if(users.containsKey(username)){
            System.out.println("Tên người dùng đã tồn tại!");
            return;
        }
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        for( User existingUser: users.values() ){
            if(existingUser.getEmail().equals(email)){
                System.out.println("Email đã tồn tại!");
                return;
            }
        }
        System.out.println("Nhập password: ");
        String password = scanner.nextLine();
        if(!isValidPassword(password)){
            System.out.println("Mật khẩu không hợp lệ!");
            return;
        }
        User newUser = new User(username, password, email);
        users.put(username, newUser);
        System.out.println ("Đăng ký thành công!");
        loginHandle.loginHandle(scanner, users, loginHandle, forgotPassword, successLogin, menuLoginSuccess, functionSuccessLogin,menu, register, startProgram  );

    }
    public static boolean isValidPassword(String password) {
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[.,\\-_;])[a-zA-Z.,\\-_;]{7,15}$";
        return Pattern.matches(passwordPattern, password);
    }
}
