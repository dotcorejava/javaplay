import static java.lang.System.out;

public class Hello {
    public static void main(String[] args) {
        out.println("Hello, world!");
    }
}

// java ./Hello.java
// Hello, world!

// javac ./Hello.java

// java ./Hello
// Error: Could not find or load main class ..Hello
// Caused by: java.lang.ClassNotFoundException: //Hello

// java Hello
// Hello, world!