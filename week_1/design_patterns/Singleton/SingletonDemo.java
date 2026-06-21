class SingletonDemo
{
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Logger 1 message");
        l2.log("Logger 2 message");

        if(l1==l2)
            System.out.println("Same reference");
    }
}






























// public class SingletonDemo {
//     public static void main(String[] args) {
//         // Attempt to get two instances of the Logger
//         Logger logger1 = Logger.getInstance();
//         Logger logger2 = Logger.getInstance();

//         // Use the logger
//         logger1.log("Application started.");
//         logger2.log("Processing data...");

//         // Verify that both references point to the exact same object in memory
//         System.out.println("\n--- Singleton Verification ---");
//         if (logger1 == logger2) {
//             System.out.println("Success: Both logger1 and logger2 are the same instance.");
//         } else {
//             System.out.println("Failure: Different instances were created.");
//         }
//     }
// }