import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bus_List bus_list = new Bus_List();
        Seat_Book seat_book = new Seat_Book();
        Devloper de1 = new Devloper();
        Cancel cancel = new Cancel();
        Login_info info = new Login_info();
        while (true) {
            System.out.println("Enter Username: ");
            String username = scanner.nextLine();
            if (username.equals(info.getUser_name())) {
                System.out.println("Enter Password: ");
                String pass = scanner.nextLine();
                if (pass.equals(info.getPass())) {
                    while (true) {
                        System.out.println("\t\t1.View Bus Ticket List");
                        System.out.println("\t\t2.Book Bus Tickets");
                        System.out.println("\t\t3.Cancel Booking");
                        System.out.println("\t\t4.Exit");
                        System.out.println("\t\t5.Help Line");
                        System.out.println("\t\t6.Devloper Information ");
                        int ch = scanner.nextInt();
                        switch (ch) {
                            case 1:
                                bus_list.view();
                                System.out.println("Enter 1 to continue: ");
                                scanner.next();
                                break;
                            case 2:
                                seat_book.view();
                                System.out.println("Enter press any key continue: ");
                                scanner.next();
                                break;
                            case 3:
                                seat_book.callCancel();
                                System.out.println("Enter press any key  to continue: ");
                                scanner.next();
                                break;
                            case 4:
                                return;

                            case 5:
                                de1.help();
                                System.out.println("Enter 1 press to continue");
                                scanner.next();
                                break;
                            case 6:
                                de1.dev();
                                System.out.println("Press_1");
                                scanner.next();
                                break;
                        }
                    }
                } else System.out.println("Invalid pass");
            } else {
                System.out.println("invalid UserName");
            }
        }
    }
}