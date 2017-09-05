import java.util.*;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner ina = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę całkowitą: ");
    	Binary number1 = new Binary(in.nextInt());
		System.out.println("Podaj działanie (dodawanie: +; odejmowanie: -): ");
		String symbol = ina.nextLine();
		int modulus = 1;
		if (symbol.equals("-")) {modulus = -1;}
		System.out.println("Podaj drugą liczbę całkowitą: ");
		Binary number2 = new Binary(in.nextInt()* modulus);

		SumBinary zm = new SumBinary(number1.getNumber(),number1.changeToBinary(),number1.getI(),number2.getNumber(),number2.changeToBinary(),number2.getI());

		zm.sumBinary();
		System.out.print("Wynik działania w kodzie ZM: ");
		System.out.print(zm.getSum(31) + ".");
		for(int i = zm.getI(); i >= 0; i--){System.out.print(zm.getSum(i));}
		System.out.println();

		BinaryZU1 zu1a = new BinaryZU1(zm.getA(),zm.getI());
		BinaryZU1 zu1b = new BinaryZU1(zm.getB(),zm.getI());

		SumZU1 zu1 = new SumZU1(zu1a.setBinaryZU1(),zm.getI(),zu1b.setBinaryZU1(),zm.getI());
		zu1.sumZU1();
		System.out.print("Wynik działania w kodzie ZU1: ");
		System.out.print(zu1.getZU1(31) + ".");
		for(int i = zu1.getI(); i >= 0; i--){System.out.print(zu1.getZU1(i));}
		System.out.println();

		BinaryZU2 zu2a = new BinaryZU2(zm.getA(),zm.getI());
		BinaryZU2 zu2b = new BinaryZU2(zm.getB(),zm.getI());

		SumZU2 zu2 = new SumZU2(zu2a.setZU2(),zm.getI(),zu2b.setZU2(),zm.getI());
		zu2.sumZU2();
		System.out.print("Wynik działania w kodzie ZU2: ");
		System.out.print(zu2.getZU2(31) + ".");
		for(int i = zu2.getI(); i >= 0; i--){System.out.print(zu2.getZU2(i));}


    }
}
