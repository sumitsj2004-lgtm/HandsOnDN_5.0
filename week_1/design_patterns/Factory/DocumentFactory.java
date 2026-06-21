package week_1.design_patterns.Factory;

public class DocumentFactory {
    public static Document createDocument(String type){

        if("PDF".equals(type)) 
            return new PdfDocument();

        else if( "Word".equals(type)) 
            return new WordDocument();

        else if( "Excel".equals(type)) 
            return new ExcelDocument();

        throw new IllegalArgumentException("Unsupported document type");
    }
}
