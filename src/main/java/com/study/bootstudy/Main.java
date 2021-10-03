package com.study.bootstudy;

import com.study.bootstudy.sort.BubbleSort;
import com.study.bootstudy.sort.JavaSort;
import com.study.bootstudy.sort.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    ApplicationContext context = new AnnotationConfigApplicationContext();


    public static void main(String[] args) {
        Sort<Integer> bs = new JavaSort<>();

        System.out.println("result = "+bs.sort(Arrays.asList(5,2,4,1,3)));

    }
}
