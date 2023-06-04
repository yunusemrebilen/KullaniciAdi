import java.util.Scanner;

public class KullanciAdi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName,password ;
        System.out.print("Lütfen kullanıcı adınızı giriniz :");
        userName = scan.nextLine();
        System.out.print("Lütfen şifrenizi giriniz");
        password = scan.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Kullanıcı adı veya şifre hatalı");

        }
    }
}
