/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_3;

/**
 *
 * @author 57321
 */
public class Triangulo extends Figuras {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        super();
        this.altura = altura;
        this.base = base;
    }

    public double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    public String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa())) {
            return "Es un triángulo equilátero";
        } else if ((base != altura) && (base != calcularHipotenusa())
                && (altura != calcularHipotenusa())) {
            return "Es un triángulo escaleno";
        } else {
            return "Es un triángulo isósceles";
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea() {
        return (base * altura / 2);
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }
    
}
