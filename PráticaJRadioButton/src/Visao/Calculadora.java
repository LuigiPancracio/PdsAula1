package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Calculos;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CampoPrimeiroNum;
	private JTextField CampoSegundoNum;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 212, 36);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel iblPrimeNum = new JLabel("Primeiro número inteiro:");
		panel.add(iblPrimeNum);
		
		CampoPrimeiroNum = new JTextField();
		CampoPrimeiroNum.setBounds(228, 11, 196, 36);
		contentPane.add(CampoPrimeiroNum);
		CampoPrimeiroNum.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 71, 212, 36);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSegNum = new JLabel("Segundo número inteiro:");
		panel_1.add(lblSegNum);
		
		CampoSegundoNum = new JTextField();
		CampoSegundoNum.setColumns(10);
		CampoSegundoNum.setBounds(228, 71, 196, 36);
		contentPane.add(CampoSegundoNum);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 118, 212, 98);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicao);
		panel_2.add(rdbtnAdicao);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("-Subtração");
		buttonGroup.add(rdbtnSubtracao);
		panel_2.add(rdbtnSubtracao);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		panel_2.add(rdbtnMultiplicacao);
		
		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisao);
		panel_2.add(rdbtnDivisao);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(91, 227, 106, 29);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(222, 227, 117, 23);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblResultado = new JLabel("");
		panel_4.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float Primeiro = Float.valueOf(CampoPrimeiroNum.getText());
				float Segundo = Float.valueOf(CampoSegundoNum.getText());
						
				Calculos Cal = new Calculos();
				if(rdbtnAdicao.isSelected())
				{
					float Resultado = Cal.CalcAdicao(Primeiro, Segundo);
					lblResultado.setText(String.valueOf(Resultado));
				}
				if(rdbtnSubtracao.isSelected())
				{
					float Resultado = Cal.CalcSubtracao(Primeiro, Segundo);
					lblResultado.setText(String.valueOf(Resultado));
				}
				if(rdbtnMultiplicacao.isSelected())
				{
					float Resultado = Cal.CalcMultiplicacao(Primeiro, Segundo);
					lblResultado.setText(String.valueOf(Resultado));
				}
				if(rdbtnDivisao.isSelected())
				{
					float Resultado = Cal.CalcDivisao(Primeiro, Segundo);
					lblResultado.setText(String.valueOf(Resultado));
				}
			}
		});
		panel_3.add(btnCalcular);
		
	}
}
