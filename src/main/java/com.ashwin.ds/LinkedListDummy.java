package com.ashwin.ds;
import java.util.*;

public class LinkedListDummy {

    private String name;
    private LinkedListDummy next;

    public void LinkedListDummy() {
        this.next = null;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setNext(LinkedListDummy next) {
        this.next = next;
    }

    public String getName() {
        return this.name;
    }

    public LinkedListDummy getNext() {
        return this.next;
    }

    public LinkedListDummy append(LinkedListDummy head, LinkedListDummy tail, LinkedListDummy addNew) {
        if(head==null){
            //first element
            head = addNew;

        }
        return null;
    }

    public static void main(String argsp[]) {


    }
}
