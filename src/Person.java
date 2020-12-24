import java.util.Scanner;

public class Person {
    private String name;
    private String dateOfBirth;
    private int CMND;

    public Person() {

    }

    public Person(String name, String dateOfBirth, int CMND) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.CMND = CMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;

    }


    Scanner scanner = new Scanner(System.in);
    public Person add(){
        Person person= new Person();
        System.out.println("Ten khach hang");
        String name = scanner.nextLine();
        person.setName(name);
        System.out.println("Ngay sinh");
        String dateOfBirth= scanner.nextLine();
        person.setDateOfBirth(dateOfBirth);
        System.out.println("Nhap so CMND");
        int cmnd = Integer.parseInt(scanner.nextLine());
        person.setCMND(cmnd);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", CMND=" + CMND +
                '}';
    }
}
