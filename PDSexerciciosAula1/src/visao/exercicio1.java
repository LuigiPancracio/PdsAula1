package visao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio1 frame = new exercicio1();
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
	public exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tempeartura (F)");
		lblNewLabel.setBounds(57, 98, 113, 14);
		contentPane.add(lblNewLabel);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setBounds(180, 95, 86, 20);
		contentPane.add(txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JButton BotaoCalcular = new JButton("Calcular");
		BotaoCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar a temperatura digitada no componente de texto
				String tempDigitada = txtTemperatura.getText();
				//Converter Temp String -> Float
				float tempConvertida = Float.valueOf(tempDigitada);
				//Criar objeto da classe ConversaoTemperatura
				ConversaoTemperatura conv = new ConversaoTemperatura();
				//chamar metodo conversao
				float tempC = conv.converterFtoC(tempConvertida);
				//mostrar temperatura convertida
				JOptionPane.showMessageDialog(null,  "Temperatura convertida: "+tempC);
			}
		});
		BotaoCalcular.setBounds(131, 162, 89, 23);
		contentPane.add(BotaoCalcular);
	}

}