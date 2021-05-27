package tests;


import static org.junit.jupiter.api.Assertions.*;

import com.applitools.eyes.MatchLevel;
import data.BookIds;
import models.Book;
import org.junit.jupiter.api.Test;


import java.util.List;

public class SearchTests extends BaseTests {

    @Test
    public void searchByFullTitle(){
        String title = "Agile Testing";
        page.search(title);
        assertTrue(page.isBookVisible(title));
        assertEquals(1, page.getNumberOfVisibleBooks());
    }

    @Test
    public void searchByPartialTitle(){
        page.search("Test");

        var expectedBooks = List.of(
                "Test Automation in the Real World",
                "Experiences of Test Automation",
                "Agile Testing",
                "How Google Tests Software",
                "Java For Testers"
        );

        expectedBooks.forEach(b->page.isBookVisible(b));
        assertEquals(expectedBooks.size(), page.getNumberOfVisibleBooks());
    }
}