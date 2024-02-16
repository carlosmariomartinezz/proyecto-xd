package org.ficha2902082.maven.parking.carlos.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public String apeliido;
    public String placa;
    public TipoDocumento TipoDocumento;
    public String Apellidos;
    public long NumeroCelular;
    
    public List<carro> misCarros =new ArrayList<carro>();

    //metodo 1: añadir carro al cliente
    //definir metodo
    //definir metodo:
    //modificar acceso
    //tipo de dato de retorno
    //nombre del metodo
    //parametros (entradas,inputs):
    // 1. tipo de dato parametro
    //2. nombre de parametro
   
    public void addCar (carro x){
    

     this.misCarros.add(x);
    }
    public void addCar (String placa,TipoVehiculo tVehiculo){
        carro x = new carro();
        x.placa = placa;
        x.tipoVehiculo = tVehiculo;
        this.misCarros.add(x);

    }
}
