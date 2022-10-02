/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_3;

/**
 *
 * @author 57321
 */
public class Cuadrado extends Figuras{
    private double lado;

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    
}
