package uy.edu.cei.micarritoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MotorMonitor {

    @Autowired
    @Qualifier("diesel")
    private Motor motor;

    public boolean estaPrendido() {
        return this.motor.estaPrendido();
    }

}
