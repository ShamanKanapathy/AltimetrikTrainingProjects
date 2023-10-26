package org.example;

public class Library {
    public Books b;

    public void setB(Books b) {
        this.b = b;
    }
    void display(){
        b.displayBookName();
    }
}
