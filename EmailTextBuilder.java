public class EmailTextBuilder implements EmailBuilder{
    private String recipient = " ";
    private String subject = " ";
    private String body = " ";
    private String attachment ="none";

    @Override
    public EmailTextBuilder setRecipient(String recipient){
        this.recipient = recipient;
        return this;
    }

    @Override
    public EmailTextBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }

    @Override
    public EmailTextBuilder setBody(String body){
        this.body = body;
        return this;
    }

    @Override
    public EmailTextBuilder setAttachment(String attachment){
        this.attachment = attachment;
        return this;
    }

    public String getResult(){
        return "--- PREVIEW --- \n" +
               "to:" + recipient +"\n"+
               "subject:" + subject + "\n"+
                "body:" + body + "\n" +
               "attachment:" + attachment + "\n";
    }
}
