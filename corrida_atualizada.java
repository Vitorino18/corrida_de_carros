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

class Tamanhodapista {
private int Chegada;

    public Tamanhodapista(){
        this.Chegada = 0;
    }

    public void perguntadotamanho(){
        System.out.print("digite o tamanho da pista: ");
        Chegada = corrida_atualizada.S.nextInt();
    }

    public int gettamanhodapista(){
        return Chegada;
    }
}

class Carro{
    private char nome;
    private int distancia; 

public Carro(char nome) {
    this.nome = nome;
    this.distancia = 0;
}

public void velocidade() {
    this.distancia += corrida_atualizada.R.nextInt(3)+1;
}

public void mostrarcarros(int chegada) {
    for(int i = 0; i <= chegada; i++){
        if(i == chegada) {
            System.out.println("|");
        }else if(i == this.distancia && i < chegada) {
            System.out.print(this.nome);
        }else{
            System.out.print("-");
        }
    }
}

public char getnome() {
    return nome;
}

public int getdistancia() {
    return distancia;
}
}

class Vencedor{
private Carro caro;
private Carro caro2;

public  Vencedor(Carro car1, Carro car2){
    this.caro = car1;
    this.caro2 = car2;
}
    
public void vencedores(){
        if( caro.getdistancia() < caro2.getdistancia()) {
            System.out.print("O carro " + caro2.getnome()+ " venceu!!!" );
    
        } else if(caro.getdistancia() > caro2.getdistancia()) {
            System.out.print("O carro " + caro.getnome() + " venceu!!!" );
        }else {
            System.out.print("Empate" );
    }
    }
    
}