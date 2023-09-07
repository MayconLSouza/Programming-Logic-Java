/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 07/05/2023 
    Classe: Abstrata Votacao
*/
public class Votacao {
    int Secao;
    int Candidato;
    
    
    Votacao(){
        this(0,0);
    }
    
    Votacao (int NumeroSecao, int NumeroCandidato){
        Secao = NumeroSecao;
        Candidato = NumeroCandidato;
    }
}
