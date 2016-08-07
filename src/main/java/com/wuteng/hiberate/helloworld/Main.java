package com.wuteng.hiberate.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wuteng1 on 2016/8/5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                list.add(scanner.nextInt());
            }
            int res = recursive(list);
            System.out.println(res);

        }
    }

    public static int recursive(List<Integer> list){
        int res = Integer.MAX_VALUE;
        if(list.size() == 0)
            return 0;
        else if(list.size() == 1)
            return list.get(0);
        else if(list.size() == 2)
            return list.get(0) + list.get(1);
        for(int i = 0; i < list.size(); i++){
            int temp = list.get(i) + list.get((i+1) % list.size());
            List<Integer> newList = new ArrayList<Integer>();
            if(i == list.size()-1){
                newList.add(temp);
                for(int k = 1; k > 0 && k < list.size()-1; k++){
                    newList.add(list.get(k));
                }
            }
            else{
                for(int k = 0; k < list.size(); k++){
                    if(k < i)
                        newList.add(list.get(k));
                    else if(k > i+1){
                        newList.add(list.get(k));
                    }
                    else if(k == i){
                        newList.add(temp);
                    }
                }
            }
            res = Math.min(res, temp + recursive(newList));
        }
        return res;
    }
}
