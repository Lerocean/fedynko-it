package lesson10;

import java.util.HashMap;

public class Account {
    private String login;
    private String password;
    private HashMap<String, String> loginPasswordMap;
    public Account() {
        loginPasswordMap = new HashMap<>();
    }

    public static class WrongLoginException extends Exception {
        public WrongLoginException(String message) {
            super(message);
        }
    }
    public static class WrongPasswordException extends Exception {
        public WrongPasswordException(String message) {
            super(message);
        }
    }
    public static class WrongLoginOrPasswordException extends Exception {
        public WrongLoginOrPasswordException(String message) {
            super(message);
        }
    }
    public void checkLogin(String inputLogin) {
            try {
                if (inputLogin.length() >= 5 && inputLogin.length() <= 20) {
                    login = inputLogin;
                } else {
                    throw new WrongLoginException("Некорректный логин. Логин должен содержать от 5 до 20 символов.");
                }
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }

    }
    public void checkPassword(String inputPassword, String confirmPassword) {
        try {
            if (inputPassword != null && confirmPassword != null) {
                if (inputPassword.length() >= 8 && inputPassword.length() <= 20) {
                    if (inputPassword.equals(confirmPassword)) {
                        password = inputPassword;
                    } else {
                        throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
                    }
                } else {
                    throw new WrongPasswordException("Некорректный пароль. Пароль должен содержать от 8 до 20 символов.");
                }
            } else {
                throw new WrongPasswordException("Пароль или подтверждение пароля равны null.");
            }
        } catch (WrongPasswordException a) {
            System.out.println(a.getMessage());
        }
    }
    public void checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException {
        String storedPassword = loginPasswordMap.get(login);
        if (storedPassword == null || !storedPassword.equals(password)) {
            throw new WrongLoginOrPasswordException("Неправильный логин или пароль");
        }
    }

    public void setPassword(String login, String password) {
        loginPasswordMap.put(login, password);
    }
    public static void main(String[] args) {
        Account account = new Account();
        account.setPassword("user1", "password1");
        account.setPassword("user2", "password2");

        String login = "user1";
        String password = "password1";

        try {
            account.checkLoginAndPassword(login, password);
            System.out.println("Вы успешно вошли в аккаунт!");
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
