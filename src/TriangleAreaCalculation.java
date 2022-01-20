
import java.util.Scanner;

public class TriangleAreaCalculation {
    public static void main(String[] args) {
        // Değişkenlerimizi oluşturalım
        double a, b, c, u, area;

        // Kullanıcıdan verilerimizi alalım
        Scanner input = new Scanner (System.in);
        System.out.print("1.Kenarı giriniz :");
        a = input.nextDouble();
        System.out.print("2.Kenarı giriniz :");
        b = input.nextDouble();
        System.out.print("3.Kenarı giriniz :");
        c = input.nextDouble();

        u = (a+b+c)/2 ;
        area = Math.sqrt((u * (u - a) * (u - b) * (u - c)));
        System.out.print("Üçgenin alanı :" + area);


    }
}
