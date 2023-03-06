/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teamarson.bounded_stack;

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
