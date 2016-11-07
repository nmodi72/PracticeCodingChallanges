package basic.java.practice;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public static Node root;

    public BinarySearchTree() {
        this.root = null;
    }
    
    public static void main(String[] args){
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.insert(9);
        binaryTree.insert(43);
        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(9);
        binaryTree.insert(4);
        binaryTree.insert(7);
        binaryTree.insert(4);
        binaryTree.insert(32);
        binaryTree.insert(35);
        System.out.println("Original tree: ");
        binaryTree.display(binaryTree.root);
        System.out.println(" ");
        
        
        System.out.println(binaryTree.delete(35));
        System.out.println(binaryTree.delete(32));
        binaryTree.byLevel(binaryTree.root);
        System.out.println(" ");
        System.out.println("Original tree: ");
        binaryTree.display(binaryTree.root);
    }
    
    // Display all the elements of the tree
    public void display(Node root) {
        if(root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }
    // Insert operation in tree
    public void insert(int id) {
      Node newNode = new Node(id);
      if (root == null) {
          root = newNode;
          return;
      }
      Node current = root;
      Node parent = null;
      while(true) {
          parent = current;
          if(id < current.data){
              current = current.left;
              if(current == null){
                  parent.left = newNode;
                  return;
              }
          } else {
              current = current.right;
              if(current == null) {
                  parent.right = newNode;
                  return;
              }
          }
          
      }
    }
    // Print data in tree
    public void byLevel(Node root){
        Queue<Node> level  = new LinkedList<>();
        level.add(root);
        while(!level.isEmpty()){
            Node node = level.poll();
            System.out.print(node.data + " ");
            if(node.left != null)
            level.add(node.left);
            if(node.right != null)
            level.add(node.right);
        }
   }
    
    // Deletion operation in tree
    public boolean delete(int id) {
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current.data != id) {
            parent = current;
            if(current.data > id) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        
        // Case 1: when we are deleting node which has no child
        if(current.left == null && current.right == null) {
            if(current == root) {
                root = null;
            }
            if(isLeftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Case 2: when we are deleting node which has only one child
        else if(current.left == null) {
            if(current == root){
                
            }
        }
        return false;
    }
    // Search operation within tree
    public boolean search(int id) {
        Node current= root;
        while(current != null) {
            if(current.data == id){
                return true;
            } else if(current.data > id){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
}

//This is the Binary Search Tree Class
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
