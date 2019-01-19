package com.vv.corejava.threading;


public class DeadLockOccurs {

    public static void main(String[] args) {

        ThreadDemo tdi = new ThreadDemo();

        Thread one = new Thread(new ThreadDemo());

    }




    class One {
        int i = 10;

        public int increment() {
            return i = i + 1;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    class Two {

    }

}

