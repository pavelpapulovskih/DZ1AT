import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;
import java.util.Scanner;

public abstract class TestBase {
    protected Scanner scanner;
    protected Random random;

    @BeforeEach
    void setUp() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    @AfterEach
    void tearDown() {
        scanner.close();
    }
}
