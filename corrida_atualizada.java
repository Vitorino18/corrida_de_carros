package corrida_de_carros;

import java.util.Random;
import java.util.Scanner;

public class corrida_atualizada {
    static Random R = new Random ();
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{
        Carro car1 = new Carro('#');
        Carro car2 = new Carro('&');
        Tamanhodapista T = new Tamanhodapista();
  
        T.perguntadotamanho();

        System.out.println("////Partida////");
        while(car1.getdistancia() < T.gettamanhodapista() && car2.getdistancia() < T.gettamanhodapista()) {
            car1.velocidade();
            car2.velocidade();

        System.out.println("Corrida em andamento");

        car1.mostrarcarros(T.gettamanhodapista());
        car2.mostrarcarros(T.gettamanhodapista());

        Thread.sleep(500);
}

Vencedor V = new Vencedor(car1, car2);
    V.vencedores();
}
    }
