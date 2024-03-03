import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MontyHallParadoxTest extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    void testWinningScenario(String selectedDoor) {
        // Мокаем ввод пользователя
        scanner = new Scanner(selectedDoor);
        MontyHallParadox.main(null);
        // Проверяем, что игрок выйграл приз
        assertEquals("Поздравляем! Вы выиграли приз!", System.out.toString().split("\n")[11]);
    }

    @Test
    void testLosingScenario() {
        // Мокаем ввод пользователя
        scanner = new Scanner("1\nнет");
        MontyHallParadox.main(null);
        // Проверяем, что игрок проиграл
        assertEquals("К сожалению, за этой дверью была коза.", System.out.toString().split("\n")[11]);
    }

    @Test
    void testInvalidInput() {
        // Мокаем неверный ввод пользователя
        scanner = new Scanner("4");
        MontyHallParadox.main(null);
        // Проверяем, что программа выводит сообщение об ошибке
        assertEquals("Exception in thread \"main\" java.util.InputMismatchException", System.out.toString().split("\n")[0]);
    }
}
