import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

import Employee.Employee;
public class newInstance{
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner in = new Scanner(Paths.get("classname.txt"), "UTF-8");
        try{
        Employee obj = (Employee)Class.forName(in.next()).newInstance();
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
            System.out.println("a wrong type" + e.toString());
        }
    }
}