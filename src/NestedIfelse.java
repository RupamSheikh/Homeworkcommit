public class NestedIfelse {
    public static void main(String[] args) {
        //**Nested if else Condition
        //if(condition) { code }
        //else if(condition) { code }
        //else if(condition) { code }
        //else if(condition) { code }
        //else (condition) { code }

        // 1  -  7 ( 1=sunday 2=monday 3=tuesday 4=wednesday 5=thursday 6=friday 7=saturday) im at 53:29
        int day=7;

        if (day==1){
            System.out.println("SUNDAY");
        }
        else if(day==2){
            System.out.println("MONDAY");
        }
        else if(day==3){
            System.out.println("TUESDAY");
        }
        else if(day==4){
            System.out.println("WEDNESDAY");
        }
        else if(day==5){
            System.out.println("THURSDAY");
        }
        else if(day==6){
            System.out.println("FRIDAY");
        }
        else {
            System.out.println("SATURDAY");
        }


    }
}
