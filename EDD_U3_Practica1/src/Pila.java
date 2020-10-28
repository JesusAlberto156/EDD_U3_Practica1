/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuy4
 */
public class Pila {
    //Atributos
    private int [] data = new int [5];
    private int tope;
    private int valorEliminado;
    //Metodos
    public boolean insertar (int valor){
        if(tope == data.length-1){
            return false;
        }
        tope++;
        data[tope] = valor;
        return true;
    }
    public boolean eliminar (){
        if(tope == -1){
            return false;
        }
        valorEliminado=data[tope];
        tope--;
        return true;
    }
    public int valorEliminado(){
        return valorEliminado;
    }
}
