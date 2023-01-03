import java.util.Scanner;

public class main_3 {
    public static void main(String[] args) {
        text();
    }

    public static void text() {
        System.out.println("Введите то-нибудь:");
        Scanner sc = new Scanner(System.in);
        try {
            String text = sc.nextLine();
            if (text.equals("")) {

                throw new RuntimeException("Что-нибудь, кроме пустой строки :) !");
            }
        }catch (Exception e){
                throw new RuntimeException(e);
            }


    }
}