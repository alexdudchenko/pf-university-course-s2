package com.company.stat;

import java.util.ArrayList;
import java.util.HashMap;

public interface Strategy {
    ArrayList<String> getPopular(HashMap<String, Integer> map);
}
