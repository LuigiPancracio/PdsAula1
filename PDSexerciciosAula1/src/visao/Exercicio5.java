package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.PrecoMarmita;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField PesoField;
	private JTextField PrecoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PesoField = new JTextField();
		PesoField.setBounds(209, 27, 86, 20);
		contentPane.add(PesoField);
		PesoField.setColumns(10);
		
		PrecoField = new JTextField();
		PrecoField.setBounds(209, 65, 86, 20);
		contentPane.add(PrecoField);
		PrecoField.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar o preco e o kilo
				float peso = Float.valueOf(PesoField.getText());
				float preco = Float.valueOf(PrecoField.getText());
				//criar onjeto na classe PrecoMarmita
				PrecoMarmita conv = new PrecoMarmita();
				//chamar metodo do calculo
				float precoFinal= conv.Calculo(preco, peso);
				//mostrar preco final
				JOptionPane.showMessageDialog(null,"O preço final é: R$"+precoFinal);
				
			}
		});
		btnCalcular.setBounds(155, 108, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel PesoTxt = new JLabel("Informe o peso do prato montado:");
		PesoTxt.setBounds(10, 30, 215, 14);
		contentPane.add(PesoTxt);
		
		JLabel ValorTxt = new JLabel("Informe o valor do kilo:");
		ValorTxt.setBounds(44, 68, 139, 14);
		contentPane.add(ValorTxt);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrecoField.setText(null);
				PesoField.setText(null);
			}
		});
		btnLimpar.setBounds(56, 108, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(254, 108, 89, 23);
		contentPane.add(btnFechar);
		
		JLabel lblNewLabel = new JLabel("apresentado na balança.");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(20, 163, 238, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Em caso de peso menor que 1 KILO, informar \"0.\" e o numero de gramas");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(21, 145, 403, 14);
		contentPane.add(lblNewLabel_1);
	}
}