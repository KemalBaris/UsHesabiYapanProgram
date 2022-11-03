import java.util.Scanner;
public class Main {
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Taban değerini giriniz : ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        b = input.nextInt();

        System.out.println("Sonucunuz : " + power(a,b));

    }
}