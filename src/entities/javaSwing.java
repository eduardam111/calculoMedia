package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class javaSwing implements ActionListener{
	JTextField np1, np2, np3;
	JButton calcularMedia;
	JTextArea mediaTela;
	
	public void menuCalculo() {	
		JFrame aritmetica = new JFrame("Cálculo Aritmético");
		
        aritmetica.setSize(600,600);
        aritmetica.setVisible(true);
        aritmetica.setResizable(false);
        aritmetica.setLayout(null);
        
        np1 = new JTextField();
        np1.setBounds(50,50,150,20);  
        np2 = new JTextField();
        np2.setBounds(50,100,150,20);  
        np3 = new JTextField();
        np3.setBounds(50,150,150,20);
        
        calcularMedia = new JButton("Calcular Média");
        calcularMedia.setBounds(50,200,150,20);
        
        mediaTela = new JTextArea();
        mediaTela.setBounds(50,300,150,20);
        
        aritmetica.add(np1);
        aritmetica.add(np2);
        aritmetica.add(np3);
        aritmetica.add(calcularMedia);
        calcularMedia.addActionListener(this);
        
        mediaTela.setEditable(false);
        aritmetica.add(mediaTela);
	}
	
	public void actionPerformed(ActionEvent e) {
		String prova1 = np1.getText();
		String prova2 = np2.getText();
		String prova3 = np3.getText();
		
		double p1 = Double.parseDouble(prova1);
		double p2 = Double.parseDouble(prova2);
		double p3 = Double.parseDouble(prova3);
		double media = 3;
		double resulta = 0;
		
		if (e.getSource() == calcularMedia) {
			resulta = (p1 + p2 + p3)/media;
		}
		String resultado = String.format("%.1f", resulta);
		mediaTela.setText(resultado);
	}
}