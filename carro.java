package corrida_de_carros;

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