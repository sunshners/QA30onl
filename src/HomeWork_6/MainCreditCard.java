package HomeWork_6;

public class MainCreditCard {
        public static void main(String[] args) {
            // Создание трех объектов класса CreditCard
            CreditCard.creditCard card1 = new CreditCard.creditCard("7148-8653-2200-1252", 1779.0);
            CreditCard.creditCard card2 = new CreditCard.creditCard("3300-8545-9632-0214", 4366.75);
            CreditCard.creditCard card3 = new CreditCard.creditCard("4585-0022-3663-9999", 100.17);

            // Тестовый сценарий
            card1.deposit(354.0); // Пополнение первой карточки
            card2.deposit(900.7); // Пополнение второй карточки
            card3.withdraw(98.0); // Снятие со третьей карточки

            // Вывод текущего состояния всех трех карточек
            System.out.println("Текущее состояние карточек:");
            card1.displayInfo();
            card2.displayInfo();
            card3.displayInfo();
        }
    }
