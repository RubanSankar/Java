package default_package_2;

public class Switch {
    public  static void main(String a[]){
        int i;
        for (i=0;i<10;i++)
        {
            if(i==5){
                break;//it exits from loop if condition is true
            }
            System.out.print(i);
        }
        System.out.println();
        for (int j=0;j<10;j++)
        {
            if(j==5)
            {
                continue;//skip to the next  execution when condition is true
            }
            System.out.print(j);
        }
    }
}
