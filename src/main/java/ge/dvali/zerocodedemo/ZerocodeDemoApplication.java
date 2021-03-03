package ge.dvali.zerocodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class ZerocodeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZerocodeDemoApplication.class, args);
    }

    @GetMapping("/books")
    public Map<String, List<Book>> getBooks() {
        List<Book> books = new ArrayList<>() {
            {
                add(new Book("The Robotics", "author2"));
                add(new Book("Science", "author3"));
                add(new Book("Ancient History", "author1"));

            }
        };
        return Map.of("books", books);
    }

}
