package it.shop;
import java.util.Random;

public class Prodotto {

	//attributi
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva = (float) 0.22;
	
	
	//elementi del costruttore
	Prodotto(String nome,String descrizione) {
		this.codice = codice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo();
		
	}
	
	//getter setter

	public int getCodice() {
		return this.codice;
	}
	
	private void setCodice(int codice) {
		this.codice = codice;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getIva() {
		return iva;
	}

	
	
	//metodo che genera un codice casuale per identificare il prodotto
	
	private int codice() {
		Random random = new Random();
		return random.nextInt(100);
	}
		
		private float prezzo() {
			Random random = new Random();
			float a = random.nextFloat();
			return a;
				
	}
		public float calcoloPrezzo() {
			float calcoloPrezzo = prezzo + (prezzo * iva) ;
			return calcoloPrezzo;
		}
	
	
	
	
	
	
	
	
}
