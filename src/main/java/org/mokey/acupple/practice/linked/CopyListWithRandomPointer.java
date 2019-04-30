package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.RandomListNode;

/**
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * 要求返回这个链表的深拷贝。
 * @Author: Forest Yuan
 * @Date: 2019-04-26 19:01
 * @Version 1.0
 */
public class CopyListWithRandomPointer {

    /**
     * 输入：
     * {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
     * 解释：
     * 节点 1 的值是 1，它的下一个指针和随机指针都指向节点 2 。
     * 节点 2 的值是 2，它的下一个指针指向 null，随机指针指向它自己。
     * @param head
     * @return
     */
    public static RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode curr = head, next;
        while (curr != null){
            next = curr.next;

            RandomListNode copy = new RandomListNode(curr.val, next, null);
            curr.next = copy;

            curr = next;
        }
        curr = head;
        while (curr != null){
            if(curr.random != null){
                //the iter.random would point to the node in the original list not the newly-copied one.
                //The newly-copied node is followed right after the original node, i.e. iter.random.next.
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        RandomListNode dummyHead = new RandomListNode(0, null, null);
        RandomListNode copy, copyCurr = dummyHead;
        while (curr != null){
            next = curr.next.next;

            copy = curr.next;
            copyCurr.next = copy;
            copyCurr = copyCurr.next;

            curr.next = next;
            curr = next;
        }
        return dummyHead.next;
    }

    public static RandomListNode copyRandomList2(RandomListNode head) {
        RandomListNode dummyHead = new RandomListNode(0, null, null);
        RandomListNode curr = head;
        RandomListNode copyCurr = dummyHead;
        while (curr != null){
            copyCurr.next = new RandomListNode(curr.val, null, null);

            curr = curr.next;
            copyCurr = copyCurr.next;
        }

        return dummyHead.next;
    }
}
