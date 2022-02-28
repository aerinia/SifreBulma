import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz:");
        String userName = s.nextLine();
        System.out.print("Şifrenizi giriniz:");
        String sifre = s.nextLine();
        if(userName.equals("patikaDev")&& sifre.equals("java1234")){
            System.out.print("Giriş başarılı.!");
        }
        else if(!userName.equals("patikaDev")&&sifre.equals("java1234")){
            System.out.print("Kullanıcı bulunamadı.");


        }
        else{
            System.out.print("Şifre yanlış.Tekrar deneyiniz ya da şifrenizi değiştirmek için C'ye basınız.");
            String choice=s.nextLine();
            if(choice.equals("c")||choice.equals("C")){
                System.out.print("Yeni şifrenizi giriniz.");
                String sifreNew=s.nextLine();
                if(sifreNew.equals("java1234")){
                    System.out.print("Şifeniz eskisiyle aynı olamaz.");
                }
                else{
                    System.out.print("Şifreniz değiştirildi.Tekrar giriş yapın.");
                }
            }
            else{
                System.out.print("Yanlış işlem anasayfaya dönünüz.");
            }
        }
    }
}
