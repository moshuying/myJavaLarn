package bolg;

/**
 * @Author: Gosin
 * @Date: 2019/6/1 0:01
 */

public class MyLinkedList<E> {
    private Node root = new Node();// 空节点
    private Node next;// 下一个节点
    private Node last;// 始终表示最后一个节点
    private int size;

    public int size() {
        return size;
    }

    /**
     * 向链表添加节点的方法
     */
    public void add(E e) {
        next = new Node(e);
        if (size == 0) {// 如果是第一个节点
            root.setNext(next);// 添加到空节点后面
            last = next;// 更新最后一个节点
            size++;
        } else {
            last.setNext(next);// 添加到最后一个节点后面
            last = next;// 更新最后一个节点
            size++;
        }
    }

    /**
     * get节点元素的方法
     */
    public Object get(int index) {
        checkIndex(index);// 检查index
        Node node = root.getNext();
        for (int i = 0; i < index; i++) {// 找到下标为index的节点
            node = node.getNext();
        }
        return node.getData();

    }

    /**
     * set节点元素的方法
     */
    public void set(int index, E e) {
        checkIndex(index);// 检查index
        Node node = root.getNext();
        for (int i = 0; i < index; i++) {// 找到下标为index的节点
            node = node.getNext();
        }
        node.setData(e);

    }

    /**
     * remove节点的方法
     */
    public void remove(int index) {
        checkIndex(index);// 检查index
        Node node = root.getNext();
        if (index != 0) {//如果不是第一个节点
            for (int i = 0; i < index; i++) {// 找到下标为index的节点
                node = node.getNext();
            }
            // 找到下标为index-1的节点，即前一个节点
            Node node1 = root.getNext();
            for (int i = 0; i < index - 1; i++) {
                node1 = node1.getNext();
            }

            if (index != size - 1) {// 如果不是最后一个节点
                Node node2 = node.getNext();// 下标index的下一个节点
                node1.setNext(null);// 断开前一个节点和index节点
                node1.setNext(node2);// 将前一个节点指向后一个节点
            } else {// 是最后一个节点
                node1.setNext(null);// 断开前一个节点和index节点
            }
            node.setData(null);// 删除节点存贮的内容
            node.setNext(null);// 删除index节点指向
        } else {//移除第一个节点
            Node node4 = root.getNext();
            Node node5 = node4.getNext();
            root.setNext(null);
            root.setNext(node5);
            node4.setNext(null);

        }
        size--;
    }

    /**
     * 插入节点的方法
     */
    public void insert(int index, E e) {
        checkIndex(index);// 检查index
        // 找到下标为index的节点
        Node node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();

        }
        Node node1 = new Node(e);
        if (index == 0) {// 如果要插入在最前面
            root.setNext(null);// 断开空节点和第一个节点
            root.setNext(node1);// 空节点指向新节点
            node1.setNext(node);// 新节点指向原第一个节点

        } else {
            // 找到下标为index节点的前一个节点
            Node node2 = root.getNext();
            for (int i = 0; i < index - 1; i++) {
                node2 = node2.getNext();
            }
            node2.setNext(null);// 断开前一个节点
            node2.setNext(node1);
            node1.setNext(node);
        }
        size++;
    }

    /**
     * 反转
     */

    public void back() {
        int num = size - 1;
        Node node = root.getNext();// 得到下标为num的点
        for (int i = 0; i < num; i++) {
            node = node.getNext();
        }
        last = node;// 更新last
        if (num > 0) {

            for (int j = 0; j < num; j++) {
                Node node1 = root.getNext();// 找到下标为num-j-1的点
                for (int i = 0; i < num - j - 1; i++) {
                    node1 = node1.getNext();
                }

                node1.setNext(null);// 该节点的引用域为空
                last.setNext(node1);// 最后一个几点指向该节点
                last = node1;// 更新最后一个节点
            }
            num--;
        }
        root.setNext(null);// 断开根节点与原第一个节点
        root.setNext(node);// 根节点指向原最后一个节点

    }

    /**
     * 添加循环链表
     */
    public void addfor(E e) {
        next = new Node(e);
        if (size == 0) {// 如果是第一个节点
            root.setNext(next);// 添加到空节点后面
            last = next;// 更新最后一个节点
            size++;
        } else {
            last.setNext(next);// 添加到最后一个节点后面
            last = next;// 更新最后一个节点
            last.setNext(null);
            last.setNext(root.getNext());// 最后一个节点指向第一个节点
            size++;
        }
    }

    /**
     * 添加双向链表
     */
    public void duladd(E e) {
        next = new Node(e);
        if (size == 0) {// 如果是第一个节点
            root.setNext(next);// 添加到空节点后面
            last = next;// 更新最后一个节点
            size++;
        } else {

            last.setNext(next);// 添加到最后一个节点后面
            next.setPrior(last);// next指向前一个节点
            last = next;// 更新最后一个节点
            size++;
        }
    }

    /**
     * 检查下标Index是否合法
     */
    private void checkIndex(int index) {
        if (index < 0 || index > size) {// 不合法报错
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }
}