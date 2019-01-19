package com.company;

import java.util.Stack;

public class BinaryTree
{
    private static Node root;

    public BinaryTree(int data)
    {
        root = new Node(data);
    }

    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
            parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public static void main(String args[])
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n12 = new Node(12);
        Node n13 = new Node(13);
        Node n15 = new Node(15);
        Node n16 = new Node(16);
        Node n17 = new Node(17);



        //reference: https://2.bp.blogspot.com/-3eyinMSgNi4/Vio9pd_tdYI/AAAAAAAAD-8/zT2D0lgWa8s/s1600/binary%2BSearch%2BTree%2Bin%2BJava.png
        BinaryTree tree = new BinaryTree(7); //       3

        tree.add(root, n5, "left"); //         1/ \
        tree.add(root, n12, "right"); //            4

        tree.add(n5, n3, "left"); //             2/ \
        tree.add(n5, n6, "right"); ////         5

        tree.add(n3, n1, "left"); //
        tree.add(n3, n4, "right");

        tree.add(n12, n9, "left"); //
        tree.add(n12, n15, "right");

        tree.add(n9, n8, "left"); //
        tree.add(n9, n10, "right");

        tree.add(n15, n13, "left"); //
        tree.add(n15, n17, "right");

        printLeafNodesIteratively(root);
        System.out.println("end of the tree ");
    }

    public static void printLeafNodesIteratively(Node root) {
        if (root == null) { return; } Stack<Node> stack = new Stack<>();
        stack.push(root); while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.getRight() != null) {
                stack.add(node.getRight());
            } if (node.getLeft()!= null) {
                stack.add(node.getLeft());
            } if (node.getLeft() == null && node.getRight() == null) {
                System.out.printf("%d ", node.getKey()); } } }
}