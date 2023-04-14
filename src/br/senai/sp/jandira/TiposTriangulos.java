package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class TiposTriangulos {

	public static void main(String[] args) {

		double lado1, lado2, lado3;
		String strLado1, strLado2, strLado3;

		JOptionPane.showMessageDialog(null, "Descubra qual o tipo do seu triângulo!");
		strLado1 = JOptionPane.showInputDialog("Insira o valor do primeiro lado");
		strLado2 = JOptionPane.showInputDialog("Insira o valor do segundo lado");
		strLado3 = JOptionPane.showInputDialog("Insira o valor do terceiro lado");

		lado1 = Double.parseDouble(strLado1);
		lado2 = Double.parseDouble(strLado2);
		lado3 = Double.parseDouble(strLado3);

		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {

			if (lado1 == lado2 && lado1 == lado3) {

				JOptionPane.showMessageDialog(null, "Seu triângulo é EQUILÁTERO!");

			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				JOptionPane.showMessageDialog(null, "Seu triângulo é ESCALENO!");

			} else {
				JOptionPane.showMessageDialog(null, "Seu triângulo é ISÓCELES!");
			}

		} else {

			JOptionPane.showMessageDialog(null, "Isso não é um triângulo");

		}
	}

}
