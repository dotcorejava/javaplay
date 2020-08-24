import static java.lang.System.out;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        var sum = nSum(5);
        out.println(sum);

        out.println(nSum(100) == 5050 ? "测试通过" : "测试不通过");

        out.println(unitaryX(1, 3, -4));
        inOut();
    }

    private static int nSum(int n) {
        return (1 + n) * n / 2;
    }

    private static double unitaryX(double a, double b, double c) {
        return Math.sqrt(b * b / 4 / (a * a) - c) - b / 2 * a;
    }

    private static void inOut() {
        out.println("输入1：");
        var scanner = new Scanner(System.in);
        var n1 = scanner.nextInt();

        out.println("输入2：");
        var n2 = scanner.nextInt();
        scanner.close();
        out.println((double) (n2 - n1) / n1);
    }
}

// 计算前N个自然数的和
// 公式 (1 + n)*n/2

// 解一元二次方程
// ax^2 + bx + c = 0

// 请帮小明同学设计一个程序，
// 输入上次考试成绩（int）和本次考试成绩（int），
// 然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。