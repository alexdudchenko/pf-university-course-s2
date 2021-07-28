package com.company.onlythread;

import com.company.stat.Result;

import java.io.IOException;

public interface TextStatProcessor {

    Result processText(String filename, Result result) throws IOException;
}
