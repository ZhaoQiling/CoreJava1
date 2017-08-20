
import java.util.Date;
public class EmployeeTest{
    public static void main(String[] args) {
        Employee john = new Employee("john");
        System.out.println(john.getSalary());
    }
}
class Employee{
    private String name;
    private double salary;
    private Date hireDay;
    {
        name = null;
        salary = 0;
        hireDay = null;
    }
    @SuppressWarnings("deprecation")
    public Employee(String name_, double salary_, int year, int month, int day){
        //error: 对this的调用必须是构造器中的第一个语句
        //System.out.println("will use another constructor");
        this(name_);
        salary = salary_;
        hireDay = new Date(year, month, day);
    }

    public Employee(String name_){
        name = name_;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public Date getHireDay()
    {
        return (Date)hireDay.clone();
    }
    public void raiseSalary(double byPercent){
        salary += salary * byPercent / 100;
    }
}