package com.huaxin;

public class ShuiXianHua {
    public static void main(String[] args){
        
        for(int i = 1; i < 1000; i++){
            int j1 = i / 100;//取得百位数
            int j2 = (i - (j1 * 100)) / 10;//取得十位数
            int j3 = (i - (j1 * 100 + j2 *10));//取得个位数
            if(j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 *j3 == i){
                System.out.println(i + "这是一个水仙花数");
            }
        }
    }
}
