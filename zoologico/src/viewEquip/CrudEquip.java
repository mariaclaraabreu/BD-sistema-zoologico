package viewEquip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

import model.dao.EquipamentoDAO;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrudEquip {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudEquip window = new CrudEquip();
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
	public CrudEquip() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EquipamentoDAO eqd = new EquipamentoDAO();
				eqd.buscarTodos();//CHAMAR TELA DE EXIBIÇÃO DE LISTA AQUI
				
				
			}
		});
		btnListar.setBounds(10, 95, 89, 23);
		frame.getContentPane().add(btnListar);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewCadastroEquipamento eqd = new ViewCadastroEquipamento();
				///eqd.action(arg0, what);
				
				//CHAMAR VIEWCADASTROEQUIP
					
			}
		});
		btnInserir.setBounds(116, 95, 89, 23);
		frame.getContentPane().add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(225, 95, 89, 23);
		frame.getContentPane().add(btnAlterar);
		
		JButton btnExcuir = new JButton("Excuir");
		btnExcuir.setBounds(335, 95, 89, 23);
		frame.getContentPane().add(btnExcuir);
		
		JLabel lblSelecioneUmaOpo = new JLabel("SELECIONE UMA OP\u00C7\u00C3O");
		lblSelecioneUmaOpo.setBounds(154, 22, 160, 41);
		frame.getContentPane().add(lblSelecioneUmaOpo);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
