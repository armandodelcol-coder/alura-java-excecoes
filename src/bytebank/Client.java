package bytebank;

public class Client {

    private String name;
    private String document;
    private String occupation;

    public Client(String name, String document, String occupation) {
        this.name = name;
        this.document = document;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

}
