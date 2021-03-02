public class Operators {
    public static void main(String[] args) {
        //There 6 kind of operators in Java
        //** ARITHEMETIC OPERATOR
        //** RELATIONAL OPERATOR
        //** LOGICAL OPERATOR
        //** ASSIGNMENT OPERATOR
        //** INCREMENT OPERATOR
        //** DECREMENT OPERATOR



        // *****ARITHEMETIC OPERATOR*****--------  ( +  -  *  /  % ) This are Arthemetic Operators

        int a=10;
        int b=20;

        System.out.println(a+b);//30
        System.out.println(a-b);//-10
        System.out.println(a*b);//200
        System.out.println(b/a);//2
        System.out.println(a%b);//10

        // *****RELATIONAL OPERATOR*****--- ( <  >  <=  >=  ==  != ) Relational Operator only returns boolean true or false
        // Example a  b  a<b   a>b   a<=b  a>=b  a==b  a!=b
        //        10 20  True  False True  False False True

        System.out.println(a<b);//True
        System.out.println(a>b);//False
        System.out.println(a<=b);//True
        System.out.println(a>=b);//False
        System.out.println(a==b);//False
        System.out.println(a!=b);//True

        //*****LOGICAL OPERATOR*****---- ( &&  ||  ! ) Logical Operator returns boolean value True or False
        //Example x     y     (x&&y/ x and and y)  (x||y/x or y)  (!x/not x) (!y/not y)
        //        True  True   True                 True           False      False
        //        True  False  False                True           False      True
        //        False True   False                True           True       False
        //        False False  False                False          True       True

        boolean x= true;
        boolean y= false;

        System.out.println(x && y);//False
        System.out.println(x || y);//True
        System.out.println(! x );//False
        System.out.println(! y) ;//True

        //*****ASSIGNMENT OPERATOR*****---------(  =  +=  -=  *=  /= )

        int c;
        c=a;
        System.out.println(c);//10 as c=a which (a) assigned value is 10 on line# 5
        c=b;
        System.out.println(c);//20 as c=b which (b) assigned value is 20 on line# 6


        //*****INCREMENT OPERATOR*****----------( ++ )
        c=100;
        c++;//c=c+1; same as c++ This will increment by 1
        System.out.println(c);//101

        //*****DECREMENT OPERATOR******----------( -- )
        c=100;
        c--;//c=c-1; same as c-- This will decrement by 1
        System.out.println(c);//99

        c=100;
        c+=5;//c=c+5; same as c+=5 This will increment By 5
        System.out.println(c);//105

        c=100;
        c-=10;//c=c-10; same as c-=10 this will decrement by 10
        System.out.println(c);//90









    }
}
