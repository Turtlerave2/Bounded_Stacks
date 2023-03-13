/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamarson.bounded_stack;

/**
 *
 * @author leoze
 */
public class StackFullException extends RuntimeException {
    public StackFullException() {
    }

    public StackFullException(String message) {
        super(message);
    }
}
