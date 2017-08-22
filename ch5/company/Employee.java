
import java.util.Date;
public class Employee extends Person{
    private String name;
    private double salary; 
    private Date hireDay;
    //==========================================
    private static String className = "EmployeeClass"; 
    //==========================================
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
    public Employee(){
        
    }
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
    public void sayHello(){
        // super.sayHello();
        System.out.println("I am an Employee");
    }
    //==========================================
    public void sayClass(){
        System.out.println("Employee's this is " + this);
        System.out.println(this.className);
    }
    //==========================================
    public boolean equals(Object obj){
        if(this == obj)
            return true;

        if(obj == null)
            return false;

        if(getClass() != obj.getClass())
            return false;

        // if(obj instanceof Employee == false)
        //     return false;
        Employee e = (Employee) obj;
        return name == e.name;

    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.sayHello();
    }
}