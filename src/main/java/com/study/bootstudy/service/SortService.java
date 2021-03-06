package com.study.bootstudy.service;

import com.study.bootstudy.sort.JavaSort;
import com.study.bootstudy.sort.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("className : "+sort.getClass().getName());
        System.out.println("ㄴㅁㄹㄴㅁ");
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
