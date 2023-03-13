/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package teamarson.bounded_stack;

/**
 *
 * @author leoze
 */
public class Bounded_Stack extends Stack {

    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public Bounded_Stack() {
        super();
        capacity = DEFAULT_CAPACITY;
    }

    public Bounded_Stack(int capacity) {
        super();
        this.capacity = capacity;
    }

    public boolean isFull() {
        return size >= capacity;
    }

    @Override
    public boolean push(int value) {

        if (isFull()) {
            throw new StackFullException();
        }
        return super.push(value);

    }

}
