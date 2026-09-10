import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        EmailDirector director = new EmailDirector();

        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objectBuilder);
        Email welcomeEmail = objectBuilder.getResult();
        System.out.println("===== WELCOME =====");
        System.out.println(welcomeEmail);

        System.out.println();

        EmailTextBuilder textBuilder = new EmailTextBuilder();
        director.makeWelcomeEmail(textBuilder);
        String previewText = textBuilder.getResult();
        System.out.println("preview text:");
        System.out.println(previewText);
    }
}
