package com.study.bootstudy.service;

import com.study.bootstudy.sort.JavaSort;
import com.study.bootstudy.sort.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
