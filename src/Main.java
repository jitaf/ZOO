import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ManagerZoo zoo = new ManagerZoo();
        // 8 ruznych zvirat
        zoo.pridejZvire(new Pes(2018, "Alik"));
        zoo.pridejZvire(new Pes(2020, "Rex"));
        zoo.pridejZvire(new Had(2015, "Karel"));
        zoo.pridejZvire(new Had(2021, "Snek"));
        zoo.pridejZvire(new Zelva(2010, "Zelvicka"));
        zoo.pridejZvire(new VodniZelva(2012, "Vodena"));
        zoo.pridejZvire(new SuchozemskaZelva(2008, "Suchozemka"));
        zoo.pridejZvire(new Pes(2019, "Baryk"));

        Scanner scanner = new Scanner(System.in);

        int volba;

        do {
            System.out.println();
            System.out.println("===== ZOO =====");
            System.out.println("1 - Vypsat vsechna zvirata");
            System.out.println("2 - Pridat zvire");
            System.out.println("3 - Odebrat zvire");
            System.out.println("4 - Vypsat nejstarsi zvire");
            System.out.println("5 - Vypsat nejmladsi zvire");
            System.out.println("0 - Konec");
            System.out.print("Vyberte moznost: ");

            volba = scanner.nextInt();
            scanner.nextLine();

            switch (volba) {
                case 1:
                    zoo.vypisZvirata();
                    break;

                case 2:
                    System.out.println("Vyber druh zvirete:");
                    System.out.println("1 - Pes");
                    System.out.println("2 - Had");
                    System.out.println("3 - Zelva");
                    System.out.println("4 - Vodni zelva");
                    System.out.println("5 - Suchozemska zelva");
                    System.out.print("Volba: ");

                    int druh = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Zadej jmeno: ");
                    String jmeno = scanner.nextLine();

                    System.out.print("Zadej rok narozeni: ");
                    int rok = scanner.nextInt();
                    scanner.nextLine();

                    if (druh == 1) {
                        zoo.pridejZvire(new Pes(rok, jmeno));
                    } else if (druh == 2) {
                        zoo.pridejZvire(new Had(rok, jmeno));
                    } else if (druh == 3) {
                        zoo.pridejZvire(new Zelva(rok, jmeno));
                    } else if (druh == 4) {
                        zoo.pridejZvire(new VodniZelva(rok, jmeno));
                    } else if (druh == 5) {
                        zoo.pridejZvire(new SuchozemskaZelva(rok, jmeno));
                    } else {
                        System.out.println("Spatna volba druhu.");
                        break;
                    }

                    System.out.println("Zvire bylo pridano.");
                    break;

                case 3:
                    System.out.print("Zadej jmeno zvirete: ");
                    String jmeno2 = scanner.nextLine();
                    zoo.odeberZvire(jmeno2);
                    break;

                case 4:
                    zoo.vypisNejstarsi();
                    break;

                case 5:
                    zoo.vypisNejmladsi();
                    break;

                case 0:
                    System.out.println("Konec programu.");
                    break;

                default:
                    System.out.println("Spatna volba.");
            }

        } while (volba != 0);

        scanner.close();
    }
}
