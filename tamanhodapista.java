package corrida_de_carros;

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

