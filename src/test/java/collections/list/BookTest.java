package collections.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("В классе Book должен: ")
public class BookTest {

    @Test
    @DisplayName("Корректно работать конструктор")
    public void shoudHasGotCorrectContructor(){
        Book actualBook = new Book ("The Lord Of the Rings", "Tolkein", 700);

        assertEquals("The Lord Of the Rings", actualBook.getName());
        assertEquals("Tolkein", actualBook.getAuthor());
        assertEquals(700, actualBook.getPagesCount());

        assertAll(() -> assertEquals ("The Lord Of the Rings", actualBook.getName()),
                () -> assertEquals("Tolkein", actualBook.getAuthor()),
                () -> assertEquals( 700, actualBook.getPagesCount()));

    }

    @Test
    @DisplayName(" корректно работать сеттер для кол-ва стр")
    public void shoudHasGotCorrectSetterForPagesCount(){
        Book book = new Book ("The Lord Of the Rings", "Tolkein", 700);
        book.setPagesCount(800);

        assertEquals(800, book.getPagesCount());


    }

















}
