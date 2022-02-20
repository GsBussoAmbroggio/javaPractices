package chapter6;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();
        double area = calculator.calculateTotalArea (kitchen, bathroom);

        System.out.println("Total area is "+ area);
        scanner.close();

    }
    @Contract(" -> new")
    public static @NotNull Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }
    public double calculateTotalArea(@NotNull Rectangle rectangle1, @NotNull Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
