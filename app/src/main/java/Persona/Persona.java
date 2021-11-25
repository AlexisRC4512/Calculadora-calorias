package Persona;

public abstract class Persona {
        private int edad;
        private int estatura;
        private double peso;
        static double finalCal;
        public Persona(){};
        public Persona(int edad,int estatura,double peso){
            this.edad=edad;
            this.estatura=estatura;
            this.peso=peso;
        }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEstatura() {
        return estatura;
    }


    public abstract double calculoCalorias();
}
