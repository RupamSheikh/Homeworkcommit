public class ContinueStatement {
    public static void main(String[] args) {
        //Usage of continue statement

        for (int i=1; i<=10; i++){
            if (i==5){              //1 2 3 4 6 7 8 9 10
                continue;
            }
            System.out.println(i);
        }

    }
}
