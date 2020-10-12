
/*2.	Конзолен конвертор: от радиани в градуси
Напишете програма, която чете ъгъл в радиани (rad) и го преобразува в градуси (deg).
 Използвайте формулата:
  градус = радиан * 180 / π.Числото π в Java програми е достъпно чрез Math.PI. 
  Закръглете резултата до най-близкото цяло число използвайки "%.0f".
Примерен вход и изход
вход	изход		вход	изход		вход	изход		вход	Изход
3.1416	180		6.2832	360		0.7854	45		0.5236	30
 * */
import java.util.Scanner;
public class RadianstoDegrees {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			double radDegree = Double.parseDouble(scanner.nextLine());
			double degree = radDegree * 180 / Math.PI;
			System.out.printf("%.0f",degree);
	}
}
