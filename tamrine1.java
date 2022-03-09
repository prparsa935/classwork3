package tamrine2;

import java.util.Scanner;

public class tamrine1 {
    public static class Calculator{
        double First_Number;
        double Second_Number;
        String Sign;
        public Calculator(double First_Number,double Second_Number,String Sign){
            if(Sign.equals("+")||Sign.equals("-")||Sign.equals("*")||Sign.equals("/")){
                this.First_Number=First_Number;
                this.Second_Number=Second_Number;
                this.Sign=Sign;

            }

        }
        public void cal (){
            if(this.Sign.equals("+"))
                System.out.println(this.First_Number+this.Second_Number);

            else if (this.Sign.equals("-"))
                System.out.println(this.First_Number-this.Second_Number);


            else if (this.Sign.equals("*"))
                System.out.println(this.First_Number*this.Second_Number);

            else if (this.Sign.equals("/"))
                System.out.println(this.First_Number/this.Second_Number);
            else System.out.print("s");
        }



    }
    public static void main(String[] args) {
        System.out.print("pls enter first num: ");
        Scanner Sc=new Scanner(System.in);
        double First_Num=Sc.nextDouble();
        System.out.print("pls enter second num: ");
        double Second_num=Sc.nextDouble();
        System.out.print("pls enter mathematical sign that you want: ");
        Sc.nextLine();
        String Sign=Sc.nextLine();
        Calculator Cl=new Calculator(First_Num,Second_num,Sign);
        Cl.cal();

    }

}
