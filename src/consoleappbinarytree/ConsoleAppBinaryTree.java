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
public class ConsoleAppBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node root = new Node(1);
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
        
        root.printPreorder(root);
        System.out.println();
        root.printPostorder(root);
        System.out.println();
        root.printInorder(root);
        System.out.println();
        root.print();
    }
    
}
