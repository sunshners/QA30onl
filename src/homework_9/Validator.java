package homework_9;

public class Validator {
    public static boolean validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть менее 20 символов и не содержать пробелов.");
        }

        if (password.length() >= 20 || password.contains(" ") || !containsDigit(password)) {
            throw new WrongPasswordException("Пароль должен быть менее 20 символов, не содержать пробелов и " +
                    "иметь хотя бы одну цифру.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля должны совпадать.");
        }

        return true;
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
