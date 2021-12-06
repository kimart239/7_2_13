package com.company;

import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<AbstractMailSalary<T>> {

    HashMap<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        public List<T> get(Object key) {
            return getOrDefault(key, new LinkedList<>());
        }
    };

    @Override
    public void accept(AbstractMailSalary<T> mail) {
        String to = mail.getTo();
        List<T> list = mailBox.get(to);
        list.add(mail.getContent());
        mailBox.put(to, list);
    }

    public HashMap<String, List<T>> getMailBox() {
        return mailBox;
    }


/*
    Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
          */
/*
            if (containsKey(key)) {
                return (List<T>) super.getOrDefault(key, null);
            } else {
                List<T> list = new LinkedList<>();
                mailBox.put((String) key, list);
                return list;
            }

           *//*

        }
    };


    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(AbstractMailSalary<T> abstractMailSalary) {
        List<T> list = mailBox.get(abstractMailSalary.getTo());
        if (list == null) {
            list = new ArrayList<>();
            mailBox.put(abstractMailSalary.getTo(), list);
        }
        list.add(abstractMailSalary.getContent());
    }
*/


}
