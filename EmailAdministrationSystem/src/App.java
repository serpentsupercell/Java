import emailApp.Email;
public class App{
    
    public static void main(String[] args) {
        Email em1 = new Email("Ritesh","Kumar");
        em1.changePassword("This1sN3wPasswor0!$");
        em1.alternateEmail("ch.rit@gmail.com");
        em1.mailboxCapacity(400);

        System.out.println("\n\n");
        em1.getInfo();
        
    }


}