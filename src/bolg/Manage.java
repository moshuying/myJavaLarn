package bolg;

import java.util.Random;

/**
 * @Author: Gosin
 * @Date: 2019/6/1 9:04
 */

public class Manage {
    public static void main(String[] args) {
        MyLinkedList<Comparable> list = new MyLinkedList();//创建单向列表对象
        Random ran = new Random();
        int num = ran.nextInt(5)+5;
        System.out.println("添加的个数为"+num);
        System.out.println("---添加---");
        for(int i=0;i<num;i++){
            list.add(i);
            System.out.print("  "+list.get(i));
        }
        System.out.println();
        System.out.println("添加后链表的Size为："+list.size());
        System.out.println();
        //设置
        list.set(1, "5");
        for(int i=0;i<num;i++){
            System.out.print("  "+list.get(i));
        }
        System.out.println();
        System.out.println("移除最后一个");
        //移除
        list.remove(num-1);
        for(int i=0;i<list.size();i++){
            System.out.print("  "+list.get(i));
        }
        System.out.println();
        System.out.println("移除链表的Size为："+list.size());
        System.out.println();
        //插入
        System.out.println("---插入---");
        list.insert(num-2, "999");
        for(int i=0;i<list.size();i++){
            System.out.print("  "+list.get(i));
        }
        System.out.println();
        System.out.println("插入链表的Size为："+list.size());
        //反转
        list.back();
        System.out.println();
        System.out.println("---反转---");
        for(int i=0;i<list.size();i++){
            System.out.print("  "+list.get(i));
        }
        System.out.println();
        System.out.println("反转链表的Size为："+list.size());
        System.out.println("---------------------------------");

        //添加循环链表
        MyLinkedList list1 = new MyLinkedList();
        for(int i=0;i<num;i++){
            list1.addfor(i);
        }

        for(int i=0;i<list1.size();i++){
            System.out.print("  "+list1.get(i));
        }
        System.out.println();

        list1.insert(0,"23");
        for(int i=0;i<list1.size();i++){
            System.out.print("  "+list1.get(i));
        }
        System.out.println();

    }
}
