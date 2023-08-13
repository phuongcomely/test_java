import data.DataUser;
import entities.User;
import handle.*;
import view.Menu;
import view.MenuLoginSuccess;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Map<String, User> users = new HashMap<>();
        StartProgram startProgram = new StartProgram();
        LoginHandle loginHandle = new LoginHandle();
        ForgotPassword forgotPassword = new ForgotPassword();
        Register register = new Register();
        SuccessLogin successLogin = new SuccessLogin();
        FunctionSuccessLogin functionSuccessLogin = new FunctionSuccessLogin();
        MenuLoginSuccess menuLoginSuccess = new MenuLoginSuccess();
        DataUser dataUser = new DataUser();

        dataUser.createrUser(users);



        menu.displayMenu();
        startProgram.handleSelectUser(scanner, users, loginHandle, forgotPassword, register, successLogin, functionSuccessLogin, menuLoginSuccess, menu, startProgram);

    }
}
