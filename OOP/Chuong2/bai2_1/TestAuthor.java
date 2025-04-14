package bai2_1;
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        author.setEmail("newEmail@somewhere.com");
        System.out.println("Updated Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        System.out.println(author.toString());
    }
}
