package com.ds.tree.bt.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
	Node root;
	public static BinaryTree getTree(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        return tree;
	}

    public List<List<Integer>> breadthFirstSearch(){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.data);
                if(currentNode.left !=null ) queue.add(currentNode.left);
                if(currentNode.right!=null)queue.add(currentNode.right);
            }
            result.add(currentLevel);
        }
        return result;

    }

}
