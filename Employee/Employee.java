package Employee;

public class Employee {
    
    public String _lastName;
    public String _firstName;
    public double _salary;

    public Employee( String FirstName, String LastName, double Salary) {
        _firstName = FirstName;
        _firstName = FirstName;
        _salary = Salary;
    }

    public void setLastName(String lastName){
            _lastName = lastName;
    }

    public String getLastName(){
        return _lastName;
    }

    public void setFirstName(String firstName){
        _firstName = firstName;
    }

    public String getFirstName(){
        return _firstName;
    }

    public void setSalary(double salary){
        if(salary > 0){
            _salary = salary;
        }
    }

    public double getSalary(){
        return _salary;
    }

    
}
