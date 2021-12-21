package com.company;

public class LinkedList {
    public static void main(String[] args) {
        LinkedListFunctions LLF = new LinkedListFunctions();

        LLF.insertFirst(56);
        LLF.printNodeElement();
        LLF.insertLast(70);
        LLF.printNodeElement();
        LLF.insertInBetween(56,30);
        LLF.printNodeElement();
        LLF.findNode(30);
        LLF.insertInBetween(30, 40);
        LLF.printNodeElement();
        LLF.sort();
        LLF.printNodeElement();
        LLF.deleteFirst();
        LLF.printNodeElement();
        LLF.deleteLast();
        LLF.printNodeElement();
    }
}