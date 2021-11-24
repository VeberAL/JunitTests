import java.util.Scanner;

public class TriangleArea {
    //вычисление площади треугольника по высоте и основанию
    public static void main(String[] args) {

        Scanner scb = new Scanner(System.in);
        System.out.println("Вычисление площади треугольника");
        System.out.print("Введите значение основания треугольника: b = ");
        double b = scb.nextDouble();
        System.out.print("Введите значение высоты треугольника: h = ");
        double h = scb.nextDouble();

        System.out.print("Площадь треугольника: S = "+Areatr(b,h));
    }
    public static double Areatr(double b, double h){
        return 0.5 * h+b;
    }
}
