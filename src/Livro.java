
public class Livro {
	int numreg;
	String titulo;
	String autor;
	double preco;
	Livro anterior = null;
	
	public Livro() {
		this(0,null,null,0.0);
	}
	
	public Livro(int n, String t, String a, double p) {
		this.numreg = n;
		this.titulo = t;
		this.autor = a;
		this.preco = p;
	}

	public int getNumreg() {
		return numreg;
	}

	public void setNumreg(int numreg) {
		this.numreg = numreg;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Livro getAnterior() {
		return anterior;
	}

	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}
	

}

