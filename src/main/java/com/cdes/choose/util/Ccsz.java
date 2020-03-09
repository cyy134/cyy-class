package com.cdes.choose.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ccsz{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请随机输入你喜欢的5个正整数：");
        List<Integer> num = new ArrayList<>();
        for(int i = 0; i<5; i++){
            num.add(input.nextInt());
        }

    }
}
