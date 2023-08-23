package test;
public class Motor{
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int a){
        this.registro = a;
    }
    
    void asignarTipo(String t){
        int a;
        if(t != "gasolina" && t != "electrico"){
            a++;
        }else
            this.tipo = t;
    }
}