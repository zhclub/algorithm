package com.zhouhao.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 三个线程按顺序调度，分别输出P、A、Y 三个字符，累计输出n次
 */
class ThreadSchedule {

    private static AtomicInteger count = new AtomicInteger(0);

    void threadSchedule(int n) {
        for (int i = 0; i < 3; i++) {
            int num = i;
            new Thread(() -> {
                for (int j = 0; j < n; j++) {
                    exec(num);
                }
            }).start();
        }
    }

    private void exec(int num) {
        while (count.get() % 3 != num) {
            Thread.yield();
        }

        if (num == 0) {
            System.out.print("P");
        } else if (num == 1) {
            System.out.print("A");
        } else {
            System.out.print("Y");
        }

        count.addAndGet(1);
    }

}
