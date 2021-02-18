package entidades;

public class Acervos {

	public int ItemID;
	public int TipoAcervo;
	public Acervos(int itemID, int tipoAcervo) {
		
		ItemID = itemID;
		TipoAcervo = tipoAcervo;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public int getTipoAcervo() {
		return TipoAcervo;
	}
	public void setTipoAcervo(int tipoAcervo) {
		TipoAcervo = tipoAcervo;
	}
	
}
