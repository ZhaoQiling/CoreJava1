import java.time.LocalDate;
public class Date_LocalDate{
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        ld = ld.plusDays(100);
        System.out.println(ld);
        System.out.println(ld.isLeapYear());
        System.out.println(ld.getDayOfYear());
    }
}