/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int tamanhoList1 = tamanho(list1);
        int tamanhoList2 = tamanho(list2);

        ListNode resposta = new ListNode();
        ListNode head = new ListNode();
        resposta = head;

        int tamanho = tamanhoList2 + tamanhoList1;
        int i = 0;
        int j = 0;

        while(i < tamanhoList1 && j < tamanhoList2){
            if(list1.val < list2.val){
                resposta.next = new ListNode(list1.val);
                list1 = list1.next;
                i++;
            }else{
                resposta.next = new ListNode(list2.val);
                list2 = list2.next;
                j++;
            }

            if (i + j == 1){
                resposta = head;
            }
            resposta = resposta.next;
        }

        while(i < tamanhoList1){
             resposta.next = new ListNode(list1.val);
                list1 = list1.next;
                i++;
                if (i + j == 1){
                resposta = head;
            }
             resposta = resposta.next;


        }

        while(j < tamanhoList2){
             resposta.next = new ListNode(list2.val);
                list2 = list2.next;
                j++;

            if (i + j == 1){
                resposta = head;
            }
            resposta = resposta.next;
        }

        return head.next;
        
    }

    public int tamanho (ListNode list1){
        int tamanho = 0;
        while(list1 != null) {
            list1 = list1.next;
            tamanho++;
        }
        return tamanho;
    }
}