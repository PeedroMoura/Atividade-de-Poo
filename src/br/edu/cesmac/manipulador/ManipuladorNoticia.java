package br.edu.cesmac.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.model.Noticia;

public class ManipuladorNoticia {
	ArrayList<Noticia> noticias = new ArrayList<Noticia>();

	public void cadastrar(Noticia editoria) {
		this.noticias.add(editoria);
	}

	public void alterar(Noticia noticia) {
		for (Noticia e : noticias) {
			if (e.getIdNoticia() == noticia.getIdNoticia()) {
				this.noticias.set(this.noticias.indexOf(e), noticia);
			}
		}

	}

	public void excluir(Noticia noticia) {
		this.noticias.remove(noticia);

	}

	public void listar() {
		System.out.println("=============== Noticias Cadatradas ===============");

		for(Noticia noticia : noticias) {
			System.out.println("Código: " + noticia.getIdNoticia() + "Data: " + noticia.getDataNoticia() +  " Titulo: " + noticia.getTituloNoticia());
			System.out.println("Editoria: " + ???? + " Jornalista: " + ????);
			System.out.println("Resumo: " + noticia.getResumoNoticia());
			System.out.println("Texto: " + noticia.getTextoNoticia());
			
		}
		
		System.out.println("=================================================== \n\n");
	}
	
	public Noticia getById(int idNoticia) {
		Noticia noticia = null;
	
		for (Noticia e : noticias) {
			if (e.getIdNoticia() == idNoticia) {
				noticia = e;
				break;
			}
		}
		
		return noticia;
	}

	public List<Noticia> getNoticias() {
		return this.getNoticias();
	}

}
