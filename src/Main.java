import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        boolean check = false;
        List list = new List();
        int n;
        do {
            try {
                System.out.println("---menu---");
                System.out.println("1. Them khach");
                System.out.println("2. Hien thi");
                System.out.println("3. Xoa");
                System.out.println("0. Thoat");
                n= Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Moi nhap lai");
                continue;
            }
            switch (n){
                case 1:
                    list.add();
                    break;
                case 2:
                    list.show();
                    break;
                case 3:
                    list.delete();
                    break;
                case 0:
                    check=true;
                    break;
            }
        }while (!check);
    }
}
