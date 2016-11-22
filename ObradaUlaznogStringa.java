public class ObradaUlaznogStringa {

	public static void main(String[] args) throws MojaIznimkaViseOdDvaParametra {
		int rez = 0;
		//BOJE
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_BLACK = "\u001B[30m";
		final String ANSI_RED = "\u001B[31m";

		try {
			if (args.length > 2) {
				throw new MojaIznimkaViseOdDvaParametra("Poruka: unio si vise od dva argumenta");
			}

			rez = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println("rezultat = " + rez);

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(ANSI_RED + "Unesi argumente" + ANSI_RESET);
		}
		catch (NumberFormatException e) {
			System.out.println(ANSI_RED + "Uneseni argumenti moraju biti brojevi" + ANSI_RESET);
		}
		catch (MojaIznimkaViseOdDvaParametra e) {
			System.out.println(ANSI_RED + "Uneseni dva argumenta \n"+ e + ANSI_RESET);
			//System.out.println(ANSI_RED + "Uneseni dva argumenta " + ANSI_RESET);
		}
	//System.out.println("rezultat = " + rez);
	}
}

class MojaIznimkaViseOdDvaParametra extends Exception {
	public MojaIznimkaViseOdDvaParametra(String msg){
		super(msg);
	}
}
