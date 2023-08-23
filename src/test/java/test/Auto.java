package test;
public class Auto{

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;


    int cantidadAsientos(){
        int c = 0;
        for(int i = 0; i<this.asientos.length;i++){
            if(asientos[i] != null)
                c++;

        }

        return c;
    }
    

    String verificarIntegridad(){
        String ret = "Auto original";

        if (this.registro != this.motor.registro)
            ret="Las piezas no son originales";

        for(int j = 0; j<this.asientos.length;j++)
        {
            if(this.asientos[j] != null)
                if(this.registro != asientos[j].registro)
                    ret= "Las piezas no son originales";
        }
    
        return ret;

    }

}