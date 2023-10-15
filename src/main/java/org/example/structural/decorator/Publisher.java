package org.example.structural.decorator;

import java.util.Date;

public class Publisher implements IPublisher {
    private String publishersName;
    private Date publishDate;

    public Publisher(String publishersName) {
        this.publishersName = publishersName;
        this.publishDate = new Date();
    }

    @Override
    public String getPublishersName() {
        return publishersName;
    }

    @Override
    public Date getPublishDate() {
        return publishDate;
    }

    @Override
    public void publish() {
        System.out.println("Publishing project in IFC. Publisher: " + publishersName + ". Date: " + publishDate);
    }
}
