package interfacagrafica;

import java.util.ArrayList;

import ClassesPrincipais.Vagao;

public class ListaVagoes {
		private ArrayList<Vagao> vagoes;

		public ListaVagoes(ArrayList<Vagao> vagoesdisponiveis) {
			super();
			this.vagoes = vagoesdisponiveis;
		}

		public ArrayList<Vagao> getVagoes() {
			return vagoes;
		}

		public void setVagoes(ArrayList<Vagao> vagoes) {
			this.vagoes = vagoes;
		}
		
		

		
	  
	}  


