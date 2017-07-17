package com.dharbor.set.share.share.data.dto;

/**
 * author rloayza
 */
public class Message {

    private String body;

    private String subject;

    private Integer fromUserId;

    private Integer [] recipients;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Integer[] getRecipients() {
        return recipients;
    }

    public void setRecipients(Integer[] recipients) {
        this.recipients = recipients;
    }
}
