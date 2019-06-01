package westCityLaboratory;
//public interface List{
//    //获取线性表的长度
//    public int size();
//    //判断是否为空
//    public boolean isEmpty();
//    //插入操作.需要抛出异常
//    public void insert(int index,Object obj)throws Exception;
//    //删除元素
//    public void delete(int index)throws Exception;
//    //获取指定位置的元素
//    public Object get(int index)throws Exception;
//}
public class twoNode {
    Object element;//数据域
    twoNode next;//后继指针域
    twoNode prior;//前驱指针域
    //头结点的构造方法
    public twoNode(twoNode nextval){
        this.next=nextval;
    }
    //非头结点的构造方法
    public twoNode(Object obj,twoNode nextval){
        this.element=obj;
        this.next=nextval;
    }
    //获的当前节点的后继结点
    public twoNode getNext(){
        return this.next;
    }
    //获得当前节点的前驱结点
    public twoNode getPrior(){
        return this.prior;
    }
    //获得当前节点的数据域的值
    public Object getElement(){
        return this.element;
    }
    //设置当前节点的后继指针域
    public void setNext(twoNode nextval){
        this.next=nextval;
    }
    //设置当前节点的前驱指针域
    public void setPrior(twoNode priorval){
        this.prior=priorval;
    }
    //设置当前节点的的数据域
    public void setElement(Object obj){
        this.element=obj;
    }
    public String toString(){
        return this.element.toString();
    }
}
