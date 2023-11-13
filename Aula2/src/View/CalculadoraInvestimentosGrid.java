package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentosGrid extends JFrame {

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
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$ :");
		contentPane.add(lblDepositoMensal);
		
		CampoDeposito = new JTextField();
		contentPane.add(CampoDeposito);
		CampoDeposito.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		contentPane.add(lblNumMeses);
		
		CampoMeses = new JTextField();
		contentPane.add(CampoMeses);
		CampoMeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		contentPane.add(lblJurosMes);
		
		CampoJuros = new JTextField();
		contentPane.add(CampoJuros);
		CampoJuros.setColumns(10);
		
		JLabel lblTotaInvestJuros = new JLabel("Total Investido + juros R$:");
		contentPane.add(lblTotaInvestJuros);
		
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
		contentPane.add(BotaoCalcular);
	}

}
