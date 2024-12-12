package TrainTicketBooking;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BookTicket {
        private static final int CAPACITY = 3;
        private CancelTicket cancel;
        private RacList rac;
        private WaitingList waiting;
        private int occupied;
        private int id;
        private Queue<Passanger> passangers;
    
        public BookTicket() {
            this.id = 1;
            this.cancel = new CancelTicket();
            this.rac = new RacList();
            this.waiting = new WaitingList();
            this.passangers = new LinkedList<>();
        }
    
        public void startBooking() {
            this.run(new Scanner(System.in));
        }
    
        private void run(Scanner sc) {
            this.showOptions();
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    this.bookTicket(sc);
                }
                case 2 -> {
                    if (!cancel.run(sc, passangers, rac, waiting)) {
                        this.occupied--;
                    }
                }
                case 3 -> {
                    this.showTickets();
                }
                case 4 -> {
                    rac.showRacList();
                }
                case 5 -> {
                    waiting.showWaitingList();
                }
                case 6 -> {
                    System.out.println("See ya");
                    return;
                }
                default -> {
                    System.out.println("Invalid Choice!");
                    run(sc);
                }
            }
            run(sc);
        }
    
        private void bookTicket(Scanner sc) {
            if (waiting.isFull()) {
                System.out.println("Sorry to say but we're out of tickets");
                System.out.println();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }            
                return;
            }
            System.out.print("Enter Your Name : ");
            String name = sc.next();
            System.out.println();
            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();
            System.out.println();
            System.out.print("Enter Your Prefference : ");
            String prefference = sc.next();
            System.out.println();
            if (!this.isFull()) {
                Passanger ticket = new Passanger(this.id++, name, age, this.occupied+1, prefference);
                this.occupied++;
                this.book(ticket);
            } else {
                Passanger ticket = new Passanger(this.id++, name, age, null, prefference);
                this.checkRAC(ticket);
            }
        }
    
        private void book(Passanger ticket) {
            this.passangers.offer(ticket);
            System.out.println("Booking Confirmed ");
            System.out.println("Your booking id is " + (this.id - 1) + " and your seat is " + this.occupied);
            System.out.println();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }            
    }
    
        private void checkRAC(Passanger ticket) {
            if (!rac.isFull()) {
                rac.add(ticket);
                System.out.println("Sorry no seats are available you are in RAC list");
                System.out.println("Your booking id is " + (this.id - 1));
                System.out.println();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }            
    
            } else {
                this.checkWaitingList(ticket);
            }
        }
    
        private void checkWaitingList(Passanger ticket) {
            waiting.add(ticket);
            System.out.println("You are in waiting list");
            System.out.println("Your booking id is " + (this.id - 1));
            System.out.println();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }            
    }
    
        private boolean isFull() {
            return this.occupied == BookTicket.CAPACITY;
    }

    private void showTickets() {        
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

    private void showOptions() {
        System.out.println("Choose option");
        System.out.println("1. Book ticket ");
        System.out.println("2. Cancel ticket ");
        System.out.println("3. Show booked tickets ");
        System.out.println("4. Show RAC List ");
        System.out.println("5. Show waiting List ");
        System.out.println("6. Exit ");
    }
}
