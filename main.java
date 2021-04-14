public class main {
    public static void main(String[] args) {
        TeenNumberChecker teen = new TeenNumberChecker();
        boolean check = false;
        check = teen.hasTeen(9,99,19);
        System.out.println(check);
        check = teen.hasTeen(23,15,42);
        System.out.println(check);
        check = teen.hasTeen(22,23,34);
        System.out.println(check);
    }
}

