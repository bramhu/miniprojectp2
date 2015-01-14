package opdracht_B6;

public class Kaart {
	private String soort;
	private String waarde;

	public Kaart(String srt, String wrd) {
		this.soort = srt;
		this.waarde = wrd;
	}

	public boolean checkSoort(String srt) {
		return true;
	}

	public boolean checkWaarde(String wrd) {
		return true;
	}

	public void setSoort(String srt) {
		soort = srt;
	}

	public void setWaarde(String wrd) {
		waarde = wrd;
	}

	public String getSoort() {
		return soort;
	}

	public String getWaarde() {
		return waarde;
	}
	
	public boolean isKleinerDan(){
		return true;
	}
	
	public String toString(){
		return "s";
	}
}
