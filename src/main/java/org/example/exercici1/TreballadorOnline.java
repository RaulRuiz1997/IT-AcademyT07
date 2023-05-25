package org.example.exercici1;

public class TreballadorOnline extends Treballador {

    private final double PREU_TARIFA_PLANA = 30;

    public TreballadorOnline(String nom, String cognom, double preu_hora) {
        super(nom, cognom, preu_hora);
    }

    @Override
    public double calcularSou(int horesTreballades) {
        return super.calcularSou(horesTreballades) + PREU_TARIFA_PLANA;
    }
    @SuppressWarnings("unchecked")
    @Deprecated
    public String saludar() {
        return "el treballador online saluda";
    }

}
