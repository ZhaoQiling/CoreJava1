class Employee{
    private String name;
    private int id;
    public Employee(){

    }
    public Employee(String n, int i){
        name = n;
        id = i;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name.clone();
    }
}