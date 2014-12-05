package by.htp.krozov.sample.figures;

import by.htp.krozov.sample.figures.model.Circle;
import by.htp.krozov.sample.figures.model.Figure;
import by.htp.krozov.sample.figures.model.Point;
import by.htp.krozov.sample.figures.model.Rectangle;
import by.htp.krozov.sample.figures.model.Square;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(new Point(2, 5), new Point(10, 1)),
                new Square(new Point(4, 4), 10),
                new Circle(new Point(0, 0), 20)
        };

        for (Figure figure : figures) {
            print(figure);
            System.out.println();
        }
    }

    private static void print(Figure figure) {
        System.out.printf("Name:%s\n\tperimeter: %.2f\n\tsquare: %.2f",
                          figure.getName(), figure.perimeter(), figure.square())
                .println();
        if (figure instanceof Square) {
            Rectangle rectangle = (Rectangle) figure;
            System.out.printf("\tdiagonal length: %.2f\n", rectangle.getDiagonal().length());
        } else if (figure instanceof Circle) {
            Circle circle = (Circle) figure;
            System.out.printf("\tdiameter: %.2f\n", circle.getDiameter());
        }
    }
}
