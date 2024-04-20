public class Prenda {
	String tipo;
	Categoria categoria;
	Material material;
	Trama trama;
	Color colorPrincipal;
	Color colorSecundario;
	
	
	Prenda(String tipoNuevo,Material material,Color colorPrincipal,Trama tramaNueva, Color colorSecundario, Categoria categoria){
		this.tipo 	  = tipoNuevo;
		this.material = material;
		this.trama  = tramaNueva;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
	}
	
	String  tipo() {
		return tipo;
	}
	
	Material material() {
		return material;
	}
	
	Color colorPrincipal() {
		return colorPrincipal;
	}
	
	Color colorSecundario() {
		if(colorSecundario == null) throw new RuntimeException("No tiene color secundario");
		return colorSecundario;
	}
}
