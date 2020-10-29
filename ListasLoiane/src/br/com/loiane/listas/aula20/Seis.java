package br.com.loiane.listas.aula20;

import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		
		String[][] tabuleiro = new String[3][3];
		
		String jog1 = "X";
		String jog2 = "O";
		int jogadas = 9;
		
		String jog; //escolhe de quem é a vez de jogar

		Scanner scan = new Scanner(System.in);
		
		//boolean jogadaValida = false;
		boolean acabou = false;
		
		while(!acabou){
			System.out.println("Digite a linha e coluna onde vai jogar");
			int linha = scan.nextInt();
			int coluna = scan.nextInt();
			
			linha--;
			coluna--;
			
			if(jogadas%2!=0){
				jog = jog1;
			}else{
				jog = jog2;
			}
			
			
			if(tabuleiro[linha][coluna]==null){ //verifica se jogada é valida e insere
				tabuleiro[linha][coluna] = jog;
				jogadas--;
				//jogadaValida = true;
			}else{
				System.out.println("Jogada invalida. Tente novamente.");
			}
			
			imprime(tabuleiro);
			
			if(jogadas<=6){
				if(tabuleiro[0][0] == jog && tabuleiro[0][1] == jog && tabuleiro[0][2] == jog//linhas
					|| tabuleiro[1][0] == jog && tabuleiro[1][1] == jog && tabuleiro[1][2] == jog
					|| tabuleiro[2][0] == jog && tabuleiro[2][1] == jog && tabuleiro[2][2] == jog
					//diagonais
					|| tabuleiro[0][0] == jog && tabuleiro[1][1] == jog && tabuleiro[2][2] == jog
					|| tabuleiro[0][2] == jog && tabuleiro[1][1] == jog && tabuleiro[2][0] == jog
					//colunas
					|| tabuleiro[0][0] == jog && tabuleiro[1][0] == jog && tabuleiro[2][0] == jog
					|| tabuleiro[0][1] == jog && tabuleiro[1][1] == jog && tabuleiro[2][1] == jog
					|| tabuleiro[0][2] == jog && tabuleiro[1][2] == jog && tabuleiro[2][2] == jog){
					if(jog.equalsIgnoreCase("x")){
						System.out.println("PARABENS, JOG1 GANHOU");
						acabou = true;
						scan.close();
					}else{
						System.out.println("PARABENS, JOG2 GANHOU");
						acabou = true;
						scan.close();
					}
				}
			}
			
		}
		
	}
	
	private static void imprime(String[][] tabuleiro){
		for(int i = 0; i<tabuleiro.length; i++){
			for(int j = 0; j<tabuleiro[i].length; j++){
				if(tabuleiro[i][j]!=null){
				System.out.print(tabuleiro[i][j]+" ");
			}else{
				System.out.print("- ");
			}
				}
			System.out.println();
		}
	}
}
