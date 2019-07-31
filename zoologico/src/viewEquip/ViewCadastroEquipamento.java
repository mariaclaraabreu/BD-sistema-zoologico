package viewEquip;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.bean.Equipamento;
import model.dao.EquipamentoDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class ViewCadastroEquipamento extends JFrame {

	private JPanel contentPane;
	private JTextField txtFinalidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastroEquipamento frame = new ViewCadastroEquipamento();
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
	public ViewCadastroEquipamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtFinalidade = new JTextField();
		txtFinalidade.setBounds(32, 76, 257, 20);
		contentPane.add(txtFinalidade);
		txtFinalidade.setColumns(10);

		JLabel lblCadastroDeEquipamento = new JLabel("CADASTRO DE EQUIPAMENTO");
		lblCadastroDeEquipamento.setBounds(32, 25, 175, 14);
		contentPane.add(lblCadastroDeEquipamento);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVoltar.setBounds(237, 227, 89, 23);
		contentPane.add(btnVoltar);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//

				Equipamento eq = new Equipamento();
				EquipamentoDAO eqd = new EquipamentoDAO();
				if (txtFinalidade.getText() != "Pinção para manusear cobra") {
					JOptionPane.showMessageDialog(null, "Dados inválidos");
				} else {
					eq.setFinalidade(txtFinalidade.getText());
					eqd.inserir(eq);

					JOptionPane.showMessageDialog(null, "Equipamento inserido com sucesso!");
				}
				// TelaEquipamentoCRUD crud = new TelaEquipamentoCRUD();
				// crud.

				// txtFinalidade.getText();

			}
		});
		btnConfirmar.setBounds(335, 227, 89, 23);
		contentPane.add(btnConfirmar);

		JLabel lblFinalidade = new JLabel("Finalidade");
		lblFinalidade.setBounds(32, 50, 86, 14);
		contentPane.add(lblFinalidade);

		JLabel lblExPinoPara = new JLabel("Ex: Pin\u00E7\u00E3o para pegar cobra");
		lblExPinoPara.setBounds(32, 110, 149, 14);
		contentPane.add(lblExPinoPara);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(266, 227, 1, 1);
		contentPane.add(layeredPane);
	}
}
