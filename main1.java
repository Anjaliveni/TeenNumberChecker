public class main1 {
    public static void main(String[] args) {
    TeenNumberChecker teen = new TeenNumberChecker();
    boolean check = false;
    check = teen.isTeen(9);
    System.out.println(check);
    check = teen.isTeen(13);
    System.out.println(check);
}
}
