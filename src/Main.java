public class Main {
    public static void main(String[] args) {
        ApiService x=ApiService.getInstance();
        System.out.println(x.s);
        Human human=new Human.Builder("What is love",15).height(178).build();

    }
}
