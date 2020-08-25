import static java.lang.System.out;
import static java.util.Arrays.sort;

public class Arrays {
    public static void main(String[] args) {
        for (String arg : args) {
            out.println(arg);
        }
        int[] ns = { 1, 2, 3, 4, 5, 6 };
        out.println(ns); // [I@4d7e1886
        for (int i : ns) {
            out.println(i);
        }

        for (int i = ns.length - 1; i > 0; i--) {
            out.println(i);
        }

        var ns1 = new int[] { 43, 2, 56, 3, 76, 5 };

        for (int i = 0; i < ns1.length - 1; i++) {
            for (int j = 0; j < ns1.length - 1 - i; j++) {
                if (ns1[j] < ns1[j + 1]) {
                    var t = ns1[j];
                    ns1[j] = ns1[j + 1];
                    ns1[j + 1] = t;
                }
            }
        }
        for (int i : ns1) {
            out.println(i);
        }

        var ns2 = new int[] { 43, 2, 56, 3, 76, 5 };
        sort(ns2);
        for (int i : ns2) {
            out.println(i);
        }
    }
}

// 请按倒序遍历数组并打印每个元素：
// 请思考如何实现对数组进行降序排序：