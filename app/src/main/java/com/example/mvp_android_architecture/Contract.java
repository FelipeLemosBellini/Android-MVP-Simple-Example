package com.example.mvp_android_architecture;

public class Contract {

    interface View {
        void updateCounter(int newValue);
    }

    interface Presenter {
        void incrementCounter();
        void decrementCounter();

        void attach(View view);

        void detach();
    }


}
