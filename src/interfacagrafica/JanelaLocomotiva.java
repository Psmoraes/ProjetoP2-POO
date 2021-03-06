package interfacagrafica;

import javax.swing.*;

import ClassesPrincipais.Locomotiva;

import java.awt.*;
import java.util.ArrayList;

public class JanelaLocomotiva extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel llocomotivaId,lvazia,lclasse,ldescricao,lbitola,lpesomax,lpesoadm,lcomprimento;
	private JTextField tlocomotivaId,tclasse,tdescricao,tbitola,tpesomax,tpesoadm,tcomprimento;
	private JButton btnCadastrar,btnLimpar;
	ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
	JPanel painel1= new JPanel();
	public JanelaLocomotiva(){
		super("CadastroLocomotiva");
		llocomotivaId = new JLabel("IDVagao");
		lvazia= new JLabel("");
		lclasse = new JLabel("Tipo:");
		ldescricao = new JLabel("Subtipo:");
		lbitola = new JLabel("Proprietário:");
		lpesomax = new JLabel("Pesoadm:");
		lcomprimento = new JLabel("Comprimento:");

		tlocomotivaId = new JTextField();
		tlocomotivaId.setEditable(false);
		tclasse = new JTextField();
		tdescricao = new JTextField();
		tbitola = new JTextField();
		tpesomax = new JTextField();
		tcomprimento = new JTextField();
		
		btnCadastrar = new JButton("Cadastrar");
		btnLimpar = new JButton("Limpar");
		
		painel1.setLayout(new GridLayout(7, 2, 5, 5));
		painel1.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
                painel1.setBackground(Color.WHITE);
		
		painel1.add(llocomotivaId);
		painel1.add(tlocomotivaId);
		painel1.add(lclasse);
		painel1.add(tclasse);
		painel1.add(ldescricao);
		painel1.add(tdescricao);
		painel1.add(lbitola);
		painel1.add(tbitola);
		painel1.add(lpesomax);
		painel1.add(tpesomax);
		painel1.add(lcomprimento);
		painel1.add(tcomprimento);
		painel1.add(btnCadastrar);
		painel1.add(btnLimpar);
		pack();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(painel1);
		
		btnLimpar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	tclasse.setText("");
            	tdescricao.setText("");
            	tbitola.setText("");
            	tpesomax.setText("");
            	tcomprimento.setText("");
            }                            
        });
		}	
	}

