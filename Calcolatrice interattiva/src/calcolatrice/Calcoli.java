package calcolatrice;

import java.util.Scanner;

import javax.swing.*;

public class Calcoli extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double valore1;
	private double valore2;
	private JLabel label1;
	private JLabel label2;
	Scanner insert = new Scanner(System.in);

	public Calcoli() {
		label1 = new JLabel("\nBenvenuto alla Calcolatrice interattiva Emerc!! ");
		label1.setBounds(50, 10, 300, 30);
		add(label1);
		JOptionPane.showMessageDialog(null, label1);
		int select = 0;
		do {
			try {
				select = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Seleziona un'opzione per l'operazione che vuoi realizzare:\n\n" 
								+ " 1.    per sommare\n"
								+ "	2.    per restare\n" 
								+ "	3.    per moltiplicare\n" 
								+ " 4.    per dividere\n"
								+ " 5.    per uscire\n\n"));
				
				switch (select) {
				case 1:
					somma();
					break;
				case 2:
					resta();
					break;
				case 3:
					moltiplica();
					break;
				case 4:
					dividi();
					break;
				case 5:
					setLayout(null);
					label2 = new JLabel("Arrivederci!!\n\nTornapresto!!");
					label2.setBounds(200, 300, 20, 30);
					add(label2);
					JOptionPane.showMessageDialog(null, label2);
					break;
				default:
					JOptionPane.showMessageDialog(null, "opzione non valida! riprova");
					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "hai inserito un formato non valido, riprova");
			}

		} while (select != 5);

	}

	public void somma() {
		valore1 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il primo valore"));
		valore2 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il secondo valore"));

		JOptionPane.showMessageDialog(null, "il risultato della somma è :\n" + (valore1 + valore2));
	}

	public void resta() {
		valore1 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il primo valore"));
		valore2 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il secondo valore"));

		JOptionPane.showMessageDialog(null, "il risultato della resta è :\n" + (valore1 - valore2));
	}

	public void moltiplica() {
		valore1 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il primo valore"));
		valore2 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il secondo valore"));
		JOptionPane.showMessageDialog(null, "il prodotto della moltiplicazione è :\n" + (valore1 * valore2));
	}

	public void dividi() {
		try {
			
			valore1 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il primo valore"));
			valore2 = Integer.parseInt(JOptionPane.showInputDialog(null, "dammi il secondo valore"));
			if (valore2 == 0.0) {
				throw new Exception();
			}
			else{
				JOptionPane.showMessageDialog(null, "il risultato della divisione è :\n" + (valore1 / valore2));
			}
			
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"ATTENZIONE!! non si può dividere un numero per zero, riprova a inserire i dati");
			dividi();
		}
	}

}
