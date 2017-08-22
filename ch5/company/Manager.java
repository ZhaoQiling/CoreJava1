public class Manager extends Employee{
    private double bonus;
    //==========================================
    private static String className = "ManagerClass"; 
    //==========================================
    public Manager(){

    }
    public Manager(String name_){
        this();
        super.setName(name_);
    }
    public void setBonus(double bonus_){
        bonus = bonus_;
    }
    public double getBonus(){
        return bonus;
    }
    //==========================================
    public void sayClass(){
        super.sayClass();
        System.out.println("Manager's this is " + this);
        System.out.println(className);
    }
    //==========================================
    public static void main(String[] args) {
        new Manager().sayClass();
    }
}