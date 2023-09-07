/*
    Nome do programa: Recursiva_Serie8
    Objetivo: Escrever uma função recursiva que calcule o valor de a elevado a b.
    Programador : Maycon Souza
    Data de desenvolvimento: 31/05/2023
*/
import javax.swing.*;
public class Recursiva_Serie8 {
public static void main (String args[]){
int a = Integer.parseInt(JOptionPane.showInputDialog("Base"));
int b = Integer.parseInt(JOptionPane.showInputDialog("Expoente"));
System.out.println("Resultado = "+Potencia(a, b));} 
static int Potencia(int base, int exp){
if(exp!=1){
int pot = base * Potencia(base,exp-1);
return pot;}
else{
return base;}}}
