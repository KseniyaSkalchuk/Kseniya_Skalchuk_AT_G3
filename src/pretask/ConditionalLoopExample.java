package pretask;

public class ConditionalLoopExample {
    public void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("number is : " + i);
                continue;
            }
        }
    }
}



//используйте цикл for, чтобы вывести четные числа от 1 до 10,
// с использованием условного оператора if для пропуска нечетных чисел;,