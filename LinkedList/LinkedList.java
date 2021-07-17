package LinkedList;
public class LinkedList{
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node{
        private Object data;
        private Node next;

        public Node(Object input){ //노드 생성
            this.data = input;
            this.next = null;
        }
    }

    public void addFirst(Object input){ // head쪽에 생성
        Node newNode = new Node(input); // node 생성
        newNode.next = head; // 새로 만든 node의 next는 헤드를 가리킴
        head = newNode; // 헤드는 새로 만든 node로 변경
        size++;
        if(head.next == null){
            tail = head;
        }
    }

    public void addLast(Object input){ // tail쪽에 생성
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input);
        } else {
            tail.next = newNode; // 꼬리의 next를 새로 만든 node로 지정
            tail = newNode; // 꼬리는 새로 만든 node로 변경
            size++;
        }
    }

    Node node(int index){ // 중간에 추가할 때 사용
        Node x = head;
        for(int i = 0; i < index; i++){ // index번째의 주소로 이동하기 위한 for문
            x = x.next;
        }
        return x;
    }
    
    public void add(int k, Object input){ // 중간에 추가
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }
    public String toString() {
        if(head == null){
            return "[]";
        }       
        Node temp = head;
        String str = "[";
        while(temp.next != null){ // 마지막 값의 주소가 없어서 추가 안됌
            str += temp.data + ",";
            temp = temp.next;
        }

        str += temp.data; // 마지막 값 추가
        return str+"]";
    }
    public void removeFirst(){ // head쪽에 삭제
        head = head.next;
        size--;
    }
    public void remove(int k){ // 중간에 삭제
        if(k == 0)
            removeFirst();
        Node temp = node(k-1);
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        if(todoDeleted == tail){
            tail = temp;
        }
        todoDeleted = null; 
        size--;
    }
}