import java.util.Scanner;

public class TriangleAreaHeron {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Вычисление площади треугольника по формуле Герона");
        System.out.print("Введите значение стороны треугольника: a = ");
        double a = sc.nextDouble();
        System.out.print("Введите значение стороны треугольника: b = ");
        double b = sc.nextDouble();
        System.out.print("Введите значение стороны треугольника: c = ");
        double c = sc.nextDouble();
        double p = solveP(a,b,c);
        double S = solveS(a,b,c,p);
        System.out.print("Площадь треугольника: S = "+S+" "+p);
    }

    public static double solveP(double a, double b, double c) {
        return (a+b+c)/2;
    }
    public static double solveS(double a, double b, double c, double p) {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
