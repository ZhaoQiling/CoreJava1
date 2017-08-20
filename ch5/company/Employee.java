
import java.util.Date;
public class Employee{
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
        //error: the this constructor must be in the first line.
        //System.out.println("will use another constructor");
        //this(name_);
        salary = salary_;
        hireDay = new Date(year, month, day);
    }
    // public Employee(){
        
    // }
    public Employee(String name_){
        name = name_;
    }
    public void setName(String name_){
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