/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleappbinarytree;

/**
 *
 * @author V244682
 */
public class BTree {
    private Node root;
    private Node currentNode;
    
    public BTree(){
        root= null;
    }
    
    public boolean search(int data){
        return search(root,data);
    }
    
    public boolean search(Node node, int data){
        if(node.getData() == data)
            return true;
        if(node.getLeft() != null)
            if(search(node.getLeft(),data))
                return true;
        if(search(node.getRight(),data))
            return true;
        return false;
    }
    
    public void printInorder(){
        root.printInorder(root);
    }
    
    public void printPreOder(){
        root.printPreorder(root);
    }
    
    public void printPostOrder(){
        root.printPostorder(root);
    }
    
    public Node getRoot(){
        return root;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public int countNodes(){
        return countNodes(root);
    }
    
   private int countNodes(Node node){
       int count = 1;
       if(node == null){
           return 0;
       }
       else{
           count += countNodes(node.getLeft());
           count += countNodes(node.getRight());
           return count;
       }
   } 
   
   public void print(){
       root.print();
   }
   
   public Node getCurrent(){
       return currentNode;
   }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
   
   
}
