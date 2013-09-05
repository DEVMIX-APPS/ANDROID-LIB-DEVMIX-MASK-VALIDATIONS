package br.com.devmix.libs.maskvalidations;

import java.text.DecimalFormat;

public class NumberManager {

	/**
	 * @autor echer
	 * formata um valor double
	 * @param number valor double para ser formatado
	 * @param pattern formata��o para o valor double Ex: #.00
	 * @return retorna valor formatado double
	 */
	public static Double formatDecimalD(Double number,String pattern){
		String numberString = number.toString();
		numberString.replace(",", ".");
		number = Double.valueOf(numberString);
		DecimalFormat format = new DecimalFormat(); 
		format.applyPattern(pattern);
		return Double.valueOf(format.format(number));
	}
	/**
	 * @autor echer
	 * formata um valor string
	 * @param number valor string para ser formatado
	 * @param pattern formata��o para o valor double Ex: #.00
	 * @return retorna valor formatado double
	 */
	public static Double formatDecimalD(String number,String pattern){
		number.replace(",", ".");
		DecimalFormat format = new DecimalFormat(); 
		format.applyPattern(pattern);
		return Double.valueOf(format.format(number));
	}
	/**
	 * @autor echer
	 * formata um valor double
	 * @param number valor double para ser formatado
	 * @param pattern formata��o para o valor double Ex: #.00
	 * @return retorna valor formatado string
	 */
	public static String formatDecimalS(Double number,String pattern){
		String numberString = number.toString();
		numberString.replace(",", ".");
		number = Double.valueOf(numberString);
		DecimalFormat format = new DecimalFormat(); 
		format.applyPattern(pattern);
		return format.format(number);
	}
	/**
	 * @autor echer
	 * formata um valor double
	 * @param number valor string para ser formatado
	 * @param pattern formata��o para o valor double Ex: #.00
	 * @return retorna valor formatado string
	 */
	public static String formatDecimalS(String number,String pattern){
		number.replace(",", ".");
		DecimalFormat format = new DecimalFormat(); 
		format.applyPattern(pattern);
		return format.format(number);
	}
}
