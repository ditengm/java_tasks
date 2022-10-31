import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Лермонтов М. Ю.", "lerm@gmail.com", 'M');
        System.out.println(author);
        author.setEmail("lerm@yandex.ru");
        System.out.println(author.getEmail());
    }
}
