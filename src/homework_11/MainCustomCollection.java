package homework_11;

public class MainCustomCollection {
    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>();

        collection.add("Sasha");
        collection.add("Rainbow");

        System.out.println("Element at index 0: " + collection.get(1)); // Hello
        System.out.println("Contains 'Rainbow': " + collection.contains("Rainbow")); // true

        collection.remove("Rainbow");
        System.out.println("Contains 'Rainbow' after removal: " + collection.contains("Rainbow")); // false

        collection.clear();
        System.out.println("Size after clearing: " + collection.size()); // 0
    }
}
