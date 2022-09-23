import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


//        for (int i = 1; i <101 ; i++) {
//            if( i % 15 == 0){
//                System.out.println("fizz" + " " + "buzz");;
//            }  else if ( i % 5 == 0){
//                System.out.println("buzz");
//            }  else if ( i % 3 == 0 ) {
//                System.out.println("fizz");
//            } else  {
//                System.out.println(i);
//            }
//
//        }

//        Random random = new Random();
//        int numberToGuess = random.nextInt(100) + 1;
//        Scanner scanner = new Scanner(System.in);
//
//        boolean wasNumberGuessed = false;
//
//        while (!wasNumberGuessed) {
//            System.out.println("Podaj liczbe");
//            int userNumber = scanner.nextInt();
//            if (userNumber > numberToGuess) {
//                System.out.println("Wpisałes za dużą liczbe");
//            }  else if (userNumber < numberToGuess) {
//                System.out.println("wpisales za małą liczbe");
//
//            } else {
//                System.out.println("brawo to jest własciwa liczba");
//                wasNumberGuessed = true;
//            }
//        }

//

//        List<String> names = new ArrayList<>();
//
//        names.add("Radek");
//        names.add("Bolek");
//        names.add("Lolek");
//
//        for (String name : names) {
//            System.out.println(name);
//
//        }
//
//        names.remove("Bolek");
//        for (String name: names
//             ) {
//            System.out.println(name);
//
//        }
//
//        Collections.sort(names);
//        System.out.println(names);

//    Set<String > meals = new HashSet<>();
//
//    meals.add("pizza");
//    meals.add("burger");
//    meals.add("salad");
//
//
//        for (String meal: meals) {
//            System.out.println(meal);
//        }
//
//
//
//    }
//    Map<String, String> nameToMeal = new HashMap<>();
//
//    nameToMeal.put("Łukasz", "Pizza");
//    nameToMeal.put("Dominik", "burger");
//    nameToMeal.put("Jan", "salatka");
//
//        System.out.println(nameToMeal.get("Jan"));
//
//        Set <String> keys = nameToMeal.keySet();
//        for (String key: keys){
//            System.out.println(key);
//        }
        Scanner scanner = new Scanner(System.in);
        Party party = new Party();
//        boolean shouldContinue = true;

        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj Gościa");
            System.out.println("3.Wyświetl potrawy");
            System.out.println("4.Znajdz po numerze telefonu");
            System.out.println("5. Wyjscie");

            int userChoice = scanner.nextInt();
            switch (userChoice){
                case 1 -> party.showGuests();
                case 2 -> party.addGuest();
                case 3 -> party.showMeals();
                case 4 -> {
                    System.out.println("Podaj numer telefonu");
                    party.findByPhoneNumber();
                }
                case 5 -> shouldContinue = false;
            }

        }




//        party.addGuest();
//        party.addGuest();
//        party.addGuest();
//        party.showGuests();

    }
}