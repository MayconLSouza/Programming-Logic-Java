/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 27/04/2023 
    Classe: Abstrata Eleitor
*/

class Eleitor {
    int Secao;
    int NumEleitor;
    String NomeEleitor;
    
    // construtor do cadastro de eleitor
    Eleitor(int Secao, int NumEleitor, String NomeEleitor){
        this.Secao = Secao;
        this.NumEleitor = NumEleitor;
        this.NomeEleitor = NomeEleitor;
    }
}
