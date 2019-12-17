package java_5_home_work;

public class Employee_demo {

    private static void printDotLine(int width) {
        for (int i = 1; i < width; i++) {
            System.out.print(".");
        }
        System.out.println();
    }

    private static void printEmployeeFromAge(Employee[] employee, int age) {
        for (int i = 0; i < employee.length; i++) {
            if ( employee[i].getAge() > age ) {
                employee[i].printEmployee();
                printDotLine(70);
            }
        }
    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Сидоров Егор", "директор", 54);
        employee[1] = new Employee("Карпова Юлия", "гл. бухгалтер", "gl.buh@mailbox.com", "222-222-222", 100000, 45);
        employee[2] = new Employee("Вьюнов Петр", "инженер", "vpiotr@mailbox.com", "222-221-224", 60000, 52);
        employee[3] = new Employee("Щукина Елена", "специалист", "elenaspec@mailbox.com", "222-223-225", 50000, 32);
        employee[4] = new Employee("Козлова Анна", "маркетолог", "annamarket@mailbox.com", "222-224-228", 50000, 27);

        printEmployeeFromAge( employee, 40);

    }
}
