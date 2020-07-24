package uy.edu.cei.micarritoservice;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Motor {
    private boolean estaPrendido = false;

    @Override
    public void prender() {
        System.out.println("prendiendo motor diesel");
        this.estaPrendido = !this.estaPrendido;
    }

    public boolean estaPrendido() {
        return estaPrendido;
    }
}
