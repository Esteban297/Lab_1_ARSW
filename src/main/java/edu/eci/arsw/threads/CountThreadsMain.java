/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {

    public static void main(String c[]) {

        CountThread t0 = new CountThread(0, 99);
        CountThread t1 = new CountThread(99, 199);
        CountThread t2 = new CountThread(200, 299);

        t0.start();
        t1.start();
        t2.start();

//        t0.run();
//        t1.run();
//        t2.run();

    }

}

