import java.util.ArrayList;
import java.util.Scanner;

public class List {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Hotel>arrayList= new ArrayList();
    Person person = new Person();

    public void add(){
        Hotel hotel = new Hotel();
        hotel.setPerson(person.add());
        System.out.println("Nhap so ngay tro");
        int day = Integer.parseInt(scanner.nextLine());
        hotel.setDay(day);
        System.out.println("Nhap loai phong tro");
        String type = scanner.nextLine();
        hotel.setType(type);
        System.out.println("Nhap gia phong");
        double pirce = Double.parseDouble(scanner.nextLine());
        hotel.setMoney(pirce);
        arrayList.add(hotel);

    }
    public void show(){
        for (Hotel p:arrayList) {
            if (p instanceof Hotel){
                System.out.println(p.toString());
            }
//            System.out.println("Ten: "+p.getPerson().getName());
//            System.out.println("Ngay sinh: "+ p.getPerson().getDateOfBirth());
//            System.out.println("So CMND: "+p.getPerson().getCMND());
//            System.out.println("Ngay tro: "+p.getDay());
//            System.out.println("Loai phong tro: "+p.getType());
//            System.out.println("Gia phong tro: "+p.getMoney());
//            System.out.println();
//            System.out.println();

        }
    }
    public void delete(){
        Hotel hotel;
        System.out.println("Nhap ten khach hàng muon xoa");
        String name = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (name.equals(arrayList.get(i).getPerson().getName())){
                hotel=arrayList.remove(i);
                System.out.println("Khach hang vua xoa la: "+hotel.getPerson().getName());
            }else {
                System.out.println("Khong co ten khach hang muon  xoa: ");
            }
        }
    }
}
