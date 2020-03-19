package loose.oose.fis.documents;

public class DocumentNou extends Document{
    public DocumentNou(String[] continut) {
        super(continut);
    }
    public String[] analizeaza(){
        return "Document nou " + continut;
    }
}