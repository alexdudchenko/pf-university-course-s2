package com.company;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Utility {

    public void taskA() {
        DoubleParamConstruct<Test, String, Double> testConstructor = Test::new; //Ссылка на конструктор
        Test test1 = testConstructor.get("This is test ", 1.1);
        System.out.println(test1);
    }

    public void taskB() {
        Consumer<String> writer = Test::staticMethod; //Ссылка на статический метод
        writer.accept("This is test 2. Hello from static method!");
    }

    public void taskC() {
        Test test2 = new Test("testC", 2.2);
        Consumer<String> writer = test2::nonStaticMethod; //Ссылка на не статический метод объекта
        writer.accept("This is test 3. Hello from nonStatic method of object!");
    }

    public void taskD() {
        Test test2 = new Test("test2", 2.2);
        UnaryOperator<String> writer = String::toLowerCase; //Ссылка на не статический метод конкретного типа
        System.out.println(writer.apply("This Is tESt 4. HeLlO fRoM NoN StAtIc MeThOd !"));
    }
}
