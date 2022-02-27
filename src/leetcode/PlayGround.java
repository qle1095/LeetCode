package leetcode;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class PlayGround {

    @Test
    public void tesT() {
        Queue<String> queue = new LinkedList();
        queue.add("lumi");
        queue.add("luci");
        queue.add("coco");
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        LinkedList<String> list = new LinkedList<>();
        list.add("lumi");
        list.add("luci");
        list.add("coco");
    }
}
