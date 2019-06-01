package test4;

/**
 * @Author: Gosin
 * @Date: 2019/6/1 9:42
 */

public class node {
    Object data;
    node prior;
    node next;
    node(){}
    node(Object val){ this.data=val;}
    node getPrior(){return this.prior;}
    void setPrior(node val){this.prior=val;}
    Object getData(){return this.data;}
    void setData(Object val){this.data=val;}
    node getNext(){return this.next;}
    void setNext(node val){this.next=val;}
}
