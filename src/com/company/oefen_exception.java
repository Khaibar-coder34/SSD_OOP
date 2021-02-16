package com.company;

import java.util.Scanner;

class MyException1 extends Exception{

    @Override
    public String toString() {
        return super.toString() + "I am toString()";

    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage() ";
    }

        }




