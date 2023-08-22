package test;
public class Auto{

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public Auto(){

    }

    public int cantidadAsientos(){
        return this.asientos.length;
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


    public static void main(String args[]){
        TestAtributos t = new TestAtributos();
        t.testAtributosAsiento();
        t.testAtributosAuto();
        t.testAtributosMotor();

        TestMetodos tm = new TestMetodos();
        tm.testMetodoAsignarTipo();
        tm.testMetodoCambiarColor();
        tm.testMetodoCambiarRegistro();
        tm.testMetodoCantidadAsientos();
        tm.testMetodoVerificarIntegridad();
    
    }
}
