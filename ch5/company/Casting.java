public class Casting{
    public static void main(String[] args){
        Employee staff = new Manager();
        //ClassCastException: Employee cannot be cast to Manager
        //Manager staff1 = (Manager)(new Employee());
        Manager staff1 = (Manager)staff;
        System.out.println(new Manager() instanceof Employee);
        System.out.println(new Employee() instanceof Manager);
    }
}