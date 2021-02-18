package entidades;


	public class PolimorfismoFuncionario {

		private String nome;
		private Integer horas;
		private double valorHora;
		
		public PolimorfismoFuncionario(){
		}
		
		public PolimorfismoFuncionario(String nome, Integer horas, Double valorHora) {
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
