import java.util.*;

public class GradoviDrzave {

    public static void main(String[] args) {

        Map<String, List<String>> drzave = new HashMap<>();  // inicijalizacija mape s predefiniranim državama
        drzave.put("Hrvatska", new ArrayList<>());
        drzave.put("Italija", new ArrayList<>());
        drzave.put("Njemačka", new ArrayList<>());

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Unesite grad ili s '0' izađite iz programa: ");
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("0")) {
                break;
            }

            System.out.print("Unesite državu (Hrvatska/Italija/Njemačka): ");
            String drzava = scanner.nextLine().trim();

            if (drzave.containsKey(drzava)) {
                drzave.get(drzava).add(input);
            } else {
                System.out.println("Greška, unesite jednu od mogućih država!!");
            }
        }

        // ispis gradova po državama, sortirano po abecedi
        while (true) {
            System.out.print("Unesite državu za koju želite ispis gradova,ili izađite iz programa s '0': ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("0")) {
                break;
            }

            if (drzave.containsKey(input)) {
                List<String> gradovi = drzave.get(input);
                Collections.sort(gradovi);
                System.out.println("Gradovi u " + input + ": " + gradovi);
            } else {
                System.out.println("Greška, unesite jednu od mogućih država!");
            }
        }

        scanner.close();
    }
}
