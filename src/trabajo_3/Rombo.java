/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_3;

/**
 *
 * @author 57321
 */
public class Rombo extends Figuras{
    private double lado;
    private double diagonald;
    private double diagonalD;
    
     
    public Rombo(double lado, double diagonald, double diagonalD) {
        super();
        this.lado = lado;
        this.diagonald= diagonald;
        this.diagonalD=diagonalD;
        
                
                
    }

    public double getlado() {
        return lado;
    }
     
    public double getdiagonald() {
        return diagonald;
    }
    
    public double getdiagonalD() {
        return diagonalD;
    }    

     
    @Override
    public double calcularArea() {
        return (diagonald * diagonalD)/2;
    }
   
    @Override
    public double calcularPerimetro() {
        return lado*4;
        
    }
    
}
