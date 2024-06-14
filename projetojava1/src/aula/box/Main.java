package aula.box;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int carros = Integer.parseInt( JOptionPane.showInputDialog("Digite o total de caros:"));
		int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Total de pessoas"));
		int choice;
		
		
		System.out.printf("total de carros = %d \ntotal de pessoas = %d",carros,pessoas);
		
		choice = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado ?");
		if (choice == 0) {
			JOptionPane.showMessageDialog(null, "total de carros :"+carros+"\n"+"total de pessoas : "+pessoas);
		}
		
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null, "Voce nao quis ver a menssagem!!");
		}
	}

}
