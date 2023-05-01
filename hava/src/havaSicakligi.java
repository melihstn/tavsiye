import java.util.Scanner;

public class havaSicakligi {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("sıcaklık değeri giriniz : ");
        sicaklik = input.nextInt();

        if(sicaklik < 5) {
            System.out.println("kayak yapınız");
        } else if (sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("sinemaya gidebilirsiniz");
            }
            if (sicaklik >= 10) {
                System.out.println("go to picnic");
            }
        } else {
            System.out.print("go to swiming");
        }

    }
}
