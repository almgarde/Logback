package com.everis.logbackago;

/**
 * Proyecto Logback
 * 
 * @author agadelao
 * 
 */

/**
 * Clase Scanner
 */
import java.util.Scanner;

/**
 * Librería números
 */
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Librería fechas
 */
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Logger
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZodiacMain {
	
	final static Logger LOGGER = LoggerFactory.getLogger(ZodiacMain.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

LOGGER.info("Inicio método principal");
		
		/**
		 * Clase Scanner: entrada por teclado
		 */
		Scanner sc = new Scanner(System.in);

		/**
		 * Formateador de la fecha
		 */
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MMMM");

		/**
		 * Opción escogida: String
		 */
		String opt;

		/**
		 * Opción escogida: int
		 */
		int sel;

		/**
		 * Menú de opciones
		 */

		System.out.println("¿Quieres saber cuándo le toca a un signo del Zodiaco?");

		System.out.println("1 - " + ZodiacSigns.SIGNAR);
		System.out.println("2 - " + ZodiacSigns.SIGNTAU);
		System.out.println("3 - " + ZodiacSigns.SIGNGEM);
		System.out.println("4 - " + ZodiacSigns.SIGNCAN);
		System.out.println("5 - " + ZodiacSigns.SIGNLEO);
		System.out.println("6 - " + ZodiacSigns.SIGNVIR);
		System.out.println("7 - " + ZodiacSigns.SIGNLI);
		System.out.println("8 - " + ZodiacSigns.SIGNES);
		System.out.println("9 - " + ZodiacSigns.SIGNSA);
		System.out.println("10 - " + ZodiacSigns.SIGNCA);
		System.out.println("11 - " + ZodiacSigns.SIGNAC);
		System.out.println("12 - " + ZodiacSigns.SIGNPI);

		System.out.println("Dime qué signo del Zodiaco quieres consultar. Escoge FIN para terminar.");

		// Opción escogida por teclado
		opt = sc.nextLine();

		/**
		 * Verificación de dato numérico
		 */
		do {
			if (!NumberUtils.isCreatable(opt)) {
				LOGGER.error("Dato introducido incorrecto");
				System.out.println("Tienes que introducir un dato correcto. Prueba otra vez");
				opt = sc.nextLine();
			}
		} while (!NumberUtils.isCreatable(opt));

		/**
		 * Intervalo restrictivo
		 */
		do {
			if (NumberUtils.toInt(opt) < 0 || NumberUtils.toInt(opt) > 12) {
				LOGGER.error("Dato fuera de rango");
				System.out.println("Hay que introducir una opción entre 1 y 12. Prueba otra vez.");
				opt = sc.nextLine();
			}

		} while (NumberUtils.toInt(opt) < 0 || NumberUtils.toInt(opt) > 12);

		// Transformación de la opción escogida (opt) de cadena de texto a int
		sel = NumberUtils.toInt(opt);

		LOGGER.debug("Se ha escogido la opción {}", sel );
		/**
		 * Ejecución método Switch
		 */
		buscaFecha(fmt, sel);
		
		LOGGER.info("Final método principal");

	}

	// Método Switch para el menú de opciones

	/**
	 * @param fmt
	 * @param sel
	 */
	private static void buscaFecha(DateTimeFormatter fmt, int sel) {
		LOGGER.info("Inicio método switch");
		
		switch (sel) {
		case 1:
			System.out.println(ZodiacSigns.SIGNAR + ": " + fmt.print(Dates.DATE3.plusDays(1)) + " al " + fmt.print(Dates.DATE4));
			break;
		case 2:
			System.out.println(ZodiacSigns.SIGNTAU + ": " + fmt.print(Dates.DATE4.plusDays(1)) + " al " + fmt.print(Dates.DATE5));
			break;
		case 3:
			System.out.println(ZodiacSigns.SIGNGEM + ": " + fmt.print(Dates.DATE5.plusDays(1)) + " al " + fmt.print(Dates.DATE6));
			break;
		case 4:
			System.out.println(ZodiacSigns.SIGNCAN + ": " + fmt.print(Dates.DATE6.plusDays(1)) + " al " + fmt.print(Dates.DATE7));
			break;
		case 5:
			System.out.println(ZodiacSigns.SIGNLEO + ": " + fmt.print(Dates.DATE7.plusDays(1)) + " al " + fmt.print(Dates.DATE8));
			break;
		case 6:
			System.out.println(ZodiacSigns.SIGNVIR + ": " + fmt.print(Dates.DATE8.plusDays(1)) + " al " + fmt.print(Dates.DATE9));
			break;
		case 7:
			System.out.println(ZodiacSigns.SIGNLI + ": " + fmt.print(Dates.DATE9.plusDays(1)) + " al " + fmt.print(Dates.DATE10));
			break;
		case 8:
			System.out.println(ZodiacSigns.SIGNES + ": " + fmt.print(Dates.DATE10.plusDays(1)) + " al " + fmt.print(Dates.DATE11));
			break;
		case 9:
			System.out.println(ZodiacSigns.SIGNSA + ": " + fmt.print(Dates.DATE11.plusDays(1)) + " al " + fmt.print(Dates.DATE12));
			break;
		case 10:
			System.out.println(ZodiacSigns.SIGNCA + ": " + fmt.print(Dates.DATE12.plusDays(1)) + " al " + fmt.print(Dates.DATE1));
			break;
		case 11:
			System.out.println(ZodiacSigns.SIGNAC + ": " + fmt.print(Dates.DATE1.plusDays(1)) + " al " + fmt.print(Dates.DATE2));
			break;
		case 12:
			System.out.println(ZodiacSigns.SIGNPI + ": " + fmt.print(Dates.DATE2.plusDays(1)) + " al " + fmt.print(Dates.DATE3));
			break;

			
			}
		
		LOGGER.info("Final método switch");
	}

}
