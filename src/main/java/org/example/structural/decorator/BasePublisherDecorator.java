package org.example.structural.decorator;

import java.util.Date;

public abstract class BasePublisherDecorator implements IPublisher{
    private final IPublisher wrapped;

    public BasePublisherDecorator(IPublisher wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void publish() {
        wrapped.publish();
    }

    @Override
    public String getPublishersName() {
        return wrapped.getPublishersName();
    }

    @Override
    public Date getPublishDate() {
        return wrapped.getPublishDate();
    }
}
