package org.ficha2902082.maven.parking.carlos;
//importar dependecias
import org.ficha2902082.maven.parking.carlos.entities.carro;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.ficha2902082.maven.parking.carlos.entities.Cliente;
import org.ficha2902082.maven.parking.carlos.entities.TipoDocumento;
import org.ficha2902082.maven.parking.carlos.entities.TipoVehiculo;
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        //crear dos instancias
        //de la clase carro 
        carro carrito1 = new carro();
        carrito1.placa ="ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.camioneta;

        carro carrito2 = new carro();
        carrito2.placa="nms 123";
        carrito2.tipoVehiculo = TipoVehiculo.taxi;

        Cliente Cliente1 = new Cliente();
        Cliente1.nombre = "carlos";
        Cliente1.Apellidos = " martinez";
        Cliente1.NumeroCelular = 3103576437L;
        Cliente1.placa = "abc 346";
        Cliente1.TipoDocumento =TipoDocumento.Ti;

        //añadir carro cliente
        //invocar,llamar,ejecutar
        //el metodo
        Cliente1.addCar(carrito1);
        Cliente1.addCar("321 321", TipoVehiculo.camion);
        for (carro x: Cliente1.misCarros){
            System.out.println("placa:"+ x.placa);

        }

        System.out.println("carro del cliente:  EL "+carrito1.placa +" de "+ Cliente1.nombre);

    }
}