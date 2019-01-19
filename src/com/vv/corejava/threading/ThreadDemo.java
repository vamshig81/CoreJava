package com.vv.corejava.threading;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println(" I am in thtread " + Thread.currentThread().getName());
    }
}

