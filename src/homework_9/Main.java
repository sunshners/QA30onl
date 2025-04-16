package homework_9;

public class Main {
    public static void main(String[] args) {
        try {
            boolean isValid = Validator.validateCredentials("UserName", "password1",
                    "password1");
            System.out.println("Данные валидны: " + isValid);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
