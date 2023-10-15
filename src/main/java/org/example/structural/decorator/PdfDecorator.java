package org.example.structural.decorator;

public class PdfDecorator extends BasePublisherDecorator{

    public PdfDecorator(IPublisher wrapped) {
        super(wrapped);
    }

    @Override
    public void publish() {
        super.publish();
        System.out.println("Publishing project in PDF. Publisher: " + super.getPublishersName() + ". Date: " + super.getPublishDate());
    }
}
