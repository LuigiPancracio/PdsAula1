package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.CalculoGas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField PrecoGasField;
	private JTextField SaldoDisField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PrecoGasolinaTxt = new JLabel("Preço da gasolina:");
		PrecoGasolinaTxt.setBounds(30, 42, 117, 14);
		contentPane.add(PrecoGasolinaTxt);
		
		PrecoGasField = new JTextField();
		PrecoGasField.setBounds(142, 39, 86, 20);
		contentPane.add(PrecoGasField);
		PrecoGasField.setColumns(10);
		
		JLabel SaldoTxt = new JLabel("Saldo disponivel:");
		SaldoTxt.setBounds(30, 67, 96, 14);
		contentPane.add(SaldoTxt);
		
		SaldoDisField = new JTextField();
		SaldoDisField.setBounds(142, 67, 86, 20);
		contentPane.add(SaldoDisField);
		SaldoDisField.setColumns(10);
		
		JButton CalcularBotao = new JButton("Calcular");
		CalcularBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pegar o preco da gasolina
				String gasolinaDigitada = PrecoGasField.getText();                
				String saldoDigitado = SaldoDisField.getText();                  
				//Converter String -> Float 
				float gasolinaConvertida = Float.valueOf(gasolinaDigitada);
				float saldoConvertido = Float.valueOf(saldoDigitado);
				//Criar objeto na classe CalculoGas
				CalculoGas conv = new CalculoGas();
				//chamar metodo do calculo
				float calculoG = conv.calcularG(gasolinaConvertida,saldoConvertido);
				//mostrar calculo final
				JOptionPane.showMessageDialog(null,  "Litros: "+calculoG);
				
			}
		});
		CalcularBotao.setBounds(139, 145, 89, 23);
		contentPane.add(CalcularBotao);
	}
}