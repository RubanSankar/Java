package default_package_2;

import java.util.*;
import java.util.regex.Pattern;

public class Exha {
    void arithmetic_Exception()
    {
        try{

            int Numerator,Dinominator,Answer;
            Scanner obj= new Scanner(System.in);
            System.out.println("Enter the Numerator ");
            Numerator=obj.nextInt();
            System.out.println("Enter the Denominator ");
            Dinominator=obj.nextInt();
            Answer=Numerator/Dinominator;
            System.out.println("The Answer is "+ Answer);

        }catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("You wont divide Anything by zero Because its infinite Its a Arithmetic Exception");



        }
        System.out.println("1 - Arithmetic Exception\n2 - Null Pointer Exception\n3 - Array IndexOutOfBounds Exception\n4 - Array IndexOutOfBounds ExceptionArraylist\n5 - String IndexOutOfBounds Exception ");

    }

    void nullPointerException()
    {
        try {
            System.out.println("String name=null;  \n System.out.println(name.length()");
            String name=null;
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
            System.out.println("the string has nothing in it then how can we defind the length of that string so Its an NullPointerexception ");

        }
        System.out.println("1 - Arithmetic Exception\n2 - Null Pointer Exception\n3 - Array IndexOutOfBounds Exception\n4 - Array IndexOutOfBounds ExceptionArraylist\n5 - String IndexOutOfBounds Exception ");

    }
    void arrayIndexOutOfBoundsException()
    {
        try
        {
            System.out.println("int array[]=new int[5];  \n array[10]=50;\n");
            int array[]=new int[5];
            array[10]=50;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("There is only 5 spaces are aloocated for array,but we tried to access 10 th index of array so Its ArrayIndexOutOfBoundsException ");

        }
        System.out.println("1 - Arithmetic Exception\n2 - Null Pointer Exception\n3 - Array IndexOutOfBounds Exception\n4 - Array IndexOutOfBounds ExceptionArraylist\n5 - String IndexOutOfBounds Exception ");

    }
    void numberformatexception(){
        try {
            System.out.println("int num = Integer.parseInt (\"akki\") ; ");

            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println(e);
            System.out.println("Akki is  not an number its an string");
        }

    }
    void nullpointerexception()
    {
        try
        {
            Object obj = null;
            obj.toString();
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            System.out.println("obj pointing to Null value so it cannot be converted into String");
        }

    }
    void inputmixmatchexception() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your age in Numbers: ");
            int age1 = input.nextInt();
            if (age1 > 20) {
                System.out.println("You are above 20");
            } else {
                System.out.println("You are age is lesser than 20");
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("The input is must be an ");
        }
    }
        void arraystore()
    {
            try {
                System.out.println("Object x[] = new String[3];\n x[0] = new Integer(0);");
                Object x[] = new String[3];
                x[0] = new Integer(0);
            }
            catch(ArrayStoreException e)
            {
                System.out.println(e);
                System.out.println("An attempt has been made to store the wrong type of object into an array of objects ");
            }


    }

    public static void main(String[] args) {
        String option;
        int loop=0;
        Exha clsobj=new Exha();
        Scanner obj= new Scanner(System.in);
        System.out.println("select the the Exception to perform ");
        System.out.println("1 - Arithmetic Exception\n2 - Null Pointer Exception\n3 - Array IndexOutOfBounds Exception\n4 - Numberformatexception\n5 - Null Pionter Exception \n6 - Input Mismatch Exception \n7 - Array Store Exception");

        while(loop!=1)
        {
            option = obj.nextLine();
            if(Pattern.matches("[0-7]{1}", option))
            {

                switch(option)
                {
                    case "1":
                        clsobj.arithmetic_Exception();
                        break;
                    case "2":
                        clsobj.nullPointerException();
                        break;
                    case "3":
                        clsobj.arrayIndexOutOfBoundsException();
                        break;
                    case "4":
                        clsobj.numberformatexception();
                        break;
                    case "5":
                        clsobj.nullpointerexception();
                        break;
                    case "6":
                        clsobj.inputmixmatchexception();
                        break;
                    case"7":
                        clsobj.arraystore();
                        break;
                    case"0":
                        loop=1;
                        break;
                    default:
                        System.out.println("Invalid Input");


                }
            }
            else
            {
                System.out.println("Invalid input");
            }
        }


    }

}

