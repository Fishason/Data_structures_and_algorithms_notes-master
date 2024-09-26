package My_code;

/**
 * @author Fish
 * @version 1.0
 */
public class Calculator {
    public static void main(String[] args) {
        String expression = "3+6*3-7";
        ArrayStack2 numStack2 = new ArrayStack2(10);
        ArrayStack2 operStack2 = new ArrayStack2(10);
        int index = 0;
        int num1 = 0, num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        while (index < expression.length()) {
            ch = expression.charAt(index);
            if (operStack2.isOper(ch)) {
                if (operStack2.isEmpty()) {
                    if(operStack2.priority(ch)<=)
                }else{

                }
            }
        }
    }
}

//定义一个 ArrayStack2 表示栈
class ArrayStack2 {
    private int maxSize; // 栈的大小
    private int[] stack; // 数组，数组模拟栈，数据就放在该数组
    private int top = -1;// top表示栈顶，初始化为-1

    //构造器
    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    //栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈-push
    public void push(int value) {
        //先判断栈是否满
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈-pop, 将栈顶的数据返回
    public int pop() {
        //先判断栈是否空
        if (isEmpty()) {
            //抛出异常
            throw new RuntimeException("栈空，没有数据~");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //显示栈的情况[遍历栈]， 遍历时，需要从栈顶开始显示数据
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空，没有数据~~");
            return;
        }
        //需要从栈顶开始显示数据
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    //返回运算符的优先级，优先级是由人为决定 的，优先级用数字表示
    public int priority(char ch) {
        if (ch == '*' || ch == '/') {
            return 1;
        }else if (ch == '+' || ch == '-') {
            return 0;
        }else{
            return -1;
        }
    }

    //判断是不是运算符
    public boolean isOper(char ch) {
        return ch == '+' || ch == '-' || ch == '*'|| ch == '/';
    }

    public int cal(int num1, int num2,char oper) {
        int res = 0;
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                break;
        }
        return res;
    }

    public int show
}
