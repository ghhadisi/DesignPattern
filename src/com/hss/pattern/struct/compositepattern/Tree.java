package com.hss.pattern.struct.compositepattern;

/**
 * Created by Administrator on 2017/10/24.
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }
}
