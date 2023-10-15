package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        String publishersName = "Sarah";

        IPublisher publisher = new PdfDecorator(
                new Publisher(publishersName)
        );

        IPublisher secondPublisher = new DwgDecorator(
                new PdfDecorator(
                new Publisher(publishersName)
                )
        );

        publisher.publish();
        System.out.println();
        secondPublisher.publish();
    }
}
