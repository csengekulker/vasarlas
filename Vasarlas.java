import java.util.Scanner;

class Vasarlas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Balogh Csenge, Szoft_I_N, 2022.02.17");
	System.out.println("Vásárlás 10 000 Ft-ból");

	System.out.println("Az egyenleg 10 000 Ft.");

	int credit = 10000;

	int flour = 300;
	int honey = 1000;
	int milk = 200;

	System.out.print("Liszt (300Ft/kg) > ");
	int boughtFlour = sc.nextInt();
	System.out.print("Méz (1000Ft/kg) > ");
	int boughtHoney = sc.nextInt();
	System.out.print("Tej (200Ft/l) > ");
	int boughtMilk = sc.nextInt();

	int flourPrice = flour * boughtFlour;
	int honeyPrice =  honey * boughtHoney;
	int milkPrice = milk * boughtMilk;

	int priceSum = flourPrice + honeyPrice + milkPrice;

	if (priceSum > credit) {
          System.out.println("Nincs elég pénzed :(");
	  System.exit(0);
        } else {
	  credit -= priceSum;
	  System.out.println("Sikeres vásárlás :)");
	  System.out.println("Fennmaradó egyenleged " + credit + "Ft.");
	}
    }
}
