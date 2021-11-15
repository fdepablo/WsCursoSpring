package es.curso.spring01;

/*
 * Para trabajar de una manera sencilla con un objeto en spring tenemos que tener su constructor
 * por defecto, el constructor sin parametros
 */
public class Mensaje {
	private String destinatario;
	private String cuerpo;
	
	public Mensaje() {
		super();
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	@Override
	public String toString() {
		return "Mensaje [destinatario=" + destinatario + ", cuerpo=" + cuerpo + "]";
	}	

}
