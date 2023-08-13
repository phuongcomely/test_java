package handle;

import entities.User;
import view.Menu;
import view.MenuLoginSuccess;

import java.util.Map;
import java.util.Scanner;

public class StartProgram {
    public void handleSelectUser(Scanner scanner, Map<String, User> users, LoginHandle loginHandle, ForgotPassword forgotPassword, Register register, SuccessLogin successLogin,
                                 FunctionSuccessLogin functionSuccessLogin, MenuLoginSuccess menuLoginSuccess, Menu menu, StartProgram startProgram){
        int choose = menu.selectMenu(scanner);
        switch (choose ){
            case 1:
                loginHandle.loginHandle(scanner, users, loginHandle, forgotPassword, successLogin, menuLoginSuccess, functionSuccessLogin, menu, register, startProgram );
                break;
            case 2:
                register.registerUser(scanner, users, loginHandle, forgotPassword, successLogin, menuLoginSuccess, functionSuccessLogin, menu, register, startProgram);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }
    }
}
