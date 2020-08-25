import java.util.Scanner;
import static java.lang.System.out;

public class Loops {
    public static void main(String[] args) {
        compareString();
        calcBMI();
        guessAction();

        var m = 10;
        var n = 100;
        while (m <= n) {
            out.println(m);
            m++;
        }

        for (String arg : args) {
            out.println(arg);
        }
    }

    private static void compareString() {
        var s1 = "hello";
        var s2 = "hello";
        var s3 = "HELLO".toLowerCase();

        if (s1 == s2) {
            out.println(true);
        } else {
            out.println(false);
        }
        if (s1 == s3) {
            out.println(true);
        } else {
            out.println(false);
        }
        if (s1 != null && s1.equals(s3)) {
            out.println(true);
        } else {
            out.println(false);
        }
    }

    private static void calcBMI() {
        var scanner = new Scanner(System.in);

        out.println("请输入体重：");
        var weight = scanner.nextFloat();
        out.println("请输入身高：");
        var height = scanner.nextFloat();

        var bmi = Math.pow(weight / height, 2);

        if (bmi < 18.5) {
            out.print("过轻：");
        } else if (bmi <= 25) {
            out.print("正常：");
        } else if (bmi <= 28) {
            out.print("过重：");
        } else if (bmi <= 32) {
            out.print("肥胖：");
        } else {
            out.print("非常肥胖：");
        }

        out.println(bmi);
        scanner.close();
    }

    private static void guessAction() {
        var scanner = new Scanner(System.in);
        out.println("请输入：");
        var action = scanner.nextInt();

        switch (action) {
            case 1:
                out.println(1);
                break;
            case 2:
                out.println(2);
                break;
            default:
                out.println(3);
                break;
        }
        scanner.close();
    }
}

// string 类型是引用类型，且值不可变，比较值可以用.equals方法

// 请用if … else编写一个程序，用于计算体质指数BMI，并打印结果。
// BMI = 体重(kg)除以身高(m)的平方
// BMI结果：
// 过轻：低于18.5
// 正常：18.5-25
// 过重：25-28
// 肥胖：28-32
// 非常肥胖：高于32

// 使用switch实现一个简单的石头、剪子、布游戏。

// 使用while计算从m到n的和：