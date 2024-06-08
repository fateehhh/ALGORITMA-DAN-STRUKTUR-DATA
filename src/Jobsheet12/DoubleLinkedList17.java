package Jobsheet12;

public class DoubleLinkedList17 {
    Node17 head;
    int size;

    public DoubleLinkedList17() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst (int item, int jarak){
        if (isEmpty()) {
            head = new Node17(null, item, jarak, null);
        } else {
            Node17 newNode = new Node17(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index) {
        Node17 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }

    public void addLast(int item){
        if (isEmpty()) {
           addFirst(item, item);
        } else {
            Node17 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node17 newNode17 = new Node17(current, item, item, current);
            current.next = newNode17;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item, index);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        } else {
            Node17 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node17 newNode17 = new Node17(current, index, i, current);
                current.prev = newNode17;
                head = newNode17;
            } else {
                Node17 newNode17 = new Node17(current, index, i, current);
                newNode17.prev = current.prev;
                newNode17.next = current;
                current.prev.next = newNode17;
                current.prev = newNode17;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()) {
            Node17 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked l ist masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!"); 
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } 
        Node17 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public int getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node17 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nileai indeks diluar batas.");
        }
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
