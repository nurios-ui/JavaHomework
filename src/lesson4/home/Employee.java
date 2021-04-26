package lesson4.home;
//Класс Сотрудник
public class Employee {
    private String name;
    private String position;
    private String phoneNumber;
    private float payment;
    boolean isSalaryChanged;
    private int age;
    private int uid;

    private static int id = 0;

//Конструктор для класса Сотрудник
    public Employee (String name, String position, String phoneNumber, float payment, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.age = age;
        this.uid = ++id;
    }

//Getter'ы для вывода данных о сотрудниках
    public String getName() {
        return this.name;
    }
    public String getPosition() {
        return this.position;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public float getPayment() {
        return this.payment;
    }
    public int getAge() {
        return this.age;
    }
    String getInfo() {
        return this.uid + " " +
                this.name + ", " +
                this.age + " лет, " +
                this.position + ". Телефон: " +
                this.phoneNumber + ". Зароботная плата: " +
                this.payment + ".";
    }

    //Setter
    void setPayment (float difference) {
        this.payment = this.payment + difference;
    }
}
