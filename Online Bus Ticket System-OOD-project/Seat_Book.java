public class Seat_Book extends Bus_List {
    Cancel cancel = new Cancel();
    Payment payment = new Payment();
    int total=0;
    String name="";
    @Override
    void view() {
       // super.view();
        System.out.println("Choose a Bus: ");
        int ch= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Your Name: ");
        this.name= scanner.nextLine();
        System.out.println("How Many Seats You Want: ");
        int wn=scanner.nextInt();
        System.out.println("One Ticket is "+150);
        System.out.println("Make Payment");
        payment.setAmouont(wn);
        System.out.println("Press 1 To Proceed 0 to Cancel");
        int ch1=scanner.nextInt();
        if(ch1==1){
            System.out.println("Name: "+name);
            System.out.println("Seat: "+wn);
            total= payment.getAmouont();
            System.out.println("Total: "+total);
            while (true) {
                System.out.println("Enter The Otp: ");
                int otp = scanner.nextInt();
                if (otp == payment.getOtp()) {
                    System.out.println("Booking Complete");
                    break;
                } else System.out.println("Wrong Otp");
            }
        }
        else return;
    }
    void callCancel(){
        cancel.cancel(name,total);
    }
}
