package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		//analisarCandidato(1900.0);
		//analisarCandidato(2200.0);
		//analisarCandidato(2000.0);
		selecaoCandidatos();
	}
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"}; 
	
	    int candidatosSelecionados = 0;
	    int candidatosAtual = 0;
	    double salarioBase = 2000.0;
	    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
	    	String candidato = candidatos[candidatosAtual];
	    	double salarioPretendido = valorPretendido();
	    	
	    	System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
	        if(salarioBase > salarioPretendido) {
	        	System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
	        	candidatosSelecionados++;
	        }
	        candidatosAtual++;
	    }
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	//Se o número selecionado entre 1 e 3 for 1 retorna true.
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com proposta");
		}
		else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}

}
