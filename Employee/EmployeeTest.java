package Employee;

public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Abayomi", "Ernest", 3);
        Employee emp2 = new Employee("Abayomi2", "Ernest2", 5);

        double emp1SalaryIncrease = (emp1.getSalary() + emp1.getSalary() * 10/100) * 12;
        double emp2SalaryIncrease = (emp2.getSalary() +  emp2.getSalary() * 10/100) * 12;

        System.out.printf("%s with a monthly salary of %.2f has a salary increase of %.2f%n%n",emp1._firstName,emp1._salary,  emp1SalaryIncrease);
       System.out.printf("%s with a monthly salary of %.2f has a salary increase of %.2f",emp2._firstName,emp2._salary, emp2SalaryIncrease);

    }
}
