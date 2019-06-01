package bolg;
//节点类
public class Node {
    Object data;
    Node next;
    Node prior;
    Node(){

    }
    Node(Object val){
        super();
        this.data=val;
    }
    Node getPrior(){
        return this.prior;
    }
    void setPrior(Node val){
        this.prior=val;
    }
    Object getData(){
        return data;
    }
    void setData(Object val){
        this.data=val;
    }
    Node getNext(){
        return next;
    }
    void setNext(Node val){
        this.next=val;
    }
}
