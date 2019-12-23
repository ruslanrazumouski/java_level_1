package java_5_home_work;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, int age) {
        this.fio = fio;
        this.position = position;
        this.age = age;
    }

    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printEmployee() {
        System.out.printf("Сотрудник: %s, должность: %s, возраст: %d\n", fio, position, age);
        if ( phone != null && email != null ) {
            System.out.printf("phone: %s | e-mail: %s\n", phone, email);
        }
        if ( salary != 0 ) {
            System.out.printf("оклад: %d\n", salary);
        }

    }

}

