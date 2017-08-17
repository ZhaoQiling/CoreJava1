import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner in = new Scanner(Paths.get("Alice_in_Wonderland.txt"), "UTF-8");
        PrintWriter out = new PrintWriter(".\\mybook\\myAlice.txt", "UTF-8");
            while(in.hasNextLine()){
            out.print(in.nextLine());
            out.println();
        }
    }
}