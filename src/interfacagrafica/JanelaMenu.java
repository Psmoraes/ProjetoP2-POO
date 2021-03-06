package interfacagrafica;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

	public class JanelaMenu extends JFrame{ 
	    
		/**
		 * 
		 */
		
		private static final long serialVersionUID = 1L;
		JPanel painel= new JPanel();
		private JButton btnCadastrarLocomotiva, btnCadastrarVagao, btnComposicao, btnListaLocomotiva, btnListaVagao;
		public JanelaMenu(){
			super("Composi��o Ferrovi�ria");
			btnCadastrarLocomotiva = new JButton("Cadastrar Locomotiva");
			btnCadastrarVagao = new JButton("Cadastrar Vag�o");
			btnComposicao = new JButton("Composi��o");
			btnListaLocomotiva = new JButton("Consultar/Remover Locomotiva");
			btnListaVagao = new JButton("Consultar/Remover Vag�o");
			
			painel.setLayout(new GridLayout(7, 2, 5, 5));
	                painel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
	                painel.setBackground(Color.WHITE);
			
			painel.add(btnCadastrarLocomotiva);
			painel.add(btnListaLocomotiva);
			painel.add(btnCadastrarVagao);
			painel.add(btnListaVagao);
			painel.add(btnComposicao);
			pack();
			
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setContentPane(painel);
			
			btnCadastrarLocomotiva.addActionListener(new java.awt.event.ActionListener(){
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	JanelaLocomotiva l = new JanelaLocomotiva();
	        		l.setVisible(true);
	        		l.setSize(680,480);
	                        l.setLocation(300,300);
	            }                            
	        });
			btnListaLocomotiva.addActionListener(new java.awt.event.ActionListener(){
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	
	            }                            
	        });
			btnCadastrarVagao.addActionListener(new java.awt.event.ActionListener(){
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                JanelaVagao v = new JanelaVagao();
	                        v.setVisible(true);
	                        v.setSize(680,480);
	                        v.setLocation(300,300);
	            	
	            }                            
	        });
			btnListaVagao.addActionListener(new java.awt.event.ActionListener(){
	            @Override
	            	public void actionPerformed(java.awt.event.ActionEvent evt) {
                       
                    }  
	            	                           
	        });
			btnComposicao.addActionListener(new java.awt.event.ActionListener(){
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	
	            }                            
	        });
		}
	}



