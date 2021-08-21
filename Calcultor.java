import java.util.Scanner;
public class Calcultor {
    public static void main(String[] args) {



        //Lets do some serious work. This will be a mess of code! But.. who cares :(


        boolean go = true;
        while (go) {
            System.out.println("This is my Calculator");
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");

            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);


            int action  = num1.nextInt();

            if(action==1){     //Addition

                System.out.println("Enter The operand one: ");
                int add1 = num1.nextInt();
                System.out.println("Enter The operand Two: ");
                int add2 = num2.nextInt();
                int sum = add1+add2;
                System.out.println("The sum of "+add1+" and "+add2+" is "+sum+" !\n");
            }

            if(action==2){     //Subtraction

                System.out.println("Enter The operand one: ");
                int sub1 = num1.nextInt();
                System.out.println("Enter The operand Two: ");
                int sub2 = num2.nextInt();
                int sub = sub1-sub2;
                System.out.println("The subtraction of "+sub2+" from "+sub1+" is "+sub+" !\n");
            }


            if(action==3){     //Multiplication

                System.out.println("Enter The operand one: ");
                int mul1 = num1.nextInt();
                System.out.println("Enter The operand Two: ");
                int mul2 = num1.nextInt();
                int mul = mul1*mul2;
                System.out.println("The multiplication of "+mul1+" and "+mul2+" is "+mul+" !\n");
            }

            if(action==4){     //Division

                System.out.println("Enter The operand one: ");
                int div1 = num1.nextInt();
                System.out.println("Enter The operand Two: ");
                int div2 = num1.nextInt();
                int div = div1/div2;
                System.out.println("The division of "+div1+" and "+div2+" is "+div+" !\n");
            }


            if(action==5){
                go = false;
                System.out.println("Bye!");
            }

            System.out.println("\t\t\t\tEXIT....");

            System.out.println("Would you like to run the code again 1/[0]: ");
            int run = num2.nextInt();
            if(run == 0){
                go = false;
                System.out.println("Bye!");
            }
        }
    }
}