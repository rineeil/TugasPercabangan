import java.util.Scanner;
public class nilaiangka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("masukkan nilai: ");
        nilai = input.nextInt();
        input.close();


        if(nilai>=85)
        {
            System.out.println("Nilai anda: A");
        }
        else if(nilai>=70 && nilai<85){
            System.out.println("Nilai anda: B");
        }
        else if(nilai>=55 && nilai<70){
            System.out.println("Nilai anda: C");
        }
        else if(nilai>=40 && nilai<55){
            System.out.println("Nilai anda: D");
        }
        else{
            System.out.println("Nilai anda: E");
        }
    }
    
  }
