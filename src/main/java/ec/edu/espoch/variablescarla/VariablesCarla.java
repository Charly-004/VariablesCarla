/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.variablescarla;
import java.util.Scanner;
/**
 *
 * @author SO-LAB1-PC20
 */
public class VariablesCarla {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        System.out.println("Carla Mancero");
        var msm="Carla Mancero";       
        System.out.println("Mi nombre es "+msm); 
        
        var nombre="Carla";
        var apellido="Mancero";
        var edad="20";
        System.out.println(nombre+apellido);
        System.out.println("nombre:"+nombre+"Apellido"+apellido+"edad:"+edad);
        
        int num1=5;
        int num2=10;
        int result=num1+num2;
        
        System.out.println("resultado = "+result);
        System.out.println("numero de bits"+ Long.SIZE);
        System.out.println("numero de bytes"+ Long.BYTES);
        System.out.println("numero de bits"+ Long.MAX_VALUE);
        System.out.println("numero de bits"+ Long.MIN_VALUE);      
        
        var hex=0xa;
        var octal=012;
        var bin=0b1011;
        System.out.println("hexadecimal:"+hex);
        System.out.println("octal:"+octal);
        System.out.println("binario:"+bin);
        
        int num=5;
        String num2="5";
     
        
        int result=num+(Integer.parseInt(num2));
        System.out.println("resultado"+result);
        
        double num1=5.8;
        String num2="3.2";
        double result=num1+(Double.parseDouble(num2));
        System.out.println("resultado="+result);
        
        String nombre="Carla";
        String apellido="Mancero";
        String nombre_completo=nombre+apellido;
        System.out.println("nombre: "+nombre_completo);
        
        int edad=20;
        if (edad>=18){
            System.out.println("eres mayor de edad");
        }
     
        int lados=8;
        if(lados==8){
            System.out.println("es un optagono");
           
        }
        int edad=15;
        
        if(edad>0 && edad<120){
            if (edad>=18){
            System.out.println("eres mayor de edad");
            }else{
                System.out.println("no eres mayor de edad");
            }
        }else{
            System.out.println("edad incorrecta");
        }
        
        int lados=4;
        if(lados==0){
            System.out.println("es un circulo");
           
        }else if(lados==4){
            
            System.out.println("es un cuadrado");
            
        }else if(lados==3){
            
            System.out.println("es un triangulo");
        }else 
            
    
        char lado='b';
        switch (lado){
        
            case 'a':
                System.out.println("es un circulo");
                break;
                
            case 'b':
                System.out.println("es un triangulo");
                break;
            case 'c':
                System.out.println("es un cuadrado/rectangulo");
                break;
            default:
                System.out.println("no existe figura geometrica");
                
        }
        double num1=5;
        double num2=10;        
        
        int menu=4;
        switch(menu){
             case 1:
                System.out.println("Estas sumando los dos numero");
                System.out.println("resultado:"+(num1+num2));
                break;
                
            case 2:
                System.out.println("Estas restando los dos numeros");
                System.out.println("resultado:"+(num1-num2));
                break;
            case 3:
                System.out.println("Estas multiplicando los dos numeros");
                System.out.println("resultado:"+(num1*num2));
                break;
            case 4:
                if(num2!=0){
                    System.out.println("Estas dividiendo los dos numeros");
                    System.out.println("resultado:"+(num1/num2)); 
                }else{
                    System.out.println("No se puede dividir para 0");
                }
                break;         
                 
                        
            default:
                System.out.println("No existe figura geometrica");
           }
   
        System.out.println("Ejemplo de for");
        for (int i = 1; i <=8; i=i+2) {
            System.out.println("Numero: "+i);
            
        }
        
        int num=10;
        int tabla=7;
        
        for (int i = 1; i <=num; i=i+1) {
            System.out.println(tabla+" x "+i+" = "+(tabla*i));
            
        }
        
        System.out.println("ejemplo de while");
        int contador= 1;
        while(contador>=3){
            System.out.println("contador:"+contador);
            contador++;
        }
        
        System.out.println("ejemplo de do-while");
        int n= 0;
        do{
            System.out.println("valor de n:"+n);
            n++;
        
        }while(n<2);
        
        System.out.println("fin del programa");
    
       
     
        int [] enteros;
       enteros=new int [3];
       
       enteros[0]=5;
       enteros[1]=7;
       enteros[2]=9;
       
        for (int i = 0; i < 3; i++) {
            System.out.println("los valores del vector son "+enteros[i]);
            
        } 
        int j=enteros[2];
        
        System.out.println("El valor de la posicion 2 es:"+j);
        
        int[][] enteros;
        enteros= new int [3][3];
        
        enteros[0][0]=3;
        enteros[0][1]=6;
        enteros[0][2]=9;
        enteros[1][0]=12;
        enteros[1][1]
        enteros[1][0]=12;        
        enteros[1][0]=12;
        enteros[1][0]=12;
        enteros[1][0]=12;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("");
            }
        }
        
       Scanner entrada =new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre=entrada.nextLine();
        
        System.out.println("Hola"+nombre);*/
      
        Scanner entrada =new Scanner(System.in);
        System.out.println("¿Cual es tu edad?");
        int edad=entrada.nextInt();
        
        
        if(edad>=0 && edad<120){
            if (edad>=18 && edad<=12){
            System.out.println("eres un niño");
            }else if (edad>=13 && edad<=35)  {
                System.out.println("eres un joven");
            } else {
                System.out.println("Ya eres un adulto");
            }
        }else{
            System.out.println("edad incorrecta");
        }
    }
}
