
import java.util.Scanner;


public class PatikaDevHesapMakinesi {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("1-Çarpma İşlemi\n"
                + "2-Bölme İşlemi\n"
                + "3-Toplama İşlemi\n"
                + "4-Çıkarma İşlemi\n"
                + "Lütfen Yapmak istediğiniz işlemi Seçiniz :");
        int input=scan.nextInt();
        
        switch(input){
            case 1: 
            System.out.print("Lütfen Çarpmak istediğiniz 1.sayıyı Giriniz :");
            int a=scan.nextInt();
            System.out.print("Lütfen Çarpmak istediğiniz 2.sayıyı Giriniz :");
            int b=scan.nextInt();
            int carp=a*b;
                System.out.println("Carpım Sonucu :"+carp);
            break;
            case 2:
          
            System.out.print("Lütfen Bölmek istediğiniz 1.sayıyı Giriniz :");
            int ab=scan.nextInt();
            System.out.print("Lütfen Bölmek istediğiniz 2.sayıyı Giriniz :");
            int bb=scan.nextInt();
            int bol=ab/bb;
                System.out.println("Bölüm Sonucu :"+bol);
                break;
            case 3:
                
            System.out.print("Lütfen Toplamak istediğiniz 1.sayıyı Giriniz :");
            int aa=scan.nextInt();
            System.out.print("Lütfen Toplamak istediğiniz 2.sayıyı Giriniz :");
            int ba=scan.nextInt();
            int top=aa+ba;
                System.out.println("Sayıların Toplamı Sonucu :"+top);
                break;
             
             case 4:
              
            System.out.print("Lütfen Çıkarmak istediğiniz 1.sayıyı Giriniz :");
            int say=scan.nextInt();
            System.out.print("Lütfen Çıkarmak istediğiniz 2.sayıyı Giriniz :");
            int say2=scan.nextInt();
            int cıkar=say-say2;
                System.out.println("Çıkarma işleminin Sonucu :"+cıkar);
                break;
                
                default:
                    System.out.println("Hatalı İşlem Seçimi...");
        }
            
        
        
    }
}
