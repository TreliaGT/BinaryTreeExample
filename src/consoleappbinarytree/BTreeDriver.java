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
public class BTreeDriver {
     public static void main(String[] args) {
        System.out.println("Creating Tree");
        BTree tree = new BTree();
        
        System.out.println("count nodes in empty tree");
        System.out.println(tree.countNodes());
        
        System.out.println("Creat Bides with data 1");
        Node root = new Node(1);
        
        System.out.println("set node as root");
        tree.setRoot(root);
      
        System.out.println("Count nodes in tree with only root added");
        System.out.println(tree.countNodes());
        
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        
        root.setLeft(node2);
        node2.setLeft(node4);
        node2.setRight(node5);
        node5.setLeft(node7);
        root.setRight(node3);
        node3.setLeft(node6);
        
       System.out.println("set the current node to be the root");
       tree.setCurrentNode(tree.getRoot());
       
       System.out.println("Display the current node");
       System.out.println(tree.getCurrent().getData());
        
       Node currentNode = tree.getCurrent();
       
       System.out.println("Count nodes in tree with 7 nodes added");
       System.out.println(tree.countNodes());
       
       System.out.println("In Order Print");
       tree.printInorder();
       
       System.out.println("Pre order print");
       tree.printPreOder();
       
       System.out.println("Post order print");
       tree.printPostOrder();
       
       System.out.println("Display the nodes as tree diagram");
       tree.print();
       
    }
    
}
