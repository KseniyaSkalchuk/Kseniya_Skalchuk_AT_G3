package pretask;

public class MultiplicationTable {
    public void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int x = 5;
            int z = i * x;
            System.out.println(i + " * " + x + " = " + z);
        }
    }
}
//•	класс MultiplicationTable, используя цикл for,
// выведите на экран таблицу умножения для числа 5 (1 * 5, 2 * 5, и так далее);,