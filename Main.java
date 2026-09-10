import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmailDirector director = new EmailDirector();

        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objectBuilder);
        Email welcomeEmail = objectBuilder.getResult();
        System.out.println("===== WELCOME =====");

        EmailTextBuilder textBuilder = new EmailTextBuilder();
        director.makeWelcomeEmail(textBuilder);
        String previewText = textBuilder.getResult();
        System.out.println(previewText);
    }
}