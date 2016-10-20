/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author alumne
 */
public class Sphere {
    //<editor-fold defaultstate="collapsed" desc="Estat: atribut">
    private double radi = 1;
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Comportament: metodes">
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Sphere(double radi){
        this.setRadi(radi);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getRadi(){
        return radi;
    }
    public void setRadi(double radi){
        if (radi<=0.0){
            throw new IllegalArgumentException(
                String.format("valor %f no valid",radi));
        }
        this.radi = radi;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public double AreaSphere(){
        double area = 4*Math.PI*Math.pow(radi, 2);
        return area;
    }
    public double PerimeterSphere(){
        double perimeter = (4/3)*Math.PI*Math.pow(radi, 3);
        return perimeter;
    }
    //</editor-fold>
    //</editor-fold>
}