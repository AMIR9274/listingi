public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 2;
        b = 3;
        System.out.println("a равно 2, b равно 3");
        if (a < b) System.out.println("a меньше b");
        if (a > b) System.out.println("этот текст вы никогда не увидите");
        c = a - b;
        System.out.println("c равно -1");
        if (c >= 0) System.out.println("c имеет положительное значение");
        if (c < 0) System.out.println("c имеет отрицательное значение");
        d = b - a;
        System.out.println("d равно 1");
        if (d >= 0) System.out.println("d имеет положительное значение");
        if (d < 0) System.out.println("d имеет отрицательное значение");
        if (a + c != b) System.out.println("a плюс с не равняется b");
        if (a + d == b) System.out.println("a плюс d равняется b");
    }
}