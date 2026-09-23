import java.util.Scanner;

public class CekDiskon {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String member;
        System.out.print("masukkan status member dalam angka (Gold, Silver, Bronze, Reguler) = ");
        member = input.nextLine();
        

        if (member.equals("Gold")) {
            System.out.println("Diskon anda : 20%");
        } else if (member.equals("Silver")) {
            System.out.println("Diskon anda : 15%");
        } else if (member.equals("Bronze")) {
            System.out.println("Diskon anda : 10%");
        } else if (member.equals("Regular")) {
            System.out.println("Maaf, anda tidak mendapatkan diskon");

        }
        input.close();
    }
}
