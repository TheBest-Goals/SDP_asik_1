public class EmailDirector {
    public void makeWelcomeEmail(EmailBuilder builder) {
        builder.setRecipient("kto_to@primer.com")
                .setSubject("dobro pozhalovat/Welcome!")
                .setBody("Ty for registering. Nice to meet u Teacher!")
                .setAttachment("guide.pdf");
    }

    public void PasswordResetEmail(EmailBuilder builder) {
        builder.setRecipient("kto_to@primer.com")
                .setSubject("Password Reset!")
                .setBody("click for the reset ur password")
                .setAttachment(null);
    }
}
