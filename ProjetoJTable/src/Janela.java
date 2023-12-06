import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField CampoNome;
	private JLabel lblNewLabel;
	private JTextField CampoCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnAlterar;
	private JTextField CampoIdade;
	private JTextField CampoPeso;
	private JTextField CampoAltura;
	private JTextField CampoTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 174, 596, 189);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
			
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);

		labelNome = new JLabel("Nome");
		labelNome.setBounds(44, 11, 46, 14);
		contentPane.add(labelNome);

		CampoNome = new JTextField();
		CampoNome.setBounds(44, 36, 174, 20);
		contentPane.add(CampoNome);
		CampoNome.setColumns(10);

		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(254, 11, 46, 14);
		contentPane.add(lblNewLabel);

		CampoCPF = new JTextField();
		CampoCPF.setBounds(254, 36, 174, 20);
		contentPane.add(CampoCPF);
		CampoCPF.setColumns(10);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = CampoNome.getText();
				String cpf = CampoCPF.getText();
				Integer telefone = Integer.parseInt(CampoTelefone.getText());
				Integer idade = Integer.parseInt(CampoTelefone.getText());
				Float peso = Float.parseFloat(CampoPeso.getText());
				Float altura = Float.parseFloat(CampoAltura.getText());

				Pessoa p = new Pessoa();

				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setIdade(idade);
				p.setPeso(peso);
				p.setTelefone(telefone);
				p.setAltura(altura);

				listaPessoas.add(p);

				atualizarJTableModel();
				limparCampos();

			}
		});
		btnAdicionar.setBounds(139, 131, 112, 32);
		contentPane.add(btnAdicionar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnExcluir.setBounds(295, 131, 99, 33);
		contentPane.add(btnExcluir);

		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int linha = table.getSelectedRow();
				int cpf = (int) table.getValueAt(linha, 1);

				String nome = CampoNome.getText();
				String cpf1 = CampoCPF.getText();
				Integer telefone = Integer.parseInt(CampoTelefone.getText());
				Integer idade = Integer.parseInt(CampoTelefone.getText());
				Float peso = Float.parseFloat(CampoPeso.getText());
				Float altura = Float.parseFloat(CampoAltura.getText());

				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpf() == cpf) {

						pessoa.setNome(nome);
						pessoa.setCpf(Integer.parseInt(cpf1));
						pessoa.setIdade(idade);
						pessoa.setPeso(peso);
						pessoa.setTelefone(telefone);
						pessoa.setAltura(altura);

						atualizarJTableModel();
						limparCampos();

					}

				}
			}
		});
		btnAlterar.setBounds(435, 131, 114, 32);
		contentPane.add(btnAlterar);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(462, 11, 46, 14);
		contentPane.add(lblIdade);

		CampoIdade = new JTextField();
		CampoIdade.setBounds(462, 36, 178, 20);
		contentPane.add(CampoIdade);
		CampoIdade.setColumns(10);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(44, 67, 46, 14);
		contentPane.add(lblPeso);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(254, 67, 46, 14);
		contentPane.add(lblAltura);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(462, 67, 106, 14);
		contentPane.add(lblTelefone);

		CampoPeso = new JTextField();
		CampoPeso.setBounds(44, 92, 174, 20);
		contentPane.add(CampoPeso);
		CampoPeso.setColumns(10);

		CampoAltura = new JTextField();
		CampoAltura.setBounds(254, 92, 174, 20);
		contentPane.add(CampoAltura);
		CampoAltura.setColumns(10);

		CampoTelefone = new JTextField();
		CampoTelefone.setBounds(462, 92, 178, 20);
		contentPane.add(CampoTelefone);
		CampoTelefone.setColumns(10);
	}

	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}

	public void limparCampos() {
		CampoNome.setText("");
		CampoCPF.setText("");
		CampoIdade.setText("");
		CampoAltura.setText("");
		CampoPeso.setText("");
		CampoTelefone.setText("");

	}
}