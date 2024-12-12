package TrainTicketBooking;

import java.util.Queue;
import java.util.Scanner;

public class CancelTicket {
    public boolean run(Scanner sc, Queue<Passanger> seats, RacList rac, WaitingList waiting) {
        this.showOptions();
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                return cancelTicket(sc, seats, rac, waiting);
            }
            case 2 -> {
                cancelRac(sc, rac, waiting);
            }
            case 3 -> {
                cancelWaitingList(sc, waiting);
            }
            default -> {
                System.out.println("Invalid Choice");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                run(sc, seats, rac, waiting);
            }
        }
        return true;
    }

    private void cancelRac(Scanner sc, RacList rac, WaitingList waiting) {
        System.out.print("Enter Ticket Id : ");
        int ticketId = sc.nextInt();
        System.out.println();

        for (Passanger ticket : rac.getPassangers()) {

            if (ticket.getId() == ticketId) {
                if (waiting.getOccupied() != 0) {
                    rac.getPassangers().offer(waiting.getPassangers().poll());
                }

                rac.getPassangers().remove(ticket);
                rac.setOccupied(rac.getOccupied() - 1);

                System.out.println("Ticket Cancelled Successfully");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return;
            }

        }

        System.out.println("Invalid Id");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void cancelWaitingList(Scanner sc, WaitingList waiting) {
        System.out.print("Enter Ticket Id : ");
        int ticketId = sc.nextInt();
        System.out.println();
        for (Passanger ticket : waiting.getPassangers()) {
            if (ticket.getId() == ticketId) {
                waiting.getPassangers().remove(ticket);
                System.out.println("Ticket Cancelled Successfully");
                waiting.setOccupied(waiting.getOccupied()-1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Invalid Id");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean cancelTicket(Scanner sc, Queue<Passanger> seats, RacList rac, WaitingList waiting) {
        System.out.print("Enter Ticket Id : ");
        int ticketId = sc.nextInt();
        System.out.println();

        for (Passanger ticket : seats) {

            if (ticket.getId() == ticketId) {

                boolean hasAnyRac = false;
                if (rac.getOccupied() != 0) {
                    hasAnyRac = true;
                    Passanger racTicket = rac.getPassangers().poll();
                    racTicket.setPrefference(ticket.getPrefference());
                    racTicket.setSeatNO(ticket.getSeatNO());
                    seats.offer(racTicket);
                    
                    if (waiting.getOccupied() != 0) {
                        rac.getPassangers().offer(waiting.getPassangers().poll());
                        waiting.setOccupied(waiting.getOccupied() - 1);
                    } else {
                        rac.setOccupied(rac.getOccupied() - 1);
                    }
                }

                seats.remove(ticket);
                System.out.println("Ticket Canceled Successfully!!!");
                return hasAnyRac;
            }
        }

        System.out.println("Invalid Id");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return true;
    }

    private void showOptions() {
        System.out.println("Choose option");
        System.out.println("1.Cancel Booked Ticket");
        System.out.println("2.Cancel Rac Ticket");
        System.out.println("3.Cancel Waiting Ticket");
    }
}
