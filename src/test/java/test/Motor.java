package test;
public class Motor{
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int a){
        this.registro = a;
    }
    
    public void asignarTipo(String t){
        this.tipo = t;
    }
}