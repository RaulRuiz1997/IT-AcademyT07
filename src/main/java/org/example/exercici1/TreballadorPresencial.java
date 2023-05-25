package org.example.exercici1;

public class TreballadorPresencial extends Treballador {

    private static double benzina = 100;

    public TreballadorPresencial(String nom, String cognom, double preu_hora) {
        super(nom, cognom, preu_hora);
    }

    @Override
    public double calcularSou(int horesTreballades) {
        return super.calcularSou(horesTreballades) + benzina;
    }

    @SuppressWarnings("unchecked")
    @Deprecated
    public String saludar() {
        return "el treballador presencial saluda";
    }

}
