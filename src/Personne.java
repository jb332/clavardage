import java.io.Serializable;
import java.net.*;

public class Personne implements Serializable{

	private static final long serialVersionUID = -5717914954973757973L;
	private InetAddress adresse;
	private int port;
	private String pseudo;
	private boolean connected;
	private long id;
	/**
	 * @param adresse
	 * @param pseudo
	 */
	public Personne(InetAddress adresse,int port, String pseudo,boolean c, long id) {
		this.adresse=adresse;
		this.pseudo = pseudo;
		connected=c;
		this.id=id;
		this.setPort(port);
	}
	
	public boolean getConnected() {return connected;}
	public String getPseudo() {
		return pseudo;
	}
	public InetAddress getAdresse() {
		return adresse;
	}
	public void setPseudo(String nouveauPseudo) {
		pseudo=nouveauPseudo;
	}
	public void setInetAdress(InetAddress a) {
		adresse=a;
	}
	public void setConnected(boolean b) {
		connected=b;
		
	}
	public long getId() {
		return id;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
