import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private HashMap<Integer, Guest> phoneToGuess = new HashMap();
    Scanner scanner = new Scanner(System.in);

    public void addGuest(){
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();
         System.out.println("Podaj posilek ulubiony");
        String meal = scanner.nextLine();
        System.out.println("Podaj numer ");
        int phoneNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("CZy jest Veganinem?");
        String vegan = scanner.nextLine();
        boolean isVegan;
        if (vegan.equals("tak")){
            isVegan = true;
            } else {
            isVegan = false;
        }
        Guest guest = new Guest(name, meal,phoneNumber, isVegan);
        guests.add(guest);
        phoneToGuess.put(phoneNumber, guest);
        meals.add(meal);
    }


    public void showGuests(){
        for (Guest guest: guests) {
           guest.displayGuestInformation(); ;

        }
    }
    public void findByPhoneNumber () {
      int searchedPhoneNumber = Integer.valueOf(scanner.nextLine());
//        for (Guest guest: guests) {
//            if(guest.getPhoneNumber() == searchedPhoneNumber){
//                System.out.println(guest.getName());
//            }
//        }
        Guest guest = phoneToGuess.get(searchedPhoneNumber);
        guest.displayGuestInformation();
    }

    public void showMeals() {
        for (Guest guest: guests) {
            guest.displayMealInformation();
        }
    }


}
