import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        person male = new person();
        male.setFirstName("Garry");
        male.setLastName("Yalemeister");
        male.setGender("male");
        male.setDateOfBirth(LocalDate.of(1979, 1, 10));

        person female = new person();
        female.setFirstName("Pamela");
        female.setLastName("Isley");
        female.setGender("female");
        female.setDateOfBirth(LocalDate.of(1966, 6, 27));

        System.out.println("Date of Birth: " + male.getDateOfBirth());
        System.out.println("First Name: " + male.getFirstName());
        System.out.println("Last  Name: " + male.getLastName());
        System.out.println("Gender: " + male.getGender());
        ;

        System.out.println("Date of Birth: " + female.getDateOfBirth());
        System.out.println("First Name: " + female.getFirstName());
        System.out.println("Last  Name: " + female.getLastName());
        System.out.println("Gender: " + female.getGender());
    }
}
