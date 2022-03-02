package linked;

public class App {

    public static void main(String[] args) {
        linked<String> list = new linked();
        list.inseert("1");
        list.inseert("2");
        list.inseert("3");
        list.inseert("4");
        list.inseert("5");

        System.out.println(list.includes("5"));
        System.out.println(list.includes("6"));

        System.out.println(list);

