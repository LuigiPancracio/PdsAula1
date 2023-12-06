package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import model.Calculos;
import model.ComboBoxEnum;
import net.miginfocom.swing.MigLayout;

public class Posto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CampoDieselPreco;
	private JTextField CampoComumPreco;
	private JTextField CampoAditivadaPreco;
	private JTextField CampoEtanolPreco;
	private JTextField Campo500Preco;
	private JTextField Campo1LPreco;
	private JTextField CampoDias;
	private JTextField Campo1LQuanti;
	private JTextField Campo500mlquanti;
	private JTextField CampoQuantLitros;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Posto frame = new Posto();
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
	public Posto() {
		Calculos c=new Calculos();
		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[636px]", "[125px][130px][120px][25]"));
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7, "cell 0 0,grow");
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_7.add(panel_1);
		panel_1.setToolTipText("Tabela preço");
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco Do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblDiesel = new JLabel("Óleo díesel:");
		lblDiesel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblDiesel);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		CampoDieselPreco = new JTextField();
		CampoDieselPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorDiesel=Float.valueOf(CampoDieselPreco.getText());
			}
		});
		panel_3.add(CampoDieselPreco);
		CampoDieselPreco.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas. Comum:");
		lblGasComum.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblGasComum);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		CampoComumPreco = new JTextField();
		CampoComumPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorComum=Float.valueOf(CampoComumPreco.getText());
			}
		});
		panel_4.add(CampoComumPreco);
		CampoComumPreco.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas. Aditivada:");
		lblGasAditivada.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblGasAditivada);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		CampoAditivadaPreco = new JTextField();
		CampoAditivadaPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorAditiv=Float.valueOf(CampoAditivadaPreco.getText());
			}
		});
		panel_5.add(CampoAditivadaPreco);
		CampoAditivadaPreco.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol");
		lblEtanol.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblEtanol);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		CampoEtanolPreco = new JTextField();
		CampoEtanolPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorEtanool=Float.valueOf(CampoEtanolPreco.getText());
			}
		});
		panel_6.add(CampoEtanolPreco);
		CampoEtanolPreco.setColumns(10);
		
		JPanel panel = new JPanel();
		panel_7.add(panel);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblFras500Preco = new JLabel("Frasco 500ml");
		lblFras500Preco.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFras500Preco);
		
		Campo500Preco = new JTextField();
		Campo500Preco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valor500ml=Float.valueOf(Campo500Preco.getText());
				
			}
		});
		Campo500Preco.setText("");
		panel.add(Campo500Preco);
		Campo500Preco.setColumns(10);
		
		JLabel lblFras1LPreco = new JLabel("Frasco 1L");
		lblFras1LPreco.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFras1LPreco);
		
		Campo1LPreco = new JTextField();
		Campo1LPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valor1L=Float.valueOf(Campo1LPreco.getText());
			}
		});
		panel.add(Campo1LPreco);
		Campo1LPreco.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_8, "cell 0 1,grow");
		panel_8.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblQuantidade);
		
		JLabel lblValorPagar = new JLabel("Valor a Pagar");
		lblValorPagar.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblValorPagar);
		
		JLabel lblTotalOleo = new JLabel("Total Óleo");
		lblTotalOleo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblTotalOleo);
		
		JLabel lblFrasco500 = new JLabel("Frasco de 500ml");
		lblFrasco500.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblFrasco500);
		
		JLabel lblValorP500mlOleo = new JLabel("-");
		lblValorP500mlOleo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl500mlTotalOleo = new JLabel("-");
		lbl500mlTotalOleo.setHorizontalAlignment(SwingConstants.CENTER);
		
		Campo500mlquanti = new JTextField();
		Campo500mlquanti.addFocusListener(new FocusAdapter() {
			
			
			public void focusLost(FocusEvent e) {
				
				c.q500ml=Float.valueOf(Campo500mlquanti.getText());
				lblValorP500mlOleo.setText("R$ "+c.c500ml());		
				lbl500mlTotalOleo.setText("R$ "+c.totalOleo());
			}
		});
		panel_8.add(Campo500mlquanti);
		Campo500mlquanti.setColumns(10);
		
		panel_8.add(lblValorP500mlOleo);
		
		
		
		
		panel_8.add(lbl500mlTotalOleo);
		
		JLabel lblFrasco1L = new JLabel("Frasco de 1L");
		lblFrasco1L.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblFrasco1L);
		
		JLabel lblValor1L = new JLabel("-");
		lblValor1L.setHorizontalAlignment(SwingConstants.CENTER);
		Campo1LQuanti = new JTextField();
		Campo1LQuanti.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.q1L=Float.valueOf(Campo1LQuanti.getText());
				lblValor1L.setText("R$ "+c.c1L());
				lbl500mlTotalOleo.setText("R$ "+c.totalOleo());
			}
		});
		panel_8.add(Campo1LQuanti);
		Campo1LQuanti.setColumns(10);
		
		
		panel_8.add(lblValor1L);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10, "cell 0 2,grow");
		panel_10.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblCombustivel = new JLabel("Combustível:");
		lblCombustivel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblCombustivel);
		
		JComboBox comboBoxCombustivel = new JComboBox();
		comboBoxCombustivel.setModel(new DefaultComboBoxModel(ComboBoxEnum.values()));
		panel_11.add(comboBoxCombustivel);
		
		JLabel lblQuantLitros = new JLabel("Quantidade Litros");
		lblQuantLitros.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblQuantLitros);
		
		JLabel lblTotalComb = new JLabel("-");
		lblTotalComb.setHorizontalAlignment(SwingConstants.CENTER);
		
		CampoQuantLitros = new JTextField();
		CampoQuantLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int posicao=comboBoxCombustivel.getSelectedIndex();
				float qLitros=Float.valueOf(CampoQuantLitros.getText());
				if(posicao==0)
				{
					lblTotalComb.setText("R$ "+c.Diesel(qLitros));
				}
				else if(posicao==1)
				{
					lblTotalComb.setText("R$ "+c.Comum(qLitros));
				}
				else if(posicao==2)
				{
					lblTotalComb.setText("R$ "+c.Aditivada(qLitros));
				}
				else if(posicao==3)
				{
					lblTotalComb.setText("R$ "+c.Etanol(qLitros));
				}
			}
		});
		panel_11.add(CampoQuantLitros);
		CampoQuantLitros.setColumns(10);
		
		JLabel lblTotalCombustivel = new JLabel("Total Combustível:");
		lblTotalCombustivel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblTotalCombustivel);
		
		
		panel_11.add(lblTotalComb);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14);
		panel_14.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 1, 0, 0));
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		buttonGroup.add(rdbtnVista);
		panel_15.add(rdbtnVista);
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnPrazo);
		panel_15.add(rdbtnPrazo);
		
		JPanel panel_16 = new JPanel();
		panel_14.add(panel_16);
		panel_16.setLayout(new BoxLayout(panel_16, BoxLayout.X_AXIS));
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17);
		panel_17.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("129px"),},
			new RowSpec[] {
				RowSpec.decode("43px"),}));
		
		JLabel lblNewLabel_15 = new JLabel("Dias:");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_17.add(lblNewLabel_15, "2, 1");
		lblNewLabel_15.setVerticalAlignment(SwingConstants.BOTTOM);
		
		CampoDias = new JTextField();
		CampoDias.setHorizontalAlignment(SwingConstants.LEFT);
		panel_17.add(CampoDias, "3, 1, center, center");
		CampoDias.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13);
		
		JLabel lblNewLabel_16 = new JLabel("Total a pagar:");
		panel_13.add(lblNewLabel_16);
		
		JLabel lblTotal = new JLabel("-");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblTotal);
		
		JPanel panel_18 = new JPanel();
		contentPane.add(panel_18, "cell 0 3,grow");
		panel_18.setLayout(new MigLayout("", "[318px,grow][318px][318px]", "[45px,grow,top]"));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(rdbtnVista.isSelected())
				{
					String total=c.TotalpagarVista();
					lblTotal.setText("R$ "+total);
				}
				else if(rdbtnPrazo.isSelected())
				{
					Integer dias=Integer.valueOf(CampoDias.getText());
					if(dias<=30)
					{
					String total= c.totalPagarPrazo();
					lblTotal.setText("R$ "+total);
					}
					else if(dias>30)
					{
						String total= c.totalPagarPrazo30();
						lblTotal.setText("R$ "+  total);
					}
				}
				
			
			}
		});
		panel_18.add(btnCalcular, "cell 0 0,alignx center");
		
		JButton btnNovoCalculo = new JButton("Novo Cálculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CampoDieselPreco.setText(null);
				CampoComumPreco.setText(null);
				CampoAditivadaPreco.setText(null);
				CampoEtanolPreco.setText(null);
				Campo500Preco.setText(null);
				Campo1LPreco.setText(null);
				Campo500mlquanti.setText(null);
				Campo1LQuanti.setText(null);
				CampoQuantLitros.setText(null);
				CampoDias.setText(null);
				lblTotal.setText(null);
				lblTotalComb.setText("-");
				lblValor1L.setText("-");
				lblValorP500mlOleo.setText("-");
				lbl500mlTotalOleo.setText("-");
				
			}
		});
		panel_18.add(btnNovoCalculo, "cell 1 0,alignx center");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel_18.add(btnFechar, "cell 2 0,alignx center");
	}

}
