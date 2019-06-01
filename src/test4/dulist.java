package test4;

import bolg.Node;

/**
 * @Author: Gosin
 * @Date: 2019/6/1 10:09
 */

public class dulist<E> {
    private node root=new node();//根节点内容为空
    node next;//下一个节点
    node last;//始终表示最后一个节点
    int size;
    private void checkindex(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    private String outOfBoundsMsg(int index) {
        return "Index:"+index+",size:"+size;
    }
    int getSize(){
        return size;
    }
    //添加节点
    public void add(E e){
        next =new node(e);
        if (size==0){//如果是第一个节点
            root.setNext(next);//添加到空节点后面
            last=next;
            size++;
        }else {
            last.setNext(next);//添加到最后一个节点后面
            last=next;//更新最后一个节点
            size++;
        }
    }
    public Object getElem(int index){
        checkindex(index);
        node node=root.getNext();
        for (int i=0;i<index;i++){
            node=node.getNext();
        }
        return node.getData();
    }
    public void set(int index,E e){
        checkindex(index);
        node node =root.getNext();
        for (int i=0;i<index;i++){
            node=node.getNext();
        }
        node.setData(e);
    }
    public void remove(int index){
        checkindex(index);
        node node =root.getNext();
        if (index!=0){
            for (int i=0;i<index;i++){
                node=node.getNext();
            }
            node node1=root.getNext();
            for (int i=0;i<index-1;i++){
                node1=node1.getNext();
            }
            if (index!=size-1){//不是最后一个节点
                node node2=node.getNext();
                node1.setNext(null);
                node1.setNext(node2);
            }else {//是最后一个节点
                node1.setNext(null);
            }
            node.setData(null);
            node.setNext(null);
        }else {
            root.setNext(null);
            root.setNext(root.getNext().getNext());
            root.getNext().setNext(null);
        }
    }
}
