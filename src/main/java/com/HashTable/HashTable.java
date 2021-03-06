package com.HashTable;

public class HashTable <T extends Comparable,V extends Comparable>{
    LinkedList<T> linkedList;

    public HashTable(){
        this.linkedList=new LinkedList<>();
    }

    public V get(T data){
        Node<T,V> node= this.linkedList.searchNode(data);
        if(node == null){
            return null;
        }
        else{
            return node.getValue();
        }
    }

    public void add(T data,V value){
        Node<T,V> node=(Node<T, V>) this.linkedList.searchNode(data);
        if(node == null){
            node=new Node(data,value);
            this.linkedList.insertatBack(node);
        }
        else{
            node.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "HashTable{" + linkedList + '}';
    }
}