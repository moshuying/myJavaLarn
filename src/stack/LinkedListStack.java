package stack;

import java.util.LinkedList;

/**
 * @Author: Gosin
 * @Date: 2019/6/1 15:37
 */
interface llInterface<E>{
    public void push(E e);
    public E peek();
    public E pop();
    public boolean empty();
    public String toString();
}
public class LinkedListStack<E> implements llInterface<E> {
    private LinkedList<E> ll = new LinkedList<E>();
    //入栈
    public void push(E e){
        ll.addFirst(e);
    }
    //查看栈顶元素但不移除
    public E peek(){
        return ll.getFirst();
    }
    public E pop(){
        return ll.removeFirst();
    }
    public boolean empty(){
        return ll.isEmpty();
    }
    public String toString(){
        return ll.toString();
    }
}
