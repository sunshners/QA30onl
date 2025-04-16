package homework_7;

public class MainPhone {
    public static void main(String[] args) {
        // Создание трех экземпляров класса Phone
        Phone.PhoneStatic phoneStatic1 = new Phone.PhoneStatic("655-855-0212", "Model S", 150.0);
        Phone.PhoneStatic phoneStatic2 = new Phone.PhoneStatic("987-002-7475", "Model T");
        Phone.PhoneStatic phoneStatic3 = new Phone.PhoneStatic();

        // Вывод значений переменных
        phoneStatic1.displayInfo();
        phoneStatic2.displayInfo();
        phoneStatic3.displayInfo();

        // Вызов метода ReceiveCall для каждого объекта
        phoneStatic1.ReceiveCall("Susan");
        phoneStatic2.ReceiveCall("Garry");
        phoneStatic3.ReceiveCall("Chloe");

        // Вызов перегруженного метода ReceiveCall
        phoneStatic1.ReceiveCall("Susan", phoneStatic1.getNumber());
        phoneStatic2.ReceiveCall("Garry", phoneStatic2.getNumber());

        // Вызов метода sendMessage
        Phone.PhoneStatic.sendMessage(phoneStatic1.getNumber(), phoneStatic2.getNumber());
    }
}
