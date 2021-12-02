package com.company;

public abstract class AbstractMailSalary<T> {
    private String from;
    private String to;
    private T content;

    public AbstractMailSalary (String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getTo() {
        return to;
    }
    public String getFrom() {
        return from;
    }
    public T getContent() {
        return content;
    }

}
