import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double c;

        System.out.println("1.kenarı giriniz : ");
        a = input.nextInt();
        System.out.println("2.kenarı giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs :" + c);

        double u, h;
        u = (a+b+c)/2;
        h = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı = " + h);
    }
}
