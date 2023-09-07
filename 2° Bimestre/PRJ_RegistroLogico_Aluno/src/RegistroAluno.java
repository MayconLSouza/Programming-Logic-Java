/*
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 20/04/2023
    Class: Principal
*/

import javax.swing.*;

class RegistroAluno {

    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[3];
        int i, ptos;

        for (i = 0; i < 3; i++) {
            aluno[i] = new Aluno(); // sem chaves pois só tem um comando
        }
        for (i = 0; i < 3; i++) {
            aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");
            aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");
            aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos do aluno:"));
        }

        for (i = 0; i < 3; i++) {
            System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);
        }

    } // fim do método	
} // fim da classe	

