package stack;
/**
 * @Author: Gosin
 * @Date: 2019/6/1 15:06
 */
//链表
class Node<E>{
    E e;
    Node<E> next;
    public Node(){}
    public Node(E e,Node next){
        this.e = e;
        this.next=next;
    }
}
interface NodeInterface<E>{
    public int length();
    public boolean empty();
    public boolean push(E e);
    public Node<E> peek();
    public Node<E> pop();
}

public class NodeStack<E> implements NodeInterface<E>{
    private Node<E> top;//栈顶元素
    private int size;//当前栈大小
    public NodeStack(){
        top=null;
    }
    //长度
    public int length(){
        return size;
    }
    //判空
    public boolean empty(){
        return size==0;
    }
    //入栈
    public boolean push(E e){
        //让top指向新创建的元素,新元素的next引用指向原来的栈顶元素
        top=new Node(e,top);
        size++;
        return true;

    }
    public Node<E> peek(){
        if(empty()){
            throw new RuntimeException("空栈!");
        }else {
            return top;
        }
    }
    public Node<E> pop(){
        if(empty()){
            throw new RuntimeException("空栈!");
        }else {
            Node<E> value=top;//得到栈顶元素
            top=top.next;//让top引用指向原栈顶元素的下一个元素
            value.next=null;//释放原栈顶元素的next引用
            size--;
            return value;
        }
    }
}