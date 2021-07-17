package LinkedList;
public class Main {
    public static void main(String[] args){
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addFirst(2);
        numbers.add(2,5);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.removeFirst();
        System.out.println(numbers);
    }
}
