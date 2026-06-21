package week_1.design_patterns.Factory;

public class WordDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening Word Document");
    }    
}
