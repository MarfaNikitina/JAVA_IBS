public class Task12 {
    public static void main(String[] args) {
        checkString("I like Java!!!");
    }

    public static void checkString(@org.jetbrains.annotations.NotNull String sentence) {
        boolean containsJava = sentence.contains("Java");
        boolean startsWithLike = sentence.startsWith("I like");
        boolean endsWithFun = sentence.endsWith("!!!");
        if (containsJava && startsWithLike && endsWithFun) {
            System.out.println(sentence.toUpperCase());
            System.out.println(sentence.replace("a", "o").substring(7, 11));
        }
    }
}
