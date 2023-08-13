package handle;

import entities.User;
import view.Menu;
import view.MenuLoginSuccess;

import java.util.Map;
import java.util.Scanner;

public class SuccessLogin {
    public void successLogin(Scanner scanner, User user, MenuLoginSuccess menuLoginSuccess, FunctionSuccessLogin functionSuccessLogin, Map<String, User> users, Menu menu, LoginHandle loginHandle,
                             ForgotPassword forgotPassword, Register register, SuccessLogin successLogin, StartProgram startProgram){

        System.out.println("Chào mừng "+ user.getUserName() +", Bạn có thể thực hiện các công việc sau: ");
        menuLoginSuccess.displayMenuLogin(); //hiển thị các chức năng thực hiện sau khi đăng nhập thành công
        int choose1 = Integer.parseInt(scanner.nextLine());
        switch (choose1){
            case 1:
                functionSuccessLogin.changeUsername(scanner, users, user);
                break;
            case 2:
                functionSuccessLogin.changeEmail(scanner, users, user);
                break;
            case 3:
                functionSuccessLogin.changePassword(scanner);
                break;
            case 4:
                functionSuccessLogin.logout(scanner, menu, loginHandle, users, forgotPassword, register, successLogin , functionSuccessLogin, menuLoginSuccess, startProgram);
                break;
            case 0:
                functionSuccessLogin.exitProgram();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }
    }
}
