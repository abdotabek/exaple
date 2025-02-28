package org.example.leet;

/**
 * Merge Two Sorted Linked Lists
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted linked list and return the head of the new sorted linked list.
 * The new list should be made up of nodes from list1 and list2.
 * */


public class MergeTwoList {
    public ListNode twoList(ListNode list1, ListNode list2) {
        // если один из списков пустой, возвращаем и соединяем
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Создаем фиктивный узел для удобства построения результата
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Пока оба списка не пусты, сравниваем и соединяем
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;        // Берем узел из list1
                list1 = list1.next;          // Сдвигаем указатель list1
            } else {
                current.next = list2;        // Берем узел из list2
                list2 = list2.next;          // Сдвигаем указатель list2
            }
            current = current.next;          // Переходим к следующему узлу результата
        }
        // Если остались узлы в list1, прицепляем их
        if (list1 != null) {
            current.next = list1;
        }
        // Если остались узлы в list2, прицепляем их
        if (list2 != null) {
            current.next = list2;
        }
        // Возвращаем начало нового списка (пропускаем фиктивный узел)
        return dummy.next;
    }

}
