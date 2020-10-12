
/*8.	Аквариум
За рождения си ден Любомир получил аквариум с формата на паралелепипед.
 Първоначално прочитаме от конзолата на отделни редове размерите му – дължина,
  широчина и височина в сантиметри. Трябва да се пресметне колко литра вода ще събира аквариума,
   ако се знае, че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа. 
Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/. 
Да се напише програма, която изчислява литрите вода,
 която са необходими за напълването на аквариума.
Вход
От конзолата се четат 4 реда:
1.	Дължина в см – цяло число в интервала [10 … 500]
2.	Широчина в см – цяло число в интервала [10 … 300]
3.	Височина в см – цяло число в интервала [10… 200]
4.	Процент  – реално число в интервала [0.000 … 100.000]
Изход
Да се отпечата на конзолата едно число:
•	литрите вода, които ще  събира аквариума.
Резултатът да се форматира до вторта цифра след десетичната запетая. 
Примерен вход и изход
Вход	Изход	Обяснения
85
75
47
17	248.69	Изчисляваме обема на аквариума:
обем на аквариум= 85*75*47=299625 см3
общо литри, които ще събере: 299625 * 0.001=299.625 литра
процент: 17*0.01=0.17
литрите, които реално ще трябват : 299.625*(1-0.17) = 248.68875 литра
Вход	Изход	
105
77
89
18.5	586.45	
 * */
import java.util.Scanner;
public class FishTank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int lengthAquariumCm = Integer.parseInt(scanner.nextLine());
		 	if (lengthAquariumCm>=10 && lengthAquariumCm<=500) {
		 		int widthAquariumCm = Integer.parseInt(scanner.nextLine());
		 		if (widthAquariumCm>=10 && widthAquariumCm<=300) {
		 			int hightAquariumCm = Integer.parseInt(scanner.nextLine());
		 			if (hightAquariumCm>=10 && hightAquariumCm<=200) {
		 			double percentNumber = Double.parseDouble(scanner.nextLine());
		 			if (percentNumber>=0 && percentNumber<=100) {
		 			//	double valueRent = Double.valueOf(priceRent);
		 				int volumeAquarium = 0;
		 				double literAquarium = 0;
		 				double lastSume = 0;
		 					volumeAquarium = widthAquariumCm*hightAquariumCm*lengthAquariumCm;
		 					literAquarium = volumeAquarium*0.001;
		 					percentNumber = percentNumber*0.01;
		 				   lastSume = literAquarium * (1-percentNumber);
		 				  System.out.printf("%.2f",lastSume);
		 				}else {
		 					System.out.println("Invalid parameter!");
						}
					} else {
						System.out.println("Invalid parameter!");
					}
				} else {
					System.out.println("Invalid parameter!");
				}
		} else {
			System.out.println("Invalid parameter!");
		}
	}
}
