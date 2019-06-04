package stack;

/**
 * @Author: Gosin
 * @Date: 2019/6/1 14:43
 */
interface ListStack<E>{
    public boolean isEmpty();
    public boolean push(E e);
    public E pop();
    public E peek();
    public int search(E e);
}
public class ArrayStack<E> implements ListStack<E>{
    private Object[] data =null;//空对象数组
    private int maxSize=0;//栈大小
    private int top=-1;//栈顶指针
    private int bottom=-1;//栈底指针
//    private Object[] data=null; int maxSize=0,top=-1,bottom=-1;
    ArrayStack(){
        this(100);
    }
    ArrayStack(int size){
        if(size>=0){
            this.maxSize=size;
            data=new Object[size];
            top=-1;
        }else {
            throw new RuntimeException("初始化大小不能小于0:"+size);
        }
    }
    public int length(){
        return data.length;
    }
    //判断是否为空
    public boolean isEmpty(){
        return top == -1 ? true : false;
   }
    //压栈
    public boolean push(E e){
        if (top==maxSize-1){
            throw new RuntimeException("栈已满,无法将元素入栈!");
        }else {
            data[++top]=e;
            return true;
        }
    }
    //弹栈
    public E pop(){
        if (top==-1){
            throw new RuntimeException("栈为空!");
        }else {
            return (E)data[top--];
        }
    }
    //查看栈顶元素
    public E peek(){
        if(top==-1){
            throw new RuntimeException("栈为空!");
        }else {
            return (E)data[top];
        }
    }
    //返回对象在堆栈中的位置,以1位基数
    public int search(E e){
        int i=top;
        while (top!=-1){
            if (peek()!=e){
                top--;
            }else {
                break;
            }
        }
        int result=top+1;
        top=i;
        return result;
    }
}
