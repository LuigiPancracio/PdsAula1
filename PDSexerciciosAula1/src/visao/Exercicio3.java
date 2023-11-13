package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Retangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CampoBase;
	private JTextField CampoAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BaseTxt = new JLabel("Base:");
		BaseTxt.setBounds(40, 97, 45, 13);
		contentPane.add(BaseTxt);
		
		CampoBase = new JTextField();
		CampoBase.setBounds(86, 94, 96, 19);
		contentPane.add(CampoBase);
		CampoBase.setColumns(10);
		
		JLabel AlturaTxt = new JLabel("Altura:");
		AlturaTxt.setBounds(210, 97, 45, 13);
		contentPane.add(AlturaTxt);
		
		CampoAltura = new JTextField();
		CampoAltura.setBounds(265, 94, 96, 19);
		contentPane.add(CampoAltura);
		CampoAltura.setColumns(10);
		
		JButton BotaoCalcular = new JButton("Calcular");
		BotaoCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar a temperatura digitada no componente de texto
				Integer alturaDigitada = Integer.valueOf(CampoAltura.getText());
				Integer baseDigitada = Integer.valueOf(CampoBase.getText());
				//Criar objeto da classe Retangulo
				Retangulo conv = new Retangulo();
				//chamar metodo conversao
				float calculoA = conv.calcularA(alturaDigitada,baseDigitada);
				float calculoP = conv.calcularP(alturaDigitada,baseDigitada);
				//mostrar area e perimetro 
				JOptionPane.showMessageDialog(null,  "Area: "+calculoA +" Perimetro: " +calculoP);
			}
		});
		BotaoCalcular.setBounds(175, 153, 85, 21);
		contentPane.add(BotaoCalcular);
	}

}