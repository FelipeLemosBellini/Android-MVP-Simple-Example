package com.example.mvp_android_architecture;

public class Presenter implements Contract.Presenter {
    private Contract.View _view;
    private final Model _model;

    public Presenter() {
        _model = new Model();
    }

    @Override
    public void incrementCounter() {
        _model.increment();
        _view.updateCounter(_model.counter);
    }

    @Override
    public void decrementCounter() {
        _model.decrement();
        _view.updateCounter(_model.counter);
    }

    @Override
    public void attach(Contract.View view) {
        this._view = view;
    }

    @Override
    public void detach() {
        this._view = null;
    }
}
