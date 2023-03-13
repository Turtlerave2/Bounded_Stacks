/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teamarson.bounded_stack;

import java.util.EmptyStackException;

/**
 *
 * @author leoze
 */
public class Bounded_Stack {

   private Node first;
    private int size;
   
    public Bounded_Stack() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }


    public boolean push(String value) {
        Node newNode = new Node(value);
        
        newNode.next = first;
        first = newNode;
        
        size++;
        return true;
        
    }
    
     public String get(int pos) {

        String word = null;
        int tracker = 0;

        if (pos >= size || pos < 0) {
            throw new IndexOutOfBoundsException("Illegal position supplied");
        }
        Node current = first;
        while (current != null) {

            if (tracker == pos) {
                word = current.data;
            }
            current = current.next;
            tracker++;
        }

        return word;

    }

    public int indexOf(String word) {

        int count = 0;
        if (word == null) {
            throw new IllegalArgumentException("word is empty");
        }

        if (size == 0) {
            throw new NullPointerException("notin here");
        }

        Node current = first;
        while (current.next != null) {

            if (current.data.contains(word)) {
                return count;
            }
            count++;
            current = current.next;
        }

        return -1;

    }


    public boolean isEmpty() {
        return first == null;
    }

    public Node Peek() {
        if (isEmpty() == true) {
            throw new EmptyStackException();
        }
        Node current = first;
        return current;
    }

    public void clear() {
        first = null;
        size = 0;
    }
    
    
    
      private static class Node {

        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;

        }

        public boolean hasNext() {
            return next == null;
        }

    }
}
