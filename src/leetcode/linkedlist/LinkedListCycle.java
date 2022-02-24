package leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {


    @Test
    public void test() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        System.out.println(hasCycle(node1));
    }

    public boolean hasCycle(Node head) {
        Set<Node> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }

    class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }

    }
}
