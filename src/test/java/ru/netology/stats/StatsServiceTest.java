package ru.netology.stats;

import com.sun.source.tree.StatementTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


public class StatsServiceTest {

    @DisplayName("Calculate sum sales")
    @ParameterizedTest
    @MethodSource("sumTestData")
    public void calculateSum(int[] data, int expected) {
        StatsService stats = new StatsService();
        int actual = stats.sum(data);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("avgTestData")
    public void calculateAvg(int[] data, int expected) {
        StatsService stats = new StatsService();
        int actual = stats.avg(data);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("maxIndexTestData")
    public void findIndexForMaxItem(int[] data, int expected) {
        StatsService stats = new StatsService();
        int actual = stats.max(data);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("minIndexTestData")
    public void findIndexForMinItem(int[] data, int expected) {
        StatsService stats = new StatsService();
        int actual = stats.min(data);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("belowAvgTestData")
    public void countItemsBelowAvgSum(int[] data, int expected) {
        StatsService stats = new StatsService();
        int actual = stats.countBelowAvg(data);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("underAvgTestData")
    public void countItemsUnderAvgSum(int[] data, int expected) {
        StatsService stats = new StatsService();
        int actual = stats.countUnderAvg(data);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> sumTestData() {

        return Stream.of(
                arguments(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}, 180),
                arguments(new int[]{0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0}, 30)
        );
    }

    static Stream<Arguments> avgTestData() {
        return Stream.of(
                arguments(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}, 15),
                arguments(new int[]{0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0}, 2)
        );
    }

    static Stream<Arguments> maxIndexTestData() {
        return Stream.of(
                arguments(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}, 8),
                arguments(new int[]{0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0}, 7)
        );
    }

    static Stream<Arguments> minIndexTestData() {
        return Stream.of(
                arguments(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}, 9),
                arguments(new int[]{0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0}, 12)
        );
    }

    static Stream<Arguments> belowAvgTestData() {
        return Stream.of(
                arguments(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}, 5),
                arguments(new int[]{0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0}, 4)
        );
    }

    static Stream<Arguments> underAvgTestData() {
        return Stream.of(
                arguments(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}, 5),
                arguments(new int[]{0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0}, 6)
        );
    }


}


