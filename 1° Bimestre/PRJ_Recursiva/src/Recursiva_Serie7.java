/*
    Nome do programa: Recursiva_Serie7
    Objetivo: Contar os dígitos de um determinado número usando recursão.
    Programador : Maycon Souza
    Data de desenvolvimento: 31/05/2023
*/
import javax.swing.*;
public class Recursiva_Serie7{
public static void main (String args[]){
int num = Integer.parseInt(JOptionPane.showInputDialog("Número"));
System.out.println("Digitos = "+Cont_dig(num));}
static int Cont_dig(int n){
if(n<10){
return 1;}
else{
n = 1 + Cont_dig(n/10);
return n;}}}


