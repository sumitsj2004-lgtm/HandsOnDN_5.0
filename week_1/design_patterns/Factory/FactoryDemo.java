package week_1.design_patterns.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Document doc = DocumentFactory.createDocument("PDF");
        doc.open();
    }
}
