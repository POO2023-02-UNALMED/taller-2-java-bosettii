package test;
public class Motor{
    int numeroCilindros;
    public String tipo;
    int registro;

    void cambiarRegistro(int a){
        this.registro = a;
    }
    
    public void asignarTipo(String t){
        if(t == "gasolina"){
            this.tipo = t;
        }

        if(t == "electrico"){
            this.tipo = t;
        }

    }
}