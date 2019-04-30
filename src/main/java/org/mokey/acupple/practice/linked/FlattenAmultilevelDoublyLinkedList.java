package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ChildNode;

import java.util.Stack;

/**
 * 您将获得一个双向链表，除了下一个和前一个指针之外，它还有一个子指针，可能指向单独的双向链表。
 * 这些子列表可能有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 * 扁平化列表，使所有结点出现在单级双链表中。您将获得列表第一级的头部。
 * @Author: Forest Yuan
 * @Date: 2019-04-28 18:45
 * @Version 1.0
 */
public class FlattenAmultilevelDoublyLinkedList {
    /**
     * 示例:
     *
     * 输入:
     *  1---2---3---4---5---6--NULL
     *          |
     *          7---8---9---10--NULL
     *              |
     *              11--12--NULL
     *
     * 输出:
     * 1-2-3-7-8-11-12-9-10-4-5-6-NULL
     */
    public static ChildNode flatten(ChildNode head) {
        ChildNode curr = head;
        while( curr != null) {
            /* CASE 1: if no child, proceed */
            if( curr.child == null ) {
                curr = curr.next;
                continue;
            }
            /* CASE 2: got child, find the tail of the child and link it to p.next */
            ChildNode temp = curr.child;
            // Find the tail of the child
            while( temp.next != null )
                temp = temp.next;
            // Connect tail with p.next, if it is not null
            temp.next = curr.next;
            if( curr.next != null )  curr.next.prev = temp;
            // Connect p with p.child, and remove p.child
            curr.next = curr.child;
            curr.child.prev = curr;
            curr.child = null;
        }
        return head;
    }

    public static ChildNode flatten2(ChildNode head) {
        Stack<ChildNode> stack = new Stack<>();
        ChildNode curr = head, next;
        while (curr != null){
            if(curr.child != null){
                stack.add(curr.next);
                curr.next = curr.child;
                curr.child = null;
            }
            next = (curr.next == null && !stack.isEmpty()) ? stack.pop() : curr.next;
            if(next != null){
                next.prev = curr;
                curr.next = next;
            }

            curr= next;
        }

        return head;
    }
}
