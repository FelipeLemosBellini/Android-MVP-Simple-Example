package com.example.mvp_android_architecture;

public class Model {
    int counter = 0;

    public void increment() {
        counter++;
    }

    public void decrement() {
        if(counter >0) counter--;
    }
}
