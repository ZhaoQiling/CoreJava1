import java.math.BigInteger;
import java.util.Scanner;
public class BigInt{
    public static void main(String[] args){
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger temp = null;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 1)
            System.out.println(a);
        for(int i = 2; i < n; i++){
            temp = b;
            b = b.add(a);
            a = temp;
        }
        System.out.println(b);
    }
}