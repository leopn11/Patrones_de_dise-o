package singleton;

public class Main {
    public static void main(String[] args) {
        Application apply = Application.getInstance();
        Application apply2 = Application.getInstance();

        apply.lightApp();
        apply2.lightApp();

        System.out.println(apply + " " + apply2);
    }
}
