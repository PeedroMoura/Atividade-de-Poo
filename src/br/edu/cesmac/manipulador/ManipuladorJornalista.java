package br.edu.cesmac.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.model.Jornalista;

public class ManipuladorJornalista {
	ArrayList<Jornalista> jornalistas = new ArrayList<Jornalista>();

	public void cadastrar(Jornalista jornalista) {
		this.jornalistas.add(jornalista);
	}

	public void alterar(Jornalista jornalista) {
		for (Jornalista e : jornalistas) { 
			if (e.getIdJornalista() == jornalista.getIdJornalista()) {
				this.jornalistas.set(this.jornalistas.indexOf(e), jornalista);
			}
		}

	}

	public void excluir(Jornalista jornalista) {
		this.jornalistas.remove(jornalista);

	}

	public void listar() {
		System.out.println("=============== Jornalistas Cadatradas ===============");

		for(Jornalista jornalista : jornalistas) {
			System.out.println("Código " + jornalista.getIdJornalista() + " - " + jornalista.getNomeJornalista());
		}
		
		System.out.println("=================================================== \n\n");
	}
	
	public Jornalista getById(int idJornalista) {
		Jornalista jornalista = null;
	
		for (Jornalista e : jornalistas) {
			if (e.getIdJornalista() == idJornalista) {
				jornalista = e;
				break;
			}
		}
		
		return jornalista;
	}

	public List<Jornalista> getJornalista() {
		return this.getJornalista();
	}

}
