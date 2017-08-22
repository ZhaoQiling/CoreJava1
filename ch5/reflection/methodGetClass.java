import Employee.Employee;
public class methodGetClass{
    public static void main(String... args) {
        //val.getClass();
        Employee trump = new Employee("TRUMP");
        Class ct = trump.getClass();
        System.out.println(ct.toString());
        System.out.println(ct.getName());

        //Class.forName(String className);
        String className = "Employee.Employee";
        try{
        Class cl = Class.forName(className);
        }catch(ClassNotFoundException e){

        }  
    
        //type.class
        System.out.println(int.class.getName());
        System.out.println(Double[].class.getName());   
    }
}