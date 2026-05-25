package main;

import controller.VendaController;

public class Main {

    public static void main(String[] args) {

        VendaController controller =
                new VendaController();

        controller.executar();
    }
}