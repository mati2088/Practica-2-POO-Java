package operacionesPoo;


import javax.swing.*;

public class operaciones {

    //atributos

    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    //metodo para pedir datos

    public  void input(){
        num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer Operando: "));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo Operando: "));
    }


    //metodo para sumar
    public void sumar() {
        suma = num1+num2;
        System.out.println("La suma entre los numeros ingresados es: "+suma);
    }

    public void restar(){
        resta= num1-num2;
        System.out.println("La resta entre los numeros es: "+resta);
    }
    public void  Multiplicar(){
        multiplicacion= num1*num2;
        System.out.println("La multiplicacion entre los numeros es: "+multiplicacion);
    }
    public void dividir(){
        division= num1/num2;
        System.out.println("La division entre los numeros es: "+division);
    }
}
