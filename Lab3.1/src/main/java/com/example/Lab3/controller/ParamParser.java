package com.example.Lab3.controller;

import javax.servlet.http.HttpServletRequest;

public class ParamParser {
    public ParamData parseParameters(HttpServletRequest request) {
        ParamData inputData = new ParamData();

        inputData.setaFrom(Double.parseDouble(request.getParameter("aFrom")));
        inputData.setaTo(Double.parseDouble(request.getParameter("aTo")));
        inputData.setaStep(Double.parseDouble(request.getParameter("aStep")));

        inputData.setbFrom(Double.parseDouble(request.getParameter("bFrom")));
        inputData.setbTo(Double.parseDouble(request.getParameter("bTo")));
        inputData.setbStep(Double.parseDouble(request.getParameter("bStep")));

        inputData.setcFrom(Double.parseDouble(request.getParameter("cFrom")));
        inputData.setcTo(Double.parseDouble(request.getParameter("cTo")));
        inputData.setcStep(Double.parseDouble(request.getParameter("cStep")));

        inputData.setdFrom(Double.parseDouble(request.getParameter("dFrom")));
        inputData.setdTo(Double.parseDouble(request.getParameter("dTo")));
        inputData.setdStep(Double.parseDouble(request.getParameter("dStep")));

        return inputData;
    }
}
