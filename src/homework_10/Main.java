package homework_10;

import java.util.Scanner;

import static homework_10.CheckDocument.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа (формат xxxx-yyy-xxxx-yyy-xyxy) Пример 5554-gff-3215-uyt-1a2b :");
        String documentNumber = scanner.nextLine();

        // вызов методов для обработки номера документа
        printBlocks(documentNumber);
        printMaskedDocumentNumber(documentNumber);
        printLowerCaseLetters(documentNumber);
        printUpperCaseLetters(documentNumber);
        checkForAbcSequence(documentNumber);
        checkStartsWith555(documentNumber);
        checkEndsWith1a2b(documentNumber);
    }
}

