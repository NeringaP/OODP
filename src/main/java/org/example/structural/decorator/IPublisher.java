package org.example.structural.decorator;

import java.util.Date;

public interface IPublisher {
    String getPublishersName();

    Date getPublishDate();

    void publish();
}
