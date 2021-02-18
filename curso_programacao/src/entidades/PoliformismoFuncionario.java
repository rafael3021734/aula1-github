package entidades;


	public class PoliformismoFuncionario {

		private String nome;
		private Integer horas;
		private double valorHora;
		
		public PoliformismoFuncionario(){
		}
		
		public PoliformismoFuncionario(String nome, Integer horas, Double valorHora) {
			this.nome = nome;
			this.horas = horas;
			this.valorHora = valorHora;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) { 
			this.nome = nome;
		}

		public Integer getHoras() {
			return horas;
		}

		public void setHoras(Integer horas) {
			this.horas = horas;
		}

		public double getValorHora() {
			return valorHora;
		}

		public void setValorHora(double valorHora) {
			this.valorHora = valorHora;
		}
		
		public double pagamento() {
			return horas * valorHora;
					
		}
		
}
