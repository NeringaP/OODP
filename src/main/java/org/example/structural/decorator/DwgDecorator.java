package org.example.structural.decorator;

public class DwgDecorator extends BasePublisherDecorator{

    public DwgDecorator(IPublisher wrapped) {
        super(wrapped);
    }

    @Override
    public void publish() {
        super.publish();
        System.out.println("Publishing project in DWG format. Publisher: " + super.getPublishersName() + ". Date: " + super.getPublishDate());
    }
}
