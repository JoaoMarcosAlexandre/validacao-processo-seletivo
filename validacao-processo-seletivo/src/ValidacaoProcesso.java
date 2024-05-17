import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ValidacaoProcesso {
    public static void main(String[] args) {
        String [] candidatos = {"Gabriella", "Ferreira", "Rosa", "Alexandre", "Davi"};
        for(String candidato: candidatos){
            entrarContato(candidato);
        }
    }

    static void entrarContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
            if(atendeu)
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "tentativa");
            else
                System.out.println("Não conseguimos contato com " + candidato + ". Número máximo de tentativas realizadas.");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Gabriella", "Ferreira", "Rosa", "Alexandre", "Davi"};
       
        System.out.println("Imprimindo a lista de candidatos, informando o indice do elemento");
       
        for(int indice =0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + indice + " é " + candidatos[indice]);
        }
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"Gabriella", "Ferreira", "Rosa", "Alexandre", "Davi", "Manuela", "João", "Marcos", "Silva"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000.0;
        while(candidatosSelecionados<5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salaraioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salaraioPretendido);
            if(salarioBase >= salaraioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
            }
        }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCantidato(double salaraioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salaraioPretendido){
            System.out.println("Ligar para o canditado.");
        }else if (salarioBase == salaraioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos.");
        }

  }
}