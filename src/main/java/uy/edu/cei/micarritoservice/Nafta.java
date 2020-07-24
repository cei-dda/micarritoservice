package uy.edu.cei.micarritoservice;

import org.springframework.stereotype.Component;

@Component
public class Nafta implements Motor {
    private boolean estaPrendido = false;

    public void prender() {
        System.out.println("prender motor");
        this.estaPrendido = !this.estaPrendido;
    }

    public boolean estaPrendido() {
        return estaPrendido;
    }
}
