package Stack;

public class Stack {
    private int top;
    private int maxSize;
    private Object[] stackArray;

    //스택 생성, 스택의 최대 크기로 생성
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1; // top은 -1로 초기화
    }

    //스택이 비었는지 체크
    public boolean empty() {
        return (top == -1);
    }

    //스택이 꽉찼는지 체크
    public boolean full() {
        return (top == maxSize-1);
    }

    //스택에 item 입력
    public boolean push(Object item) {
        if(full()) {
            System.out.println("꽉 찼습니다.");
            return false;
        }
        stackArray[++top] = item;
        return true;
    }

    //스택의 가장 위의 데이터 제거
    public Object pop() {
        if(empty()) {
            System.out.println("비었습니다.");
            return false;
        } else {
            Object item = stackArray[top];
            stackArray[top] = null;
            top--;
            return item;
        }
    }

    //스택 출력
    public void printStack(Stack stack) {
        if(top != -1) {
            for(int i=top; i<=top; i--) {
                if(i == -1) {
                    break;
                }
                    System.out.println(" | " + stackArray[i] + " | ");
                    System.out.println("----------");
            }
        }else {
            System.out.println("비어있음");
        }
    }
}