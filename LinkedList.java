package tech.ibrokhimov;
public class LinkedList {
    Node root;
    int size;
    public LinkedList(){
        root = new Node();
        size = 0;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public Node add(int data){
        Node newNode = new Node(data, root);
        this.root = newNode;
        this.size++;
        return newNode;
    }
    public Node find(int data){
        Node thisNode = this.root;
        while (thisNode != null){
            if(thisNode.getData() == data )
                return thisNode;
            thisNode = thisNode.getNextNode();
        }
        return null;
    }
    public static void main(String[] args){


    }

    //Node class
    private class Node{
        private Node nextNode;
        private int data;

        private Node(){

        }
        private Node(int value){
            data = value;
        }
        private Node(int value, Node next){
            data = value;
            nextNode = next;
        }

        private void setData(int value){
            this.data = value;
        }
        private int getData(){
            return this.data;
        }
        private void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }
        private Node getNextNode(){
            return this.nextNode;
        }
    }
}
