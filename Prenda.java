public class Prenda {
	String tipo;
	Categoria categoria;
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	
	
	Prenda(String tipoNuevo,Material material,Color colorPrincipal, Color colorSecundario, Categoria categoria){
		
		if(tipoNuevo == null || material == null || colorPrincipal == null || categoria == null) {
			throw new RuntimeException("Prenda invalida, porfavor seleccione tipo, color o material nuevo");
		}
		this.tipo 	  = tipoNuevo;
		this.material = material;
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
		if(colorSecundario == null) {
			throw new RuntimeException("No tiene color secundario");
		}else {
			return colorSecundario;
		}
	}
}
