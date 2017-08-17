public class PrintFormat{
    public static void main(String[] args){
        double dVal = -2333.333;
        int iVal = 2333;
        System.out.printf("%d\n", iVal);
        System.out.printf("%-,(11.2f", dVal);
        System.out.println();
        int a = 3; int b = 5;
        System.out.printf("%2$d %1$d\n", a, b);
    }
}