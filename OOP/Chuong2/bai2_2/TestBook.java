package bai2_2;

import bai2_1.Author;
public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("John Smith", "johnsmith@example.com", 'M');
        Author author2 = new Author("Jane Doe", "janedoe@example.com", 'F');
        Author[] authors = { author1, author2 };

        Book book1 = new Book("Java Programming", authors, 29.99, 100);

        System.out.println(book1);

        System.out.println("Ten sach: " + book1.getName());
        System.out.println("Ten tac gia: " + book1.getAuthorNames());
        System.out.println("Gia sach: " + book1.getPrice());
        System.out.println("So luong: " + book1.getQty());

        book1.setPrice(39.99);
        book1.setQty(50);

        System.out.println("\nSau khi thay doi gia va so luong:");
        System.out.println(book1);
    }
}
 