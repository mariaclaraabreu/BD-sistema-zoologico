package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class ListaEntidades {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEntidades window = new ListaEntidades();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListaEntidades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEscolha = new JLabel("ESCOLHA");
		lblEscolha.setBounds(165, 23, 91, 30);
		frame.getContentPane().add(lblEscolha);
		
		JRadioButton rdbtnEquipamento = new JRadioButton("Equipamento");
		rdbtnEquipamento.setBounds(59, 82, 109, 23);
		frame.getContentPane().add(rdbtnEquipamento);
		
		JRadioButton rdbtnAnimal = new JRadioButton("Animal");
		rdbtnAnimal.setBounds(59, 112, 109, 23);
		frame.getContentPane().add(rdbtnAnimal);
		
		JRadioButton rdbtnEspecie = new JRadioButton("Especie");
		rdbtnEspecie.setBounds(59, 139, 109, 23);
		frame.getContentPane().add(rdbtnEspecie);
		
		JRadioButton rdbtnVeterinario = new JRadioButton("Veterinario");
		rdbtnVeterinario.setBounds(59, 165, 109, 23);
		frame.getContentPane().add(rdbtnVeterinario);
		
		JRadioButton rdbtnFuncionarioComum = new JRadioButton("Funcionario Comum");
		rdbtnFuncionarioComum.setBounds(59, 191, 144, 23);
		frame.getContentPane().add(rdbtnFuncionarioComum);
		
		JRadioButton rdbtnFornecedor = new JRadioButton("Fornecedor");
		rdbtnFornecedor.setBounds(59, 217, 109, 23);
		frame.getContentPane().add(rdbtnFornecedor);
		
		JRadioButton rdbtnAlimentao = new JRadioButton("Alimenta\u00E7\u00E3o");
		rdbtnAlimentao.setBounds(59, 244, 109, 23);
		frame.getContentPane().add(rdbtnAlimentao);
		
		JRadioButton rdbtnAreasDoZoologico = new JRadioButton("Areas do zoologico");
		rdbtnAreasDoZoologico.setBounds(59, 266, 144, 23);
		frame.getContentPane().add(rdbtnAreasDoZoologico);
		
		JRadioButton rdbtnSubareasDoZoologico = new JRadioButton("Subareas do zoologico");
		rdbtnSubareasDoZoologico.setBounds(59, 292, 166, 23);
		frame.getContentPane().add(rdbtnSubareasDoZoologico);
		
		JButton btnProsseguir = new JButton("Prosseguir");
		btnProsseguir.setBounds(403, 375, 89, 23);
		frame.getContentPane().add(btnProsseguir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(302, 375, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JRadioButton rdbtnConsultas = new JRadioButton("Consultas");
		rdbtnConsultas.setBounds(59, 317, 109, 23);
		frame.getContentPane().add(rdbtnConsultas);
	}
}
