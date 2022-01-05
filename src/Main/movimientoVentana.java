package Main;

import java.awt.MouseInfo;
import java.awt.Point;

public class movimientoVentana {
    public int x, y;
    
    public movimientoVentana(java.awt.event.MouseEvent evt){
        x = evt.getX();
        y = evt.getY();
    }
}
