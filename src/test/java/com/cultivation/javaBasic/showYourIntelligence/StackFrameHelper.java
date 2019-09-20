package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int var = stackTraceElements[2].toString().indexOf("(");
        return stackTraceElements[2].toString().substring(0,var);
        // --end-->
    }
}
