package org.mokey.acupple.practice.models;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 11:32
 * @Version 1.0
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode StringToListNode(String s){
        if(s == null || s.isEmpty()){
            return null;
        }

        String[] tokens = s.split("->");
        ListNode head = new ListNode(Integer.parseInt(tokens[0].trim()));
        ListNode cur = head;
        for (int i = 1; i < tokens.length; i++) {
            cur.next = new ListNode(Integer.parseInt(tokens[i].trim()));
            cur = cur.next;
        }

        return head;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode cur = this;
        while (cur != null){
            sb.append(cur.val);
            if(cur.next != null){
                sb.append("->");
            }
            cur = cur.next;
        }

        return sb.toString();
    }
}
