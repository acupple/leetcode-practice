package org.mokey.acupple.practice.linked;

import org.junit.Test;
import org.mokey.acupple.practice.models.ChildNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 19:00
 * @Version 1.0
 */
public class FlattenAmultilevelDoublyLinkedListTest {
    /**
     *  *  1---2---3---4---5---6--NULL
     *      *          |
     *      *          7---8---9---10--NULL
     *      *              |
     *      *              11--12--NULL
     */
    @Test
    public void test() {

        ChildNode p11 = new ChildNode();
        p11.val = 11;
        p11.next = new ChildNode();
        p11.next.val = 12;

        ChildNode p7 = new ChildNode();
        p7.val = 7;
        p7.next = new ChildNode();
        p7.next.val = 8;
        p7.next.child = p11;
        p7.next.next = new ChildNode();
        p7.next.next.val = 9;
        p7.next.next.next = new ChildNode();
        p7.next.next.next.val = 10;


        ChildNode head = new ChildNode();
        head.val = 1;
        head.next = new ChildNode();
        head.next.val = 2;
        head.next.next = new ChildNode();
        head.next.next.val = 3;
        head.next.next.child = p7;


        head.next.next.next = new ChildNode();
        head.next.next.next.val = 4;
        head.next.next.next.next = new ChildNode();
        head.next.next.next.next.val = 5;
        head.next.next.next.next.next = new ChildNode();
        head.next.next.next.next.next.val = 6;


        FlattenAmultilevelDoublyLinkedList.flatten(head);
    }
}
