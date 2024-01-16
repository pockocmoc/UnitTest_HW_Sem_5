import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AverageCalculatorTest {

    private final AverageCalculator calculator = new AverageCalculator();

    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = calculator.calculateAverage(numbers);
        assertEquals(3.0, average, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageWithEmptyList() {
        List<Integer> numbers = List.of();
        calculator.calculateAverage(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageWithNullList() {
        calculator.calculateAverage(null);
    }

    @Test
    public void testCompareAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        String result = calculator.compareAverages(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompareAveragesWithEmptyLists() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();
        calculator.compareAverages(list1, list2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompareAveragesWithNullLists() {
        calculator.compareAverages(null, null);
    }
}
