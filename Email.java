public class Email {
    private final String recipient;
    private final String subject;
    private final String body;
    private final String attachment;

    Email(String recipient, String subject, String body, String attachment) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.attachment = attachment;
    }

    public String getRecipient() { return recipient; }
    public String getSubject() { return subject; }
    public String getBody() { return body; }
    public String getAttachment() { return attachment; }

    @Override
    public String toString() {
        return "Email to =" + recipient + ", Subject ='" + subject + "', Body ='" + body + "', Attachment =" + attachment;
    }

}