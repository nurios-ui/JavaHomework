package lesson4.home;

public class Homework4 {
     //Создание классов
    public static void main (String[] args) {
        Employee employee1 = new Employee("Jack", "Developer", "+71234567890",
                89635.321f, 30);
        Employee employee2 = new Employee("John", "Tester", "+79876543210",
                71123.2f, 25);
        Employee employee3 = new Employee("Jane", "Developer", "+79876653210",
                111023.2f, 46);
        Employee employee4 = new Employee("Mark", "Tester", "+79876543987",
                91323.5f, 37);
        Employee employee5 = new Employee("Mary", "HR", "+79369543210",
                69923.8f, 21);
        //Вывод информации в консоль
        System.out.println("Имя сотрудника: " + employee1.getName() + ", Должность: " + employee1.getPosition()
                + ", Номер телефона : " + employee1.getPhoneNumber() + ", Заработная плата: " + employee1.getPayment()
                + ", Возраст: " + employee1.getAge());

        System.out.println(employee2.getInfo());


        //Массив из 5 сотрудников
        Employee[] employees = { employee1, employee2, employee3, employee4, employee5};

        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].getInfo());
            }
        }

        paymentIncrease(employees, 45, 10000);

        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].isSalaryChanged)
                System.out.println(employees[i].getInfo());
        }

    }

    //Повышение зарплаты
    private static void paymentIncrease (Employee[] employees, int age, float increment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age) {
                employees[i].setPayment(increment);
                employees[i].isSalaryChanged = true;
            }
        }
    }

}
