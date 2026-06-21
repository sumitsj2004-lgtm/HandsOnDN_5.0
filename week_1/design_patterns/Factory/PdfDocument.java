package week_1.design_patterns.Factory;

public class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening PDF Document");
    }    
}
