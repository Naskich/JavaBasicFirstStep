
/*6.Благотворителна кампания
В сладкарница се провежда благотворителна кампания за събиране на средства,
 в която могат да се включат сладкари от цялата страна. Първоначално прочитаме
  от конзолата броя на дните, в които тече кампанията и броя на сладкарите, които ще се включат.
   След това на отделни редове получаваме количеството на тортите, гофретите и палачинките,
    които ще бъдат приготвени от един сладкар за един ден. Трябва да се има предвид следния
     ценоразпис:
•	Торта - 45 лв.
•	Гофрета - 5.80 лв.
•	Палачинка - 3.20 лв.
1/8 от крайната сума ще бъде използвана за покриване на разходите за продуктите
 по време на кампанията. Да се напише програма, която изчислява сумата, която е 
 събрана в края на кампанията.
Вход
От конзолата се четат 5 реда:
1.	Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
2.	Броят на сладкарите – цяло число в интервала [0 … 1000]
3.	Броят на тортите – цяло число в интервала [0… 2000]
4.	Броят на гофретите – цяло число в интервала [0 … 2000]
5.	Броят на палачинките – цяло число в интервала [0 … 2000]
Изход
Да се отпечата на конзолата едно число:
•	парите, които са събрани.
Резултатът да се форматира до вторта цифра след десетичната запетая. 
Примерен вход и изход
Вход	Изход	Обяснения
23
8
14
30
16	137687.20	Изчисляваме сумата, която се изкарва на ден за всеки един
 от продуктите, направени от 1 сладкар:
Торти: 14 * 45 = 630 лв.; 
Гофрети: 30 * 5.80 = 174 лв.; 
Палачинки: 16 * 3.20 = 51.20 лв.
Обща сума за един ден от всички сладкари: (630 + 174 + 51.20) * 8 = 6841.60 лв.
Сума събрана от цялата кампания: 6841.60 * 23 = 157356.8лв.
Сума след покриване на разходите: 157356.8 - 1/8 от 157356.8 = 137687.2 лв.
Вход	Изход	
131
5
9
33
46	426175.75	

 * */
import java.util.Scanner;
public class CharityCampaign {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double cakeSum =0;
		double wafflesSum=0;
		double panCakeSum = 0;
		double allSum = 0;
		double sumCompany = 0;
		double lastSum = 0;
		int workDays = Integer.parseInt(scanner.nextLine());
		if (workDays>=0 && workDays<=365) {
			int numberConfectioners = Integer.parseInt(scanner.nextLine());
			if (numberConfectioners>=0 && numberConfectioners<=1000) {
				int numberCake = Integer.parseInt(scanner.nextLine());
				if (numberCake>=0 && numberCake<=2000) {
					int numberWaffles = Integer.parseInt(scanner.nextLine());
					if (numberWaffles>=0 && numberWaffles<=2000) {
						int numberPanCake = Integer.parseInt(scanner.nextLine());
						if (numberPanCake>=0 && numberPanCake<=2000) {
							cakeSum = numberCake*45;
							wafflesSum = numberWaffles*5.80;
							panCakeSum = numberPanCake*3.20;
							allSum = ((cakeSum + wafflesSum + panCakeSum)*numberConfectioners);
							sumCompany = allSum * workDays;
							lastSum = sumCompany -(sumCompany/8);
							System.out.printf("%.2f",lastSum);
						} else {
							System.out.println("Inavlid parameter! Please 0..2000");
						}
					} else {
					    System.out.println("Inavlid parameter! Please 0..2000");
					}
				} else {
					System.out.println("Inavlid parameter! Please 0..2000");
				}
			} else {
				System.out.println("Inavlid parameter! Please 0..1000");
			}
		} else {
			System.out.println("Inavlid parameter! Please 0..365");
		}
		
	}
}
