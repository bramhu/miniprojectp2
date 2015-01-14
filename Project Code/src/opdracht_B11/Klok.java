package opdracht_B11;

public class Klok {

	public static String kwartOver = "kwart over ";
	public static String half = "half ";
	public static String kwartVoor = "kwart voor ";
	public static String heelUur =  " uur";
	public int minuten;
	public int uren;

	//vergelijken van minuten
	public static String berekenMinuten(int minuten) {

		if (minuten >= 10 && minuten <= 25) {
			return kwartOver;
		}
		if (minuten >= 25 && minuten <= 44) {

			return half;
		}
		if (minuten >= 45 && minuten <= 50) {

			return kwartVoor;
		} else
			return "";
	}

	//uren berekennen met een switch(makkelijker dan if -statement)
	public static String berekenUren(int uren, int minuten){
        String urenGesproken;
        //korte check, als minuten 'half' of 'kwart voor' worden moet er over 1 uur later gesproken worden! 
        if(minuten >= 25){
        	uren++;
        } 
        
        switch (uren) {
            case 1: case 13:  urenGesproken = "een";
                     break;
            case 2: case 14: urenGesproken = "twee";
                     break;
            case 3: case 15:  urenGesproken = "drie";
                     break;
            case 4: case 16:  urenGesproken = "vier";
                     break;
            case 5: case 17:  urenGesproken = "vijf";
                     break;
            case 6: case 18: urenGesproken = "zes";
                     break;
            case 7: case 19: urenGesproken = "zeven";
                     break;
            case 8: case 20: urenGesproken = "acht";
                     break;
            case 9: case 21: urenGesproken = "negen";
                     break;
            case 10: case 22: urenGesproken = "tien";
                     break;
            case 11: case 23: urenGesproken = "elf";
                     break;
            case 12: case 00: urenGesproken = "twaalf";
                     break;
            default: urenGesproken = "ongeldige tijd";
                     break;       
        }
		if (minuten >= 0 && minuten <= 10) {
			return urenGesproken + heelUur;
		}
		return urenGesproken;

	}

	//drukTijdAf gebruikt de 2 tijd functies 
	public static String drukTijdAf(int uren, int minuten) {
		return berekenMinuten(minuten) + berekenUren(uren, minuten);
	}

}
