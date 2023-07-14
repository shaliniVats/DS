package com.ds.tree.bt.search;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<List<Integer>> BFS = BinaryTree.getTree().breadthFirstSearch();
        System.out.println(BFS);

    }
}
