import java.util.Scanner;
public class ciftSayilarinToplamiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i , k = 0;
        do{
            System.out.print("Bir sayı giriniz : ");
            i=input.nextInt();
            if (i%4==0){
                k+=i;
            }

        }while (i%2==0);
        System.out.print("Çift ve 4 e bölünebilen sayıların toplamı :"+k);





    }
}
