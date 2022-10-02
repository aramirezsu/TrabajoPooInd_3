/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_3;

import java.util.Scanner;



public class Main {

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;

    }

    public static void createEmployee(Scanner sc) {
        String id, name;
        int hoursPerMonth;
        double hourValue, percentageRetention;

        System.out.print("Ingresa el id del empleado: ");
        id = sc.nextLine().toUpperCase();
        System.out.print("Ingresa el nombre del empleado: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Ingresa el numero de horas trabajadas por el empleado: ");
        hoursPerMonth = sc.nextInt();
        System.out.print("Ingresa el valor de hora trabajada: ");
        hourValue = sc.nextDouble();
        System.out.print("Ingresa porcentaje de retencion de fuente: ");
        percentageRetention = sc.nextDouble();
        System.out.println("");

        Employee newEmployee = new Employee(id, name, hoursPerMonth, hourValue, percentageRetention);
        newEmployee.infoEmployee();

    }

    public static void equilateralTriangle(Scanner sc) {
        System.out.print("Digite la medida del lado del triangulo: ");
        double side = sc.nextDouble();

        double perimeter = 3 * side;
        double height = side * (Math.sqrt(3) / 2);
        double area = (height * side) / 2;

        System.out.println(
                "Perimetro: " + perimeter
                + "\nAltura: " + height
                + "\nArea: " + area
        );
    }

    public static void matricula(Scanner sc) {
        System.out.print("Digite el numero de la inscripcion: ");
        double inscripcion = sc.nextDouble();
        System.out.print("Digite el nombre del estudiante ");
        String nombre = sc.next();
        System.out.print("Digite el valor del patrimonio ");
        double patrimonio = sc.nextDouble();
        System.out.print("Digite el estrato social ");
        double estrato = sc.nextDouble();

        if (patrimonio > 2000000 && estrato > 3) {
            double valor = 0.03 * patrimonio;
            double total = valor + 50000;
            System.out.println("el valor de la matricula es " + total);
        } else {
            System.out.println("el valor de la matricula es 50000");
        }

    }

    public static void mayor(Scanner sc) {
        System.out.print("Digite el numero A: ");
        double a = sc.nextDouble();
        System.out.print("Digite el numero B ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("El numero A = " + a + " Es mayor que el numero B = " + b);
        } else if (a < b) {
            System.out.println("El numero A = " + a + " Es menor que el numero B= " + b);
        } else if (a == b) {
            System.out.println("El numero A = " + a + " Es igual que el numero B= " + b);
        }

    }

    public static void empleado(Scanner sc) {
        System.out.println("ingrese nombre empleado ");
        String nombre = sc.nextLine();
        System.out.println("ingrese salario empleado por Hora ");
        double salario = sc.nextDouble();
        System.out.println("ingrese horas que trabaja el empleado al mes ");
        double horas = sc.nextDouble();
        double comprobacion = salario * horas;
        if (comprobacion < 450000) {
            System.out.println("nombre empleado " + nombre);
        } else {
            System.out.println("nombre empleado " + nombre);
            System.out.println("salario mensual " + comprobacion);
        }

    }

    public static void raices(Scanner sc) {
        double a, b, c, d;
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c = sc.nextDouble();
        d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Las soluciones son numeros imaginarios ");
        } else {
            double x1, x2;
            x1 = (-b / 2 * a) + (Math.sqrt(d) / 2 * a);
            x2 = (-b / 2 * a) - (Math.sqrt(d) / 2 * a);
            System.out.println("Las soluciones son: " + "\nx1: " + x1 + "\nx2: " + x2);

        }

    }

    public static void cuadrados(Scanner sc) {
           int n= 0;
           double numeros;
           System.out.print("Ingrese la cantidad de elementos del grupo: ");
           n= sc.nextInt();
           for (int i = 1; i <= n; i++) {
               System.out.println("Numero " + i + ": ");
               numeros= sc.nextDouble();
               System.out.println(Math.sqrt(numeros) + " " + Math.pow(numeros,2) + " " + Math.cbrt(numeros)); 
          }
        }

    public static void grupo(Scanner sc) {
           double mayorval= -999999999;
           int n =0;
           double newnum= 0;        
           System.out.print("Ingrese la cantidad de elementos del grupo: ");
           n=sc.nextInt();
           for (int i = 1; i <= n; i++) {
               System.out.println("Ingrese el numero: ");
               newnum=sc.nextDouble();
               if(newnum >= mayorval){
                   mayorval=newnum;
               }
          }
           System.out.println("El mayor numero del grupo es: " + mayorval);
        }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // EJERCICIO 18
        //createEmployee(sc);
        //InterfazcreateEmployee CCempleado = new InterfazcreateEmployee();
        //CCempleado.show(true);

        // EJERCICIO 19
        //equilateralTriangle(sc);
        //InterfazequilateralTriangle TTriangulo = new InterfazequilateralTriangle();
        //TTriangulo.show(true);
        
        // EJERCICIO 10
        //matricula(sc);
        //InterfazMatricula MMatricula = new InterfazMatricula();
        //MMatricula.show(true);
        
        // EJERCICIO 7
        //mayor(sc);
        //InterfazMayor MMayor = new InterfazMayor();
        //MMayor.show(true);
        
        
        //EJERCICIO 22
        //empleado(sc);
        //InterfazEmpleado EEmpleado = new InterfazEmpleado();
        //EEmpleado.show(true);
        
        //EJERCICIO 23
        //raices(sc);
        //Interfazraices RRaices = new Interfazraices();
        //RRaices.show(true);
        
        //EJERCICIO 40
        //cuadrados(sc);
        //InterfazGcuadrados GGCuadrados = new InterfazGcuadrados();
        //GGCuadrados.show(true);
        
        //EJERCICIO 41
        //grupo(sc);
        //EL GRUPO DE NUMEROS SE DEBE SEPARAR POR COMAS ","
        //InterfazGrupo NGgrupo = new InterfazGrupo();
        //NGgrupo.show(true);
        
        
    }

}
