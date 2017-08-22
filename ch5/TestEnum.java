public class TestEnum{
    public static void main(String[] args) {
        Size hehe = Size.SMALL;
        Size haha = Enum.valueOf(Size.class, "LARGE");
        System.out.println(haha.toString());
        System.out.println(hehe.toString());
        System.out.println(hehe.getAbbreviation());
        System.out.println("---------");
        for(Size s: Size.values()){
            System.out.println(s);
        }
    }
}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {this.abbreviation = abbreviation;};
    public String getAbbreviation() {return abbreviation;};
    public void setAbbreviation() {this.abbreviation = abbreviation;};
};