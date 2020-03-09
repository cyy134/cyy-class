package com.cdes.choose.controller;

public class TestVarStatic {
    public static int staticVar = 0;
    public int intVar = 0;
    public TestVarStatic(){
        staticVar++;
        intVar++;
    }

    @Override
    public String toString() {
        return "TestVarStatic{" +
                "intVar=" + intVar +
                '}';
    }

    public static void main(String[] args){
        TestVarStatic testVarStatic = new TestVarStatic();
        System.out.print(testVarStatic.toString()+"+"+TestVarStatic.staticVar);
        TestVarStatic testVarStatic1 = new TestVarStatic();
        System.out.print(testVarStatic1.toString()+"+"+TestVarStatic.staticVar);
    }
}
