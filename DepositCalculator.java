
/*3.	Калкулатор депозити
Напишете програма, която изчислява каква сума ще получите в
 края на депозитния период при определен лихвен процент. Използвайте следната формула: 
сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
Вход
От конзолата се четат 3 реда:
1.	Депозирана сума – реално число в интервала [100.00 … 10000.00];
2.	Срок на депозита(в месеци) – цяло число в интервала [1…12];
3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00];
Изход
Да се отпечата на конзолата сумата в края на срока.
Вход	Изход	Обяснения
200
3
5.7	202.85	1. изчисляваме натрупаната лихва: 200 * 5.7% = 11.4лв.
2. изчисляваме лихвата за 1 месец: 11.4лв./12 месеца = 0.95лв
3. общата сума е 200лв депозит + (3 (срок на депозита) * 0.95 лв)
Вход	Изход	
2350
6
7
	2432.25	

 * */
import java.util.Scanner;
public class DepositCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sumMoney = Double.parseDouble(scanner.nextLine());
		if (sumMoney>=100 && sumMoney<=10000) {
			int mountYear = Integer.parseInt(scanner.nextLine());
			if (mountYear>=1 && mountYear<=12) {
				double percentMoney = Double.parseDouble(scanner.nextLine());
				if (percentMoney>=0 && percentMoney<=100) {
				double firstSum = ((sumMoney*percentMoney)/100)/12;
				double lastSum = sumMoney +(mountYear*firstSum);
				System.out.printf("%.2f",lastSum);
				} else {
					System.out.println("Inavalid parameter!");
				}
			} else {
				System.out.println("Inavalid parameter! Please 1..12!");
			}
		} else {
			System.out.println("Inavalid parameter!");
		}
	}
}
