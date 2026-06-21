package week_1.design_patterns.Factory;

public class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening Excel Document");
    }    
}
