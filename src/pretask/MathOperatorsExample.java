package pretask;

public class MathOperatorsExample {
    int x = 8;
    int y = 4;
    int z;

    public void main(String[] args) {
        MathOperatorsExample example = new MathOperatorsExample();
        example.z = example.x + example.y;
        System.out.println("x + y = " + example.z);
        example.z = example.x - example.y;
        System.out.println("x - y = " + example.z);
        example.z = example.x * example.y;
        System.out.println("x * y = " + example.z);
        example.z = example.x / example.y;
        System.out.println("x / y = " + example.z);
    }
}
//объявите две целочисленные переменные
// и выполните операции сложения, вычитания, умножения и деления, выведите результаты на экран;,