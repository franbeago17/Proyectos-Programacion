package BloqueEjercicios1º;

import javax.swing.JOptionPane;

public class Ejercicio2DosVariablesCambiadas {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca la primera variable: ");
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca la segunda variable: ");
		int var2 = Integer.parseInt(str);
		
		if (var1 < var2) {
			System.out.println("El menor número es el primer número: "+var1);
		}
		else {
			System.out.println("El menor número es el segundo número: "+var2);
		}
		
	}

}