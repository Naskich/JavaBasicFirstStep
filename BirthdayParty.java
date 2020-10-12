
/*5.	Рожден ден
За рожденният ден на дъщеря си Людмила е решила да организира парти,
 на което да покани всичките ѝ съученици. За целта е решила да наеме развлекателна
  зала за деца, чийто наем ще получите като вход от конзолата. 
Напишете програма, с която да помогнете на Людмила да изчисли какъв бюджет
 ще ѝ бъде необходим, като имате следната информация за допълнителните неща,
  необходими за тържеството:
•	Торта  – цената ѝ е 20% от наема на залата
•	Напитки – цената им е 45% по-малко от тази на тортата
•	Аниматор – цената му е 1/3 от цената за наема на залата
Вход
От конзолата се четe 1 ред:
•	Наем за залата – цяло число в интервала [100..10000]
Изход
Да се отпечата на конзолата какъв бюджет ще бъде необходим за организиране на тържеството. 
Примерен вход и изход
Вход	Изход	Обяснения
2250	3697.5	наем за залата: 2250
цена за тортата: 2250 * 20% = 450
цена за напитки: 450 – 45% = 247.5
цена за аниматор: 1 / 3 от 2250 = 750
необходима сума: 2250 + 450 + 247.5 +750 = 3697.5
3720	6113.2	
 * */
import java.util.Scanner;
public class BirthdayParty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int priceRent = Integer.parseInt(scanner.nextLine());
		if (priceRent>=100 && priceRent<=10000) {
			double valueRent = Double.valueOf(priceRent);
			double priceCake = valueRent*0.2;
			double priceDrinks = priceCake-(priceCake*0.45);
			double animatorMan = valueRent/3;
			double lastSume = valueRent+priceCake+priceDrinks+animatorMan;
			System.out.printf("%.2f",lastSume);
		} else {
			System.out.println("Invalid parameter!");
		}
	}
}
