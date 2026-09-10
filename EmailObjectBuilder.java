

public class EmailObjectBuilder implements EmailBuilder {
    private String recipient;
    private String subject;
    private String body;
    private String attachment;

    @Override
    public EmailObjectBuilder setRecipient(String recipient) {
    this.recipient = recipient;
    return this;
    }

    @Override
    public EmailObjectBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }

    @Override
    public EmailObjectBuilder setBody(String body){
        this.body = body;
        return this;
    }

    @Override
    public EmailObjectBuilder setAttachment(String attachment){
        this.attachment = attachment;
        return this;
    }

    public Email getResult(){
        validate();
        return new Email(recipient, subject, body, attachment);
    }

    private void validate(){
        if(recipient == null || recipient.isBlank()){
            throw new  IllegalStateException("Recipient is null or empty");
        }
        if(subject == null || subject.isBlank()){
            throw new IllegalStateException("Subject is null or empty");
        }
    }
}
