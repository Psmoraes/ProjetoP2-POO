package ClassesPrincipais;

  public class Locomotiva {
 	
	//Componentes da classe locomotiva
	private String id;
  	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private int classe;
  	private String descricao;
 	private double pesoMaxRebocavel;
 	private double bitola;
 	private double comprimentoLocomotiva;
 	private double pesoMaxLoc, bitolaLoc, comprimentoLoc;
  	
 	//M�todos getters e setters da classe locomotiva
 	public int getClasse() {
		return classe;
	}
	public void setClasse(int classe) {
		this.classe = classe;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPesoMaxRebocavel() {
		return pesoMaxRebocavel;
	}
	public void setPesoMaxRebocavel(double pesoMaxRebocavel) {
		this.pesoMaxRebocavel = pesoMaxRebocavel;
	}
	public double getBitola() {
		return bitola;
	}
	public void setBitola(double bitola) {
		this.bitola = bitola;
	}
	public double getComprimentoLocomotiva() {
		return comprimentoLocomotiva;
	}
	public void setComprimentoLocomotiva(double comprimentoLocomotiva) {
		this.comprimentoLocomotiva = comprimentoLocomotiva;
	}
	public double getPesoMaxLoc() {
		return pesoMaxLoc;
	}
	public void setPesoMaxLoc(double pesoMaxLoc) {
		this.pesoMaxLoc = pesoMaxLoc;
	}
	public double getBitolaLoc() {
		return bitolaLoc;
	}
	public void setBitolaLoc(double bitolaLoc) {
		this.bitolaLoc = bitolaLoc;
	}
	public double getComprimentoLoc() {
		return comprimentoLoc;
	}
	public void setComprimentoLoc(double comprimentoLoc) {
		this.comprimentoLoc = comprimentoLoc;
	}
  	
 	public Locomotiva(int classe, String descricao, double pesoMaxLoc, double bitolaLoc, double comprimentoLoc) {
 		this.classe = classe;
 		this.descricao = descricao;
 		this.pesoMaxLoc = pesoMaxLoc;
 		this.bitolaLoc = bitolaLoc;
 		this.comprimentoLoc = comprimentoLoc;
 	}
 	@Override
 	public String toString() {
 		return "Locomotiva [classe=" + classe + ", descricao=" + descricao + ", pesoMaxLoc=" + pesoMaxLoc
 				+ ", bitolaLoc=" + bitolaLoc + ", comprimentoLoc=" + comprimentoLoc + "]";
 	}
	
 
  	
  
  }