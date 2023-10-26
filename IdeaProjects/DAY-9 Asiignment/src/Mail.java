import java.util.Date;


public class Mail {
    private long id;
    private String to;
    private String from;
    private String subject;
    private String content;

    public Mail(long id, String to, String from, String subject, String content, Date receivedDate, Double size) {
        this.id = id;
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.content = content;
        this.receivedDate = receivedDate;
        this.size = size;
    }

    private Date receivedDate;
    Double size;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }
}
