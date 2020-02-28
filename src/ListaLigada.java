import javax.swing.JOptionPane;

public class ListaLigada {

	private Livro anterior;
	private Livro fim;

	public ListaLigada() {
		this(null, null);
	}
	
	public ListaLigada(Livro anterior, Livro fim) {
		this.anterior = anterior;
		this.fim = fim;
	}

	public Object getAnterior() {
		return this.anterior;
	}

	public Object getFim() {
		return this.fim;
	}

	public void setFim(Livro novo_livro) {
		this.fim = novo_livro;
	}
	
	public void adicionaLivro(Livro livro) {
		livro.setAnterior(anterior);
		livro.setAutor(JOptionPane.showInputDialog("Digite o autor"));
		livro.setNumreg(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de registro")));
		livro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
		livro.setTitulo(JOptionPane.showInputDialog("Digite o titulo"));
	}

	public void listarLivro() {
		Livro atual = this.fim;
		while(atual!=null) {
			System.out.println("Titulo : "+atual.getTitulo());
			System.out.println("Autor : "+atual.getAutor() );
			System.out.println("Preço : "+atual.getPreco());
			System.out.println("Numero de Registro : "+atual.getNumreg());
			atual.getAnterior();
		}
	}
}
