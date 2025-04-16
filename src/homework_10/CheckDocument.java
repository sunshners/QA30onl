package homework_10;

public class CheckDocument {
    public static void printBlocks(String docNumber) {
        String[] parts = docNumber.split("-");
        if (parts.length == 5) {
            System.out.printf("%s %s%n", parts[0], parts[2]);
        } else {
            System.out.println("Неверный формат номера документа.");
        }
    }

    public static void printMaskedDocumentNumber(String docNumber) {
        String masked = docNumber.replaceAll("[a-zA-Z]", "*");
        System.out.println(masked);
    }

    public static void printLowerCaseLetters(String docNumber) {
        String[] parts = docNumber.split("-");
        if (parts.length == 5) {
            String lowerCaseLetters = String.format("%s/%s/%s/%s",
                    parts[1].toLowerCase(), parts[3].toLowerCase(),
                    parts[1].toLowerCase().charAt(0), parts[3].toLowerCase().charAt(0));
            System.out.println(lowerCaseLetters);
        }
    }

    public static void printUpperCaseLetters(String docNumber) {
        StringBuilder upperCaseBuilder = new StringBuilder();
        String[] parts = docNumber.split("-");
        if (parts.length == 5) {
            upperCaseBuilder.append(parts[1].toUpperCase()).append("/");
            upperCaseBuilder.append(parts[3].toUpperCase()).append("/");
            upperCaseBuilder.append(parts[1].toUpperCase().charAt(0)).append("/");
            upperCaseBuilder.append(parts[3].toUpperCase().charAt(0));
            System.out.println("Letters: " + upperCaseBuilder.toString());
        }
    }

    public static void checkForAbcSequence(String docNumber) {
        if (docNumber.toLowerCase().contains("abc")) {
            System.out.println("Номер документа содержит последовательность 'abc'.");
        } else {
            System.out.println("Номер документа не содержит последовательность 'abc'.");
        }
    }

    public static void checkStartsWith555(String docNumber) {
        if (docNumber.startsWith("555")) {
            System.out.println("Номер документа начинается с '555'.");
        } else {
            System.out.println("Номер документа не начинается с '555'.");
        }
    }

    public static void checkEndsWith1a2b(String docNumber) {
        if (docNumber.endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на '1a2b'.");
        } else {
            System.out.println("Номер документа не заканчивается на '1a2b'.");
        }
    }

    public void main() {
    }
}
