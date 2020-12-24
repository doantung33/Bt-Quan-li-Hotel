public class Hotel {
    private int day;
    private String type;
    private double money;
    private Person person;

    public Hotel() {

    }

    public Hotel(int day, String type, double money, Person person) {
        this.day = day;
        this.type = type;
        this.money = money;
        this.person = person;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    @Override
    public String toString() {
        return "Hotel [ " +
                "name= "+person.getName()+
                " , dateOfBirth= "+person.getDateOfBirth()+
                " , CMND= "+person.getCMND()+
                " , day=" + day +
                " , type= " + type +
                " , money=" + money + " ]";
    }
}
