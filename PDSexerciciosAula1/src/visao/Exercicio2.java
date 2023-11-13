package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CampoNome;
	private JTextField CampoSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CampoNome = new JTextField();
		CampoNome.setBounds(87, 68, 96, 19);
		contentPane.add(CampoNome);
		CampoNome.setColumns(10);
		
		CampoSobrenome = new JTextField();
		CampoSobrenome.setBounds(277, 68, 96, 19);
		contentPane.add(CampoSobrenome);
		CampoSobrenome.setColumns(10);
		
		JLabel SobrenomeTxt = new JLabel("Sobrenome:");
		SobrenomeTxt.setBounds(193, 71, 74, 13);
		contentPane.add(SobrenomeTxt);
		
		JLabel NomeTxt = new JLabel("Nome:");
		NomeTxt.setBounds(32, 71, 45, 13);
		contentPane.add(NomeTxt);
		
		JButton BotaoConfirmar = new JButton("Confirmar");
		BotaoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String  Nome = (CampoNome.getText());
				String  Sobrenome = (CampoSobrenome.getText());
				
			JOptionPane.showMessageDialog(null, "Nome Completo: "+Nome+ " " +Sobrenome);
			}
		});
		BotaoConfirmar.setBounds(171, 148, 96, 21);
		contentPane.add(BotaoConfirmar);
		
		
	}
}