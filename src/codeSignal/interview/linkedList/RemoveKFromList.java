package codeSignal.interview.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveKFromList {
    static class ListNode<T> {
        ListNode(T x) {
        value = x;
        }
        T value;
        ListNode<T> next;
    }

    static ListNode<Integer> solution(ListNode<Integer> l, int k) {

        ListNode<Integer> head = new ListNode<>(null);
        ListNode<Integer> current = l;
        ListNode<Integer> previous = head;

        head.next = l;

        while (current != null) {

            if (current.value == k) {
                previous.next = current.next;
            } else {
                previous = current;
            }

            current = current.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        //3, 1, 2, 3, 4, 5
        ListNode<Integer> node0 = new ListNode<>(3);
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3 = new ListNode<>(3);
        ListNode<Integer> node4 = new ListNode<>(4);
        ListNode<Integer> node5 = new ListNode<>(5);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode<Integer> result = solution(node0, 3);

        while(result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }
}
