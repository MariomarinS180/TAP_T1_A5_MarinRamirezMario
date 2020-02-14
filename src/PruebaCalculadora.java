import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
class GUICalculadora extends JFrame{
	JButton btn1, btn2, btn3, btn4, btn5, btn6 ,btn7 ,btn8, btn9, btn0,
	btnMasMenos, btnPunto, btnIgual, btnMas, btnMenos, btnMult, btnDivision,
	btnPorcentual, btnX2, btnRaiz, btn1_x, btnCE, btnC, btnBorrar,
	m1, m2, m3, m4, m5, m6; 
	JComboBox<String> comboBoxBarras; 
	JTextField opc; 
	public GUICalculadora() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora"); 
		   //anchura altura
		setSize(336,518);
		setLocationRelativeTo(null);
		setVisible(true);
		//Aquí se construye el tamaño de la venta principal donde van a ir los botones
		btnMasMenos = new JButton("+_"); 
		btnMasMenos.setBackground(Color.LIGHT_GRAY);
		//                    x   y  anch  altura
		btnMasMenos.setBounds(0, 409, 80, 70);
		add(btnMasMenos);
		btn0 = new JButton("0"); 
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(80, 409, 80, 70);
		add(btn0); 
		btnPunto = new JButton("."); 
		btnPunto.setBackground(Color.LIGHT_GRAY);
		btnPunto.setBounds(160, 409, 80, 70);
		add(btnPunto); 
		btnIgual = new JButton("="); 
		btnIgual.setBackground(Color.LIGHT_GRAY);
		btnIgual.setBounds(240, 409, 80, 70);
		add(btnIgual); 
		//Última Línea ------------------------------------------- <<
		btn1 = new JButton("1"); 
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(0, 339, 80, 70);
		add(btn1); 
		btn2= new JButton("2"); 
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(80, 339, 80, 70);
		add(btn2); 
		btn3 = new JButton("3"); 
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(160, 339, 80, 70);
		add(btn3); 
		btnMas = new JButton("+"); 
		btnMas.setBackground(Color.LIGHT_GRAY);
		btnMas.setBounds(240, 339, 80, 70);
		add(btnMas); 
		// -----------------------------------
		btn4 = new JButton("4"); 
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(0, 269, 80, 70);
		add(btn4); 
		btn5 = new JButton("5"); 
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(80, 269, 80, 70);
		add(btn5); 
		btn6 = new JButton("6"); 
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(160, 269, 80, 70);
		add(btn6); 
		btnMenos = new JButton("-"); 
		btnMenos.setBackground(Color.LIGHT_GRAY);
		btnMenos.setBounds(240, 269, 80, 70);
		add(btnMenos); 
		//---------------------------------------
		btn7 = new JButton("7"); 
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(0, 199, 80, 70);
		add(btn7); 
		btn8 = new JButton("8"); 
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(80, 199, 80, 70);
		add(btn8); 
		btn9 = new JButton("9"); 
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(160, 199, 80, 70);
		add(btn9); 
		btnMult = new JButton("X"); 
		btnMult.setBackground(Color.LIGHT_GRAY);
		btnMult.setBounds(240, 199, 80, 70);
		add(btnMult); 
		//---------------------------------------------
		btnCE = new JButton("CE"); 
		btnCE.setBackground(Color.LIGHT_GRAY);
		btnCE.setBounds(0, 164, 80, 35);
		add(btnCE); 
		btnC = new JButton("C"); 
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setBounds(80, 164, 80, 35);
		add(btnC); 
		btnBorrar = new JButton("<-"); 
		btnBorrar.setBackground(Color.LIGHT_GRAY);
		btnBorrar.setBounds(160, 164, 80, 35);
		add(btnBorrar); 
		btnDivision = new JButton("/"); 
		btnDivision.setBackground(Color.LIGHT_GRAY);
		btnDivision.setBounds(240, 164, 80, 35);
		add(btnDivision); 
		//----------------------------------------------
		btnDivision = new JButton("%"); 
		btnDivision.setBackground(Color.LIGHT_GRAY);
		btnDivision.setBounds(0, 145, 80, 19);
		add(btnDivision); 
		btnRaiz = new JButton("√"); 
		btnRaiz.setBackground(Color.LIGHT_GRAY);
		btnRaiz.setBounds(80, 145, 80, 19);
		add(btnRaiz); 
		btnX2 = new JButton("x²"); 
		btnX2.setBackground(Color.LIGHT_GRAY);
		btnX2.setBounds(160, 145, 80, 19);
		add(btnX2); 
		btn1_x = new JButton("¹/x"); 
		btn1_x.setBackground(Color.LIGHT_GRAY);
		btn1_x.setBounds(240, 145, 80, 19);
		add(btn1_x); 
		m1 = new JButton("MC"); 
		m1.setBackground(Color.WHITE);
		m1.setBounds(0, 130, 52, 15);
		add(m1); 
		m2 = new JButton("MR"); 
		m2.setBackground(Color.WHITE);
		m2.setBounds(51, 130, 52, 15);
		add(m2); 
		m3 = new JButton("M+"); 
		m3.setBackground(Color.WHITE);
		m3.setBounds(102, 130, 52, 15);
		add(m3); 
		m4 = new JButton("M-"); 
		m4.setBackground(Color.WHITE);
		m4.setBounds(153, 130, 52, 15);
		add(m4); 
		m5 = new JButton("MS"); 
		m5.setBackground(Color.WHITE);
		m5.setBounds(204, 130, 52, 15);
		add(m5); 
		//------------------------------------------
		String items[] = {"─_─","Estándar", "Científica", "Programador"};
		comboBoxBarras = new JComboBox<>(items);
		comboBoxBarras.setBounds(3, 8, 110, 35);
		add(comboBoxBarras);
		//-----------------------------------------
		opc = new JTextField("0",10);
		opc.setBounds(200, 73, 110, 35);
		add(opc); 
	}//constructor
}//class
public class PruebaCalculadora {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GUICalculadora(); 
			}
		});
	}
}