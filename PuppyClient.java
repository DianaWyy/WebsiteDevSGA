public class PuppyClient {
    public static void main(String[] args) {
        Puppy pup = new Puppy("Pup");
        System.out.println(pup);

        pup.fetch(false);
        System.out.println("Health :" +pup.getHealth());

        pup.fetch(25);
        System.out.println("Health :"+pup.getHealth());
    }
}
