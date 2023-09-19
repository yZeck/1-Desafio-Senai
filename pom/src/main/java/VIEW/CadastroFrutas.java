package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import DTO.FrutasDTO;
import DAO.FrutasDAO;
public class CadastroFrutas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfquantidade;
	private JTextField tfpreco;
	private JTextField tfNome;
	private JTextField tfDescricao;
	private JButton btDeletar;
	private JTextField tfId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFrutas frame = new CadastroFrutas();
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
	public CadastroFrutas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		contentPane.add(lblNewLabel_2);
		
		JLabel Nome = new JLabel("Descri\u00E7\u00E3o");
		contentPane.add(Nome);
		
		JLabel lblNewLabel_1 = new JLabel("Preco");
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("quantidade");
		contentPane.add(lblNewLabel);
		
		tfNome = new JTextField();
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfDescricao = new JTextField();
		contentPane.add(tfDescricao);
		tfDescricao.setColumns(10);
		
		tfpreco = new JTextField();
		contentPane.add(tfpreco);
		tfpreco.setColumns(10);
		
		tfquantidade = new JTextField();
		contentPane.add(tfquantidade);
		tfquantidade.setColumns(10);
		
		JButton btCadastrar = new JButton("Cadastrar Produto");
		btCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				 String nome, descricao, preco, quantidade;
			        
			        nome = tfNome.getText();
			        descricao = tfDescricao.getText();
			        preco = tfpreco.getText();
			        quantidade = tfquantidade.getText();
			        
			        FrutasDTO objfrutasdto = new FrutasDTO();
			        
			        objfrutasdto.setNome(nome);
			        objfrutasdto.setDescricao(descricao);
			        objfrutasdto.setPreco(preco);
			        objfrutasdto.setQuantidade(quantidade);
			        
			        FrutasDAO objfrutasDAO = new FrutasDAO();
			        objfrutasDAO.cadastrarFuncionario(objfrutasdto);
			}
		});
		contentPane.add(btCadastrar);
		
		btDeletar = new JButton("Deletar Produto");
		btDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = tfId.getText();
				FrutasDAO objfrutasDAO = new FrutasDAO();
		        objfrutasDAO.DeleteFrutas(id);
			}
			
		});
		contentPane.add(btDeletar);
		
		tfId = new JTextField();
		tfId.setText("Digite o id");
		contentPane.add(tfId);
		tfId.setColumns(10);
	}

}
