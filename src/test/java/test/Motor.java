package test;
public class Motor{
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int a){
        this.registro = a;
    }
    
    void asignarTipo(String t){
        if(t != "gasolina" && t != "electrico"){
            return 0;
        }else
            tipo = t;
    }
}