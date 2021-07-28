package com.example.Lab3.model;

import com.example.Lab3.controller.ParamData;

import java.util.ArrayList;

public class Calculation {
    public ArrayList<ResultDataRow> calculate(ParamData paramData) {
        IBusinessLogic businessLogic = new BusinessLogic();
        ArrayList<ResultDataRow> arrayList = new ArrayList<>();

        for (double a = paramData.getaFrom(); a <= paramData.getaTo(); a += paramData.getaStep()) {
            for (double b = paramData.getbFrom(); b <= paramData.getbTo(); b += paramData.getbStep()) {
                for (double c = paramData.getcFrom(); c <= paramData.getcTo(); c += paramData.getcStep()) {
                    for (double d = paramData.getdFrom(); d <= paramData.getdTo(); d += paramData.getdStep()) {
                        arrayList.add(new ResultDataRow(a, b, c, d, businessLogic.evaluate(a, b, c, d)));
                    }
                }
            }
        }

        return arrayList;
    }

}
