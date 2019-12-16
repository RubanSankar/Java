package default_package_2;

public class FFF {
    public static void main(String a[])
    {
        //final
        final int x=100;
        x=200;//Compile Time Error
        //finally
        try{
            int x=300;
        }catch(Exception e){System.out.println(e);}
        finally{System.out.println("finally block is executed");}
        //finalize
        FFF obj=new FFF();
        obj=null;
        System.gc();
    }
}
