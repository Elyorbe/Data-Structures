package tech.ibrokhimov.datastructures.linkedlist;
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
    public boolean remove(int data){
        Node thisNode = this.root;
        Node prevNode = null;
        while(thisNode != null ){
            if(thisNode.getData()==data){
                if (prevNode != null)
                    prevNode.setNextNode(thisNode.getNextNode());
                else
                    this.root = null;
                this.setSize(this.getSize()-1);
                return true;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNextNode();
        }
        return false;
    }

    public void printAll(){
        Node thisNode = this.root;
        System.out.println("All the nodes in the linked list: ");
        while(thisNode != null){
            System.out.print(thisNode.getData()+" ");
            thisNode = thisNode.getNextNode();
        }
        System.out.println();
    }

    //Test code
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println(list.getSize());
        list.add(12);
        System.out.println(list.getSize());
        list.add(86);
        list.add(54);
        list.add(3142);
        list.printAll();
        System.out.println(list.find(54).getData());
        list.remove(3142);
        list.printAll();
        list.add(314);
        list.printAll();
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
