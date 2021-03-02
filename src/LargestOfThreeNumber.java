public class LargestOfThreeNumber {
    public static void main(String[] args) {
        int a=30;
        int b=10;
        int c=20;

        if ((a>b) && (a>c)){
            System.out.println(" a is largest");
        }
        else if ((b>a) && (b>c)){
            System.out.println(" b is largest");
        }
        else{
            System.out.println(" c is largest");
        }
    }
}
