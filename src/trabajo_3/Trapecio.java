/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_3;

/**
 *
 * @author 57321
 */
public class Trapecio extends Figuras{
    private double altura;
    private double baseH;
    private double baseM;
    private double diagonalp;
    private double diagonals;

    public Trapecio(double altura, double baseM, double baseH, double diagonalp, double diagonals) {
        super();
        this.altura = altura;
        this.baseM= baseM;
        this.baseH=baseH;
        this.diagonalp= diagonalp;
        this.diagonals=diagonals;
                
                
    }

    public double getaltura() {
        return altura;
    }
     
    public double getbaseM() {
        return baseM;
    }
    
    public double getbaseH() {
        return baseH;
    }
    
    public double getdiagonalp() {
        return diagonalp;
    }
    
    public double getdiagonals() {
        return diagonals;
    }

     
    @Override
    public double calcularArea() {
        return ((baseM + baseH)/2)*altura;
    }
   
    @Override
    public double calcularPerimetro() {
        return baseH + baseM + diagonalp + altura + diagonals;
        
    }
}
