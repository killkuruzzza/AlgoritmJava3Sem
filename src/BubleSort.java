public class BubleSort {
    public void sort() {
        boolean needSort;
        do {
            needSort = false;
            Node node = head;
            while (node != null && node.next != null){
                if (node.value > node.next.value){
                    Node before = node.prev;
                    Node after = node.next.next;
                    Node current = node;
                    Node next = node.next;

                    current.next = after;
                    current.prev = next;
                    next.next = current;
                    next.prev = before;
                    if (before != null){
                        before.next = next;
                    } else {
                        head = next;
                    }
                    if (after != null) {
                        after.prev = current;
                    } else  {
                        tail = current;
                    }

                    needSort = true;
                }
                node = node.next;
            }
        } while (needSort);
    }
}
