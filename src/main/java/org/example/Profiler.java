package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Profiler {
    // TODO : Profiler 구현
    private ArrayList<Integer>data;
    private SortServiceLib sort;


    public void setData(ArrayList<Integer> input) {
        data = input;
    }

    public void setLib(SortServiceLib sortServiceLib) {
        sort = sortServiceLib;
    }


    public void runLib() {
        sort.sort(data);
    }

    public void showResult() {
        System.out.println(sort.getName()+" 테스트");
        System.out.println("정렬결과 : "+ Arrays.toString(data.toArray()));
        System.out.println("swap횟수:"+sort.getChangeCnt()+"회");

    }
}
