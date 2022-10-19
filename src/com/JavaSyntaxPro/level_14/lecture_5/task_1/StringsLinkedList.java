package com.JavaSyntaxPro.level_14.lecture_5.task_1;


public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringsLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node firstElement = new Node();
        firstElement.value = value;

        Node secondElement = last.prev;
        secondElement.next = firstElement;
        firstElement.prev = secondElement;
        last.prev = firstElement;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
