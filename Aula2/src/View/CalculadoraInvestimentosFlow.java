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
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import java.awt.Button;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class CalculadoraInvestimentosFlow extends JFrame {

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
					CalculadoraInvestimentosFlow frame = new CalculadoraInvestimentosFlow();
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
	public CalculadoraInvestimentosFlow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormSobre push = new FormSobre();
				
				FormSobre formSobre = new FormSobre();
				formSobre.setVisible(true);
			}
		});
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$ :");
		contentPane.add(lblDepositoMensal);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CampoDeposito = new JTextField();
		panel.add(CampoDeposito);
		CampoDeposito.setColumns(15);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		contentPane.add(lblNumMeses);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CampoMeses = new JTextField();
		panel_1.add(CampoMeses);
		CampoMeses.setColumns(15);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		contentPane.add(lblJurosMes);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CampoJuros = new JTextField();
		panel_2.add(CampoJuros);
		CampoJuros.setColumns(15);
		
		JLabel lblTotaInvestJuros = new JLabel("Total Investido + juros R$:");
		contentPane.add(lblTotaInvestJuros);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblResultado = new JLabel();
		panel_3.add(lblResultado);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JButton BotaoCalcular = new JButton("Calcular");
		panel_5.add(BotaoCalcular);
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
				
				
					lblResultado.setText("Resultado: " + DoubleCalculo);
					
								
				

				
			}
		});
	}

}
