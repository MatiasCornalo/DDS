import java.math.BigDecimal;

public class Prenda {
	private String tipo;
	private Categoria categoria;
	private Material material;
	private Trama trama;
	private Color colorPrincipal;
	private Color colorSecundario;
	private BigDecimal temperaturaMax;
	
	
	public Prenda(String tipoNuevo,Material material,Color colorPrincipal,Trama tramaNueva, Color colorSecundario, Categoria categoria,BigDecimal temperatura){
		this.tipo 	  		 = tipoNuevo;
		this.material 		 = material;
		this.trama  		 = tramaNueva;
		this.colorPrincipal  = colorPrincipal;
		this.colorSecundario = colorSecundario;
		this.temperaturaMax  =  temperatura;
	}
	
	public String tipo() {
		return tipo;
	}
	
	public Material material() {
		return material;
	}
	
	public Color colorPrincipal() {
		return colorPrincipal;
	}
	
	public Color colorSecundario() {
		if(colorSecundario == null) throw new RuntimeException("No tiene color secundario");
		return colorSecundario;
	}

	public Boolean soyAptaParaClima(BigDecimal temperatura){
		return this.temperaturaMax > temperatura;
	}

	public Boolean categoriaEs(Categoria categoriaNueva){
		return categoriaNueva  == this.categoria;
	}
}
