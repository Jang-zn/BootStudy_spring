package com.study.bootstudy.sort;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void given_List_WhenExcuting_ThenReturnSortedList(){
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> result = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        //then
        assertEquals(List.of(1,2,3,4,5), result);

    }

}