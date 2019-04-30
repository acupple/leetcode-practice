package org.mokey.acupple.practice.models;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 18:44
 * @Version 1.0
 */
public class ChildNode {
    public int val;
    public ChildNode prev;
    public ChildNode next;
    public ChildNode child;

    public ChildNode() {}

    public ChildNode(int _val,ChildNode _prev,ChildNode _next,ChildNode _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }
}
