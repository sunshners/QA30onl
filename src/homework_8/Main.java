package homework_8;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(4, 5);
        figures[1] = new Triangle(3, 4, 5);
        figures[2] = new Circle(3);
        figures[3] = new Rectangle(6, 7);
        figures[4] = new Triangle(5, 12, 13);

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            totalPerimeter += figure.perimeter();
        }

        System.out.println("Сумма периметров всех фигур в массиве: " + totalPerimeter);
    }
}
