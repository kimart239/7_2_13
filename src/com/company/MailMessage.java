package com.company;

public class MailMessage extends AbstractMailSalary<String>{
    public MailMessage (String from, String to, String content) {
        super(from, to, content);
    }

}
