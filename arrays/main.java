package arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Hi Arrays 🚀🚀🚀");

        Array<String> names = new Array<String>(2);
        names.insert("zakaria");
        names.insert("tesla");
        names.insert("meta");

        names.remove(3);

        System.out.println(names);
    }
}
