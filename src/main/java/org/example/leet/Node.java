package org.example.leet;

/**
 * Учитывая начало заголовка связанного списка, вернуть true, если в связанном списке есть цикл. В противном случае вернуть false.
 * Цикл в связанном списке есть, если хотя бы один узел в списке можно посетить снова, следуя указателю next.
 * Внутри index определяет индекс начала цикла, если он существует. Узел tail списка установит свой указатель next на узел index-th. Если index = -1, то узел tail указывает на null и цикла не существует.
 * Примечание: index не передается вам в качестве параметра.
 * */

public class Node {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
