package Persona;

public class Mujer extends Persona implements NivelActividad{
    private String NactividadF;
    public Mujer(int edad, int estatura, double peso,String NactividadF) {
        super(edad, estatura, peso);
        this.NactividadF=NactividadF;
    }
    public void setNactividadF(String nactividadF) {
        NactividadF = nactividadF;
    }

    public String getNactividadF() {
        return NactividadF;
    }
    @Override
    public double calculoCalorias() {
        switch ( getNactividadF()){
            case "sedentario":
                finalCal=665+(9.6*getPeso())+(1.8*getEstatura())-(4.7*getEdad())*actividad;
                break;
            case "activo":
                finalCal= 665+(9.6*getPeso())+(1.8*getEstatura())-(4.7*getEdad())*actividad1;

                break;
            case "poco activo":
                finalCal= 665+(9.6*getPeso())+(1.8*getEstatura())-(4.7*getEdad())*actividad2;

                break;
            case "muy activo"  :
                finalCal= 665+(9.6*getPeso())+(1.8*getEstatura())-(4.7*getEdad())*actividad3;

                break;
            default:
                finalCal=333;
                break;
        }
        return finalCal;
    }

        
}
