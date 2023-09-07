/*
    Programadores: Maycon L.M. De Souza e Peterson H.C. Dos Santos
    Data: 20/04/2023 
    Classe: Abstrata
*/
class Estatistica {

    int CodigoCidade;
    String NomeCidade;
    int QuantidadeAcidentes;

    // construtor
    Estatistica() {
        this(0, " ", 0);
    }

    Estatistica(int CodCidade, String NomCidade, int QtdAcidentes) {
        CodigoCidade = CodCidade;
        NomeCidade = NomCidade;
        QuantidadeAcidentes = QtdAcidentes;
    }
}

