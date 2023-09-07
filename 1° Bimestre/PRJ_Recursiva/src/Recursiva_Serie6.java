/*
    Nome do programa: Recursiva_Serie6
    Objetivo: Receba como argumento um número natural n e devolva a soma de todos os números naturais até n.
    Programador : Maycon Souza
    Data de desenvolvimento: 31/05/2023
*/
import javax.swing.*;
public class Recursiva_Serie6 {
public static void main (String args[])    {
int num = Integer.parseInt(JOptionPane.showInputDialog("Número"));
System.out.println("Soma = "+Soma_nat(num));}
static int Soma_nat(int n){
if(n!=1){
int soma = n + Soma_nat(n-1);
return soma;}
else{
return 1;}}}
