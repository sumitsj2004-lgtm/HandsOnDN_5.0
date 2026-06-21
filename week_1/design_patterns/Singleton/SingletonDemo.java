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