package TrainTicketBooking;

import java.util.LinkedList;
import java.util.Queue;

public class RacList {
    private static final int CAPACITY = 1;
    private int occupied;
    private Queue<Passanger> passangers;

    public RacList() {
        this.passangers = new LinkedList<>();
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

    public Queue<Passanger> getPassangers() {
        return passangers;
    }

    public int getOccupied() {
        return occupied;
    }

    public void showRacList() {
        for (Passanger passanger : passangers) {
            System.out.println("------------------------------------");
            System.out.println("Passanger ticket id : " + passanger.getId());
            System.out.println("Passanger name : " + passanger.getName());
            System.out.println("Passanger age : " + passanger.getAge());
            System.out.println("Passanger seat no : " + passanger.getSeatNO());
            System.out.println("Passanger Prefference : " + passanger.getPrefference());
            System.out.println("------------------------------------");
        }
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public boolean isFull() {
        return this.occupied == RacList.CAPACITY;
    }

    public void add(Passanger ticket) {
        passangers.offer(ticket);
        this.occupied++;
    }
}
