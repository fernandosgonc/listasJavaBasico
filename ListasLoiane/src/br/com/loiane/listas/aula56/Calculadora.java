package br.com.loiane.listas.aula56;

public enum Calculadora {

	SOMA("+") {
		@Override
		public double executaOperacao(double a, double b) {
			return a + b;
		}
	},
	SUBTRACAO("-") {
		@Override
		public double executaOperacao(double a, double b) {
			return a - b;
		}
	},
	MULTIPLICACAO("*") {
		@Override
		public double executaOperacao(double a, double b) {
			return a * b;
		}
	},
	DIVISAO("/") {
		@Override
		public double executaOperacao(double a, double b) {
			return a / b;
		}
	};

	private String operacao;

	private Calculadora(String operacao) {
		this.operacao = operacao;
	}

	@Override
	public String toString() {
		return this.operacao;
	}

	public abstract double executaOperacao(double a, double b);

}
