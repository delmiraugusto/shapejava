package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Shape> list = new ArrayList<Shape>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char letter = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (letter == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                Shape rectangle = new Rectangle(color, width, height);
                list.add(rectangle);
            }
            else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                Shape circle = new Circle(color, radius);
                list.add(circle);
            }
        }

        System.out.println("\nSHAPE AREAS:");
        for (Shape s : list) {
            System.out.println(String.format("%.2f", s.area()));
        }

        sc.close();
    }
}