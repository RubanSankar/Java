package default_package_2;

public class UseConstructor {
        int  value1;
        int  value2;
        UseConstructor(){
            value1 = 10;
            value2 = 20;
            System.out.println("Inside Constructor");
        }

        public void display(){
            System.out.println("Value1 === "+value1);
            System.out.println("Value2 === "+value2);
        }

        public static void main(String args[]){
            UseConstructor d1 = new UseConstructor();
            d1.display();
        }
    }
}
