/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 27/04/2023 
    Classe: Abstrata Votacao
*/
class Votacao {
    int Secao;
    int CodCandidato;
    int NumEleitor;
    String NomeEleitor;
    
    //construtor do cadastro de votação
    Votacao( int Secao, int CodCandidato, int NumEleitor, String NomeEleitor){
        this.Secao = Secao;
        this.CodCandidato = CodCandidato;
        this.NumEleitor = NumEleitor;
        this.NomeEleitor = NomeEleitor;
    }
    
}