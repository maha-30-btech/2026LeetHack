
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode thead=head;
        while(thead!=null){
            list.add(thead.val);
            thead=thead.next;
        }
        list.sort(null);
        thead=head;
        int index=0;
        while(thead!=null){
            thead.val=list.get(index++);
            thead=thead.next;
        }
        return head;
    }
}
