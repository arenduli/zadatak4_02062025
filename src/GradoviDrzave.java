import java.util.*;

public class GradoviDrzave {

    public static void main(String[] args) {

        Map<String, TreeSet<String>> drzave = new HashMap<>();   // inicijalizacija mape s predefiniranim državama
        drzave.put("Hrvatska", new TreeSet<>());         // sa TreeSet ne moraš sortirati svaku listu posebno (kao što bi morala s ArrayList)
        drzave.put("Italija", new TreeSet<>());
        drzave.put("Njemačka", new TreeSet<>());

        Scanner scanner = new Scanner(System.in);
        String input;

        // petlja za unos gradova za predefiniranu državu
        while (true) {
            System.out.print("Unesite grad ili s '0' izađite iz programa: ");
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("0")) {
                break;
            }

            System.out.print("Odaberite državu (1-Hrvatska, 2-Italija, 3-Njemačka): ");
            String izbor = scanner.nextLine().trim();

            switch (izbor) {
                case "1":
                    drzave.get("Hrvatska").add(input);
                    break;
                case "2":
                    drzave.get("Italija").add(input);
                    break;
                case "3":
                    drzave.get("Njemačka").add(input);
                    break;
                default:
                    System.out.println("Greška, upišite ispravan broj države!");
            }
        }

        // petlja za prikaz gradova za odabranu državu
        while (true) {
            System.out.print("Unesite državu za koju želite ispis gradova, ili izađite iz programa s '0': ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("0")) {
                break;
            }

            if (drzave.containsKey(input)) {
                System.out.println("Gradovi u " + input + ": " + drzave.get(input));
            } else {
                System.out.println("Greška, unesite jednu od mogućih država!");
            }
        }

        scanner.close();
    }
}