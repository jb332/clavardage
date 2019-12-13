package clavardeur;
import java.net.*;

public class Personne {
	private InetAddress adresse;
	private String pseudo;
	/**
	 * @param adresse
	 * @param pseudo
	 */
	public Personne(InetAddress adresse, String pseudo) {
		this.adresse=adresse;
		this.pseudo = pseudo;
	}
	public String getPseudo() {
		return pseudo;
	}
	public InetAddress getAdresse() {
		return adresse;
	}
	public void setPseudo(String nouveauPseudo) {
		pseudo=nouveauPseudo;
	}

}