package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Investimento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CampoDeposito;
	private JTextField CampoMeses;
	private JTextField CampoJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepósitoMensal = new JLabel("Depósito Mensal R$:");
		lblDepósitoMensal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepósitoMensal.setBounds(54, 11, 132, 14);
		contentPane.add(lblDepósitoMensal);
		
		CampoDeposito = new JTextField();
		CampoDeposito.setBounds(44, 25, 142, 20);
		contentPane.add(CampoDeposito);
		CampoDeposito.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		lblNumMeses.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumMeses.setBounds(54, 56, 119, 14);
		contentPane.add(lblNumMeses);
		
		CampoMeses = new JTextField();
		CampoMeses.setBounds(44, 73, 142, 20);
		contentPane.add(CampoMeses);
		CampoMeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblJurosMes.setBounds(44, 97, 129, 14);
		contentPane.add(lblJurosMes);
		
		CampoJuros = new JTextField();
		CampoJuros.setBounds(44, 117, 142, 20);
		contentPane.add(CampoJuros);
		CampoJuros.setColumns(10);
		
		JLabel lblTotalInvest = new JLabel("Total Investido + juros R$:");
		lblTotalInvest.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalInvest.setBounds(28, 141, 181, 14);
		contentPane.add(lblTotalInvest);
		
		JButton BotaoCalcular = new JButton("Calcular");
		BotaoCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String DepositoInformado = CampoDeposito.getText();
				String NumMesesInformado = CampoMeses.getText();
				String JurosInformado = CampoJuros.getText();
				
				double DepositoDouble = Double.valueOf(DepositoInformado);
				int MesesInt = Integer.valueOf(NumMesesInformado);
				double JurosDouble = Double.valueOf(JurosInformado);
				
				Investimento push = new Investimento(MesesInt, JurosDouble, DepositoDouble);
				
				
				double DoubleCalculo = (double) push.calculaTotal();
				
				JOptionPane.showMessageDialog(null," O Resultado R$:  " + DoubleCalculo);
				
				
			}
		});
		BotaoCalcular.setBounds(70, 166, 89, 23);
		contentPane.add(BotaoCalcular);
	}
}
