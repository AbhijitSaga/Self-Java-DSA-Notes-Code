
public class Main {
    public static void main(String[] args)
    {
        String s = new String("RR");
        s = null;
        Main st = new Main();

        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");

    }

    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overridden");
    }


}





