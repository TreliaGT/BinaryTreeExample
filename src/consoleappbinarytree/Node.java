/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleappbinarytree;

/**
 *Binary Tree Node
 * @author V244682
 */
public class Node {
  private int data;
  private Node Left;
  private Node Right;
    
    public Node(int data){
        this.data = data;
        Left = null;
        Right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node Left) {
        if(this.Left == null)
        this.Left = Left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node Right) {
        if(this.Right == null)
        this.Right = Right;
    }
    
    public void printPreorder(Node node){
        if(node == null)
            return;
            
        System.out.println(node.data + " ");
        printPreorder(node.Left);
        printPreorder(node.Right);
    }
    
     public void printPostorder(Node node){
        if(node == null)
            return;
            
      
        printPreorder(node.Left);
        printPreorder(node.Right);
        System.out.println(node.data + " ");
    }
     
        public void printInorder(Node node){
        if(node == null)
            return;
            
      
        printPreorder(node.Left);
        System.out.println(node.data + " ");
        printPreorder(node.Right);
       
    }
        
    public String print(){
        return this.print(" " , true, " ");
    }
    
    public String print(String prefix, boolean isTail, String sb ){
       if(Right != null){
           Right.print(prefix + (isTail ? "|    " : "     "), false, sb);
       }
       System.out.println(prefix +(isTail ? "\\-- ": "/-- " )+ data);
       if(Left != null){
           Left.print(prefix + (isTail ? "    " : "|    "), true, sb);
       }
       return sb;
    }

    
    
}
