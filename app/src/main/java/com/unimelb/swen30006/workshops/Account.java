package com.unimelb.swen30006.workshops;

public class Account {
    public State state;


    public void onboard() {
        state = State.PENDING;
    }

    public void activate() {
        if (state == State.PENDING) {
            state = State.ACTIVE;
        }
    }

    public void spendingLimitExceeded() {
        if (state == State.ACTIVE) {
            state = State.SUSPENDED;
        }
    }
}
