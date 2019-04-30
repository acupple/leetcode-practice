package org.mokey.acupple.practice.models;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-26 14:23
 * @Version 1.0
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    /**
     * 1,2,3,4,5,null,null
     */
    public static TreeNode StringToTreeNode(String s){
        if(s == null || s.trim().isEmpty()){
            return null;
        }
        String[] tokens = s.split(",");
        return createTreeNode(tokens, 0);

    }

    private static TreeNode createTreeNode(String[] tokens, int index){
        TreeNode root = null;
        if(index < tokens.length && !tokens[index].equals("null")){
            root = new TreeNode(Integer.parseInt(tokens[index]));
            root.left = createTreeNode(tokens, 2 * index + 1);
            root.right = createTreeNode(tokens, 2 * index + 2);
        }
        return root;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(Integer.toString(val));
        Queue<TreeNode> queue = new LinkedList<>();
        if(left != null || right != null){
            queue.add(left);
            queue.add(right);

        }
        while (!queue.isEmpty()){
            TreeNode o = queue.poll();
            sb.append(",").append(o == null ? "null" : o.val);

            if(o != null && (o.left != null || o.right != null)){
                queue.add(o.left);
                queue.add(o.right);
            }
        }
        return sb.toString();
    }
}
