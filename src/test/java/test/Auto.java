package test;
public class Auto{

    String modelo;
    int precio;
    Asiento asientos[];
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public Auto(){

    }

    public int cantidadAsientos(){
        int c = 0;
        for(int i = 0; i<this.asientos.length;i++){
            if(asientos[i] != null)
                c++;

        }

        return c;
    }
    

    String verificarIntegridad(){
        if (this.registro != this.motor.registro)
            return "Las piezas no son originales";

        for(int j = 0; j<this.cantidadAsientos();j++)
        {
            if(this.registro != asientos[j].registro)
                return "Las piezas no son originales";
        }
    
        return "Auto original";

    }

}