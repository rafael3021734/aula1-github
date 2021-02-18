package entidades;

public class AcervoFisico extends Acervos {
	
	public int TipoAcervo;
	public String Titulo;
	public String Autor;
	public String Edicao;
	public String AnoEdicao;
	
	public AcervoFisico(int itemID, int tipoAcervo, int tipoAcervo2, String titulo, String autor, String edicao,
			String anoEdicao) {
		super(itemID, tipoAcervo);
		TipoAcervo = tipoAcervo2;
		Titulo = titulo;
		Autor = autor;
		Edicao = edicao;
		AnoEdicao = anoEdicao;
	}
}
