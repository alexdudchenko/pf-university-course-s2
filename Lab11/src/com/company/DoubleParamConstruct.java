package com.company;

@FunctionalInterface
public interface DoubleParamConstruct<T,R,P> {
    T get(R aParam, P bParam);
}
