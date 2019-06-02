package stack;

/**
 * @Author: Gosin
 * @Date: 2019/6/1 16:02
 */
interface interfaceQueue<E>{
    public boolean empty();
    public boolean add(E e);
    public E peek();
    public E poll();
    public int length();
}
public class Queue<E> implements interfaceQueue<E> {
    private Object[] data=null;
    private int maxSize;//队列容量
    private int front;//队列头,允许删除
    private int rear;//队列尾
    Queue(){
        this(10);
    }
    Queue(int size){
        if (size>=0){
            this.maxSize=size;
            data=new Object[size];
            front=rear=0;
        }else {
            throw new RuntimeException("初始化大小不能小于0:"+size);
        }
    }
    public boolean empty(){
        return front==rear?true:false;
    }
    public boolean add(E e){
        if (rear==maxSize){
            throw new RuntimeException("队列已满!");
        }else {
            data[rear++]=e;
            return true;
        }
    }
    public E peek(){
        if (empty()){
            throw new RuntimeException("空队");
        }else {
            return (E)data[front];
        }
    }
    public E poll(){
        if (empty()){
            throw new RuntimeException("空队");
        }else {
            E val =(E) data [front];//保留队列的front端的元素的值
            data[front++]=null;//释放队列的front端的元素
            return val;
        }
    }
    public int length(){
        return rear-front;
    }
}
