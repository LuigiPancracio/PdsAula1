package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.CalRetangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Retangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retangulo frame = new Retangulo();
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
	public Retangulo() {
		setTitle("Retangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(23, 27, 60, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(200, 27, 69, 14);
		contentPane.add(lblAltura);
		
		txtBase = new JTextField();
		txtBase.setBounds(23, 52, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(199, 52, 86, 20);
		contentPane.add(txtAltura);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		rdbtnArea.setBounds(36, 116, 91, 23);
		contentPane.add(rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		rdbtnPerimetro.setBounds(160, 116, 109, 23);
		contentPane.add(rdbtnPerimetro);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(23, 157, 86, 14);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float Base = Float.valueOf(txtBase.getText());
				float Altura = Float.valueOf(txtAltura.getText());
				CalRetangulo Cal = new CalRetangulo();
				if(rdbtnArea.isSelected()) 
				{
					float Resultado = Cal.CalcularA(Altura, Base);
					lblResultado.setText("Área: " + String.valueOf(Resultado));
				}
				if(rdbtnPerimetro.isSelected()) 
				{
					float Resultado = Cal.CalcularP(Altura, Base);
					lblResultado.setText("Perímetro: " + String.valueOf(Resultado));
				}
			}
		});
		btnNewButton.setBounds(10, 177, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText(null);
				txtAltura.setText(null);
				lblResultado.setText(null);
				
			}
		});
		btnLimpar.setBounds(108, 177, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(207, 177, 89, 23);
		contentPane.add(btnFechar);
		
	}
}
