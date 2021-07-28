package com.company.stat;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstStrategy implements Strategy{
    private int popularCount;

    @Override
    public ArrayList<String> getPopular(HashMap<String, Integer> map) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : map.keySet()) {
            if (map.get(str) > popularCount) {
                popularCount = map.get(str);
            }
        }

        for (String str : map.keySet()) {
            if (map.get(str) == popularCount) {
                arrayList.add(str);
            }
        }

        return arrayList;
    }
}
