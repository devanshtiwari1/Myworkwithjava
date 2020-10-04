package devansh;
import java.io.*;
public class CurrencyConverter {
	double[] exchangeRates={63.0,3.0,3.0,595.0,18.0,107.0,2.0};
void printCurrencies()
{
	System.out.println("rupee: " + exchangeRates[0]);
	System.out.println("dirham: " + exchangeRates[1]);
	System.out.println("real: " + exchangeRates[2]);
	System.out.println("chilean_pesco: " + exchangeRates[3]);
	System.out.println("mexico_pesco: " + exchangeRates[4]);
	System.out.println("_yen: " + exchangeRates[5]);
	System.out.println("$australian: " + exchangeRates[6]);
	System.out.println("the length is " + exchangeRates.length);
}
public static void main(String args[])
{
	CurrencyConverter cc=new CurrencyConverter();
	cc.printCurrencies();
}
}
