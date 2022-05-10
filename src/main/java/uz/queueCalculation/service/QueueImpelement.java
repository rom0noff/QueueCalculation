package uz.queueCalculation.service;

import uz.queueCalculation.model.VariblesData;

import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImpelement implements NavbatInterface{


    Clock clock2 = Clock.systemUTC();

    Queue<Integer> navbat = new LinkedList();

    VariblesData variblesData = new VariblesData();

    @Override
    public void queueAdd() {
        navbat.add(variblesData.getCountr());
        System.out.println("============================");
        System.out.println("YOUR QUEUE: ");
        Iterator integerIterator = navbat.iterator();
        while (integerIterator.hasNext()){
            System.out.println(navbat.peek());
            navbat.remove();
        }
        System.out.println(clock2.instant());
        System.out.println("============================");

    }


}
