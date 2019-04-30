package org.mokey.acupple.practice.models;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-26 19:02
 * @Version 1.0
 */
public class RandomListNode {
    public int val;
    public RandomListNode next = null;
    public RandomListNode random = null;

    public RandomListNode() {}

    public RandomListNode(int _val, RandomListNode _next, RandomListNode _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
