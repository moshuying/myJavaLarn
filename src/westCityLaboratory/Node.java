package westCityLaboratory;

public class Node {
    Object data;
    Node next;
    Node(Node nextval){
        next=nextval;
    }
    Node(Object obj,Node nextval){
        data=obj;
        next=nextval;
    }
    public Object getElement(){
        return data;
    }
    public void setElement(Object obj){
        data=obj;

    }
    public String toString(){
        return data.toString();

    }

    public interface List{
        public void insert(int i,Object obj)throws Exception;
        public Object delete(int i)throws Exception;
        public Object getData(int i)throws Exception;
        public void print()throws Exception;
        public int size();
        public boolean isEmpty();
    }
    public static class LinList implements List{
        Node head;
        Node current;
        int size;
        LinList(){
            head=current=new Node(null);
        }
        public void index(int i)throws Exception{
            if(i<-1||i>size-1){
                throw new Exception("初始参数错误");
            }
            if(i==-1){
                current=head;
                return;
            }
            current=head.next;
            int j=0;
            while ((current!=null)&&j<i){
                current=current.next;
                j++;
            }
        }
public void insert(int i,Object obj)throws Exception{
            if(i<0||i>size){
                throw new Exception("插入参数错误");
            }
            index(i-1);
            Node s=new Node(obj,null);//分配新节点
            s.next=current.next;//插入新节点
            current.next=s;
            size++;
        }
        public Object delete(int i)throws Exception{
            if(size==0){
                throw new Exception("链表已空无元素可删");
            }
            if(i<0||i>size-1){
                throw new Exception("删除参数错误");
            }
            index(i-1);
            Object obj=current.next.getElement();
            current.next=current.next.next;
            size--;
            return obj;
        }
        public Object getData(int i)throws Exception{
            if(i<-1||i>size-1){
                throw new Exception("获取数据参数错误");
            }
            index(i);
            return current.getElement();
        }
        public void print()throws Exception{
            System.out.println("单链表元素为:");
            for (int i=0;i<size;i++){
                System.out.print(getData(i)+"\t");
            }
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
    }

}
