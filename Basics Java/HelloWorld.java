import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult;

// import java.lang.AutoCloseable;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a = { 10, 20, 30, 40 };
        System.out.println(Arrays.toString(a));
        a[2] = 100;
        System.out.println(Arrays.toString(a));
        // passing arguments
        // System.out.println("hello" + args[0]);

        // Multipal class in same file
        System.out.println(GenarateMessage.genaratemessage());
        System.out.println(Cat.anotherMessage());
        System.out.println(TestScanner.wordsAndNumbers());

        String words = """
                This is Scanner Example with matchresult so i can understand it better
                """;
        try (Scanner scanner = new Scanner(words)) {
            scanner.findAll("i").map(MatchResult::group).forEach(System.out::println);

            // example of scanner
        }
        // create new scanner with specificed String object
        String str = "Hello world! 23 jdk";
        Scanner scanner = new Scanner(str);
        System.out.println("Scan String is true or false:" + scanner.hasNext("Hello"));

        // find and print the last match
        System.out.println("Last match String:" + scanner.match());
        // print the line
        System.out.println(scanner.nextLine());
        scanner.close();

        // substring

        String string = new String("Hi my name is Meherun");
        System.out.print("this is substring:");
        System.out.println(string.substring(13, 21));

    }
}
