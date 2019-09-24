public class UserClient {
    public static void main(String[] args) {
        System.out.println(User.getWelcomeMessage());
        User user1 = new User("Bob", 12345);
        System.out.println(User.getWelcomeMessage());
        System.out.println(user1.getUsername());
        System.out.println(user1.validLogin("Bob" , 12345));
        User user2 = new User("Karen", 456);
        User.setDisplayNewest(true);
        System.out.println(User.getWelcomeMessage());

    }
}
