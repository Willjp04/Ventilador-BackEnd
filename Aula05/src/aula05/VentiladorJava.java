/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author PORTOMASTER
 */
public class VentiladorJava {
    public String marca;
    public String Tamanho;
    public String cor;
    public int tamanho;
    public int velocidade;
    public boolean Ligado;
    
    void status(){
        System.out.println("Cor " + this.cor);
        System.out.println("Arno " + this.marca);
        System.out.println("Tamanho " + this.Tamanho);
        System.out.println("Velocidade " + this.velocidade );
    }
    void ligar(){
        if(this.Ligado == true)
        System.out.println("O ventilador está ligado");
        else{
            System.out.println("ERRO! O ventilador está desligado");
        }
    }
    void ligado(){
        this.Ligado = true;
    }
    void desligado(){
        this.Ligado = false;
    }
       

}
