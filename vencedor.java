package corrida_de_carros;

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

