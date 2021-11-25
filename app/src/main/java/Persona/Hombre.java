package Persona;

public class Hombre extends Persona implements NivelActividad{
    private String NactividadF;
    public Hombre(int edad, int estatura, double peso,String NactividadF) {
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
                finalCal= 66+(13.7*getPeso())+(5*getEstatura())-(6.8*getEdad())*actividad;
                break;
            case "activo":
                finalCal=66+(13.7*getPeso())+(5*getEstatura())-(6.8*getEdad())*actividad1;

                break;
            case "poco activo":
                finalCal= 66+(13.7*getPeso())+(5*getEstatura())-(6.8*getEdad())*actividad2;

                break;
            case "muy activo"  :
                finalCal= 66+(13.7*getPeso())+(5*getEstatura())-(6.8*getEdad())*actividad3;

                break;
            default:
                finalCal=333;
                break;
        }
     return finalCal;
    }
}
