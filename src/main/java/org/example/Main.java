package org.example;

import org.example.exercici1.Treballador;
import org.example.exercici1.TreballadorOnline;
import org.example.exercici1.TreballadorPresencial;

public class Main {

    public static void main(String[] args) {

        // Exercici 1 --------------------------------------------------------------------------------------------------

        Treballador treballador = new Treballador("Carlos", "García", 20);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Vicky", "Gomez", 20);
        TreballadorOnline treballadorOnline = new TreballadorOnline("Robin", "Lopez", 20);

        int horesTreballades = 160;

        // Pese a que todos los trabajadores usen el mismo método, al usar la anotación @Override sobreescribimos
        // el funcionamiento de este, por eso el presencial gana ese extra por la gasolina y el online ese extra por la tarifa plana

        System.out.println("Sou treballador: " + treballador + ": " + treballador.calcularSou(horesTreballades));
        System.out.println("Sou treballador presencial: " + treballadorPresencial + ": " + treballadorPresencial.calcularSou(horesTreballades));
        System.out.println("Sou treballador online: " + treballadorOnline + ": " + treballadorOnline.calcularSou(horesTreballades));

        // Exercici 2 --------------------------------------------------------------------------------------------------

        System.out.println(treballadorPresencial.saludar());
        System.out.println(treballadorOnline.saludar());

    }

}