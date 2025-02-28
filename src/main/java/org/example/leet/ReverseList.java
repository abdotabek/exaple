package org.example.leet;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        // Проверяем, пустой ли список или из одного узла
        if (head == null || head.next == null) {
            return head;     // Нечего разворачивать, возвращаем как есть
        }
        ListNode prev = null;  //  предыдущий узел, изначально null
        ListNode curr = head;  //  текущий узел, начинаем с заголовок
        ListNode next = null;  //  следующий узел, для сохранения связи
        while (curr != null) {
            next = curr.next;   // сохраняем следующий узел
            curr.next = prev;   // текущий узел, начинаем с головы
            prev = curr;        // сдвигаем prev вперёд
            curr = next;        // сдвигаем curr вперёд
        }
        // возвращаем новое списка
        return prev;
    }

    public static void main(String[] args) {
        ReverseList solution = new ReverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode reversed = solution.reverseList(head);
        while (reversed != null) {
            System.out.println(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}
