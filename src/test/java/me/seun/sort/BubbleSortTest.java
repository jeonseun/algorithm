package me.seun.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testSortEmptyArray() {
        int[] emptyArray = {};
        int[] sortedArray = {};

        BubbleSort.sort(emptyArray);
        Assertions.assertArrayEquals(sortedArray, emptyArray);
    }

    @Test
    void testSortOrderedArray() {
        int[] orderedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BubbleSort.sort(orderedArray);
        Assertions.assertArrayEquals(sortedArray, orderedArray);
    }

    @Test
    void testSortReverseOrderedArray() {
        int[] reverseOrderedArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BubbleSort.sort(reverseOrderedArray);
        Assertions.assertArrayEquals(sortedArray, reverseOrderedArray);
    }

    @Test
    void testSortRandomOrderedArray() {
        int[] randomOrderedArray = {8, 2, 10, 5, 1, 7, 3, 4, 9, 6};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BubbleSort.sort(randomOrderedArray);
        Assertions.assertArrayEquals(sortedArray, randomOrderedArray);
    }

    @Test
    void testSortSingleElementArray() {
        int[] singleElementArray = {1};
        int[] sortedArray = {1};

        BubbleSort.sort(singleElementArray);
        Assertions.assertArrayEquals(sortedArray, singleElementArray);
    }

    @Test
    void testSortNegativeElementArray() {
        int[] negativeArray = {-8, -2, -10, -5, -1, -7, -3, -4, -9, -6};
        int[] sortedArray = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1};

        BubbleSort.sort(negativeArray);
        Assertions.assertArrayEquals(sortedArray, negativeArray);
    }

    @Test
    void testSortMixedElementArray() {
        int[] mixedArray = {8, 4, 7, -2, 9, 6, 3, -5, 1, -10};
        int[] sorted = {-10, -5, -2, 1, 3, 4, 6, 7, 8, 9};

        BubbleSort.sort(mixedArray);
        Assertions.assertArrayEquals(sorted, mixedArray);
    }

    @Test
    void testSortDuplicatedElementArray() {
        int[] duplicatedElementArray = {8, 2, 10, 10, 1, 7, 7, 4, 9, 6};
        int[] sorted = {1, 2, 4, 6, 7, 7, 8, 9, 10, 10};

        BubbleSort.sort(duplicatedElementArray);
        Assertions.assertArrayEquals(sorted, duplicatedElementArray);
    }

}