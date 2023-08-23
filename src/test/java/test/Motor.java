package test;
public class Motor{
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int a){
        this.registro = a;
    }
    
    void asignarTipo(String t){
        if(t.equals("gasolina") || t.equals("electrico")){
            this.tipo = t;
        }
    }
}