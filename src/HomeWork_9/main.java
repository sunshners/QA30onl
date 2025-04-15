package HomeWork_9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            boolean isValid = Authentication.validateCredentials("UserName", "password1",
                    "password1");
            System.out.println("Данные валидны: " + isValid);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    static class WrongLoginException extends Exception {
        public WrongLoginException() {
            super();
        }

        public WrongLoginException(String message) {
            super(message);
        }
    }

    static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
            super();
        }

        public WrongPasswordException(String message) {
            super(message);
        }
    }

    public class Authentication {

        public static boolean validateCredentials(String login, String password, String confirmPassword)
                throws WrongLoginException, WrongPasswordException {

            // Проверка логина
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Логин должен быть менее 20 символов и не содержать пробелов.");
            }

            // Проверка пароля
            if (password.length() >= 20 || password.contains(" ") || !containsDigit(password)) {
                throw new WrongPasswordException("Пароль должен быть менее 20 символов, не содержать пробелов и " +
                        "иметь " + "хотя бы одну цифру.");
            }

            // Проверка совпадения паролей
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля должны совпадать.");
            }

            return true; // Все проверки пройдены успешно
        }

        private static boolean containsDigit(String str) {
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    return true;
                }
            }
            return false;
        }
    }

}
