package SolutionList.LRUCache;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    class Node{
        int key;
        int val;
        Node next;
        Node pre;
        public Node(){}
        public Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    Node header;
    Node tail;
    Map<Integer,Node> map;
    int size;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.header = new Node();
        this.tail = new Node();
        this.header.next = tail;
        this.tail.pre = header;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        Node node =  map.get(key);

        if(node==null){
            return -1;
        }else{
            moveToHeader(node);
            return node.val;
        }
    }

    public void put(int key, int value) {

        Node newNode = new Node(key,value);

        Node node = map.get(key);

        if(node==null){

            addToHeader(newNode);
            map.put(key,newNode);
            ++size;

            if(size>this.capacity){
                Node tail =removeTail();
                --size;
                map.remove(tail.key);

            }

        }else{
            removeNode(node);
            addToHeader(newNode);
            map.put(key,newNode);
        }
    }
    //添加某个节点到头部
    public void addToHeader(Node node){
        Node next = this.header.next;

        this.header.next = node;
        node.next = next;

        next.pre = node;
        node.pre = this.header;
    }

    //删除任意节点
    public void removeNode(Node node){
        Node pre = node.pre;
        Node next = node.next;

        pre.next = next;
        next.pre = pre;
    }

    //移动某个节点到头部
    //1.删除这个节点
    //2.添加这个删除的节点到头部
    public void moveToHeader(Node node){
        removeNode(node);
        addToHeader(node);
    }

    //删除尾部节点
    public Node removeTail(){
        Node tailer = this.tail.pre;
        removeNode(tailer);
        return tailer;
    }
}