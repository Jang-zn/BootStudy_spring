package com.study.bootstudy;

import com.study.bootstudy.config.Config;
import com.study.bootstudy.service.SortService;
import com.study.bootstudy.sort.BubbleSort;
import com.study.bootstudy.sort.JavaSort;
import com.study.bootstudy.sort.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService ss = context.getBean(SortService.class);

        System.out.println("result = "+ss.doSort(Arrays.asList(args)));

    }
}
