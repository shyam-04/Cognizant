public class Main 
{
    public static void main(String[] args) 
    {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Application is running.");

        if (logger1 == logger2) 
        {
            System.out.println("Both logger instances are the same. Singleton confirmed.");
        } 
        else 
        {
            System.out.println("Different logger instances exist. Singleton failed.");
        }
    }
}