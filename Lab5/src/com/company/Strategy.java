package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Strategy {
    ArrayList<String> commonestWords(String filename) throws IOException;
}
