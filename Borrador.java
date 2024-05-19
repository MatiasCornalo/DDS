public class Borrador {
    private String tipo;
	private Categoria categoria;
	private Material material;
	private Trama trama = Trama.lisa;
	private Color colorPrincipal;
	private Color colorSecundario;

    public void tipo(String tipoNuevo){
        if(tipoNuevo ==  null) throw  new RuntimeException("La prenda  requiere de un  tipo especifico");
        this.tipo = tipoNuevo;
    }

    public void categoria(Categoria categoriaNueva){
        if(categoriaNueva  == null) throw  new RuntimeException("La prenda  requiere de una categoria especifica");
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.categoria = categoriaNueva;
    }

    public void material(Material materialNuevo){
        if(material == null) throw  new RuntimeException("La prenda requiere de un material especifico");
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.material = materialNuevo;
    }

    public void colorPrincipal(Color colorNuevo){
        if(colorNuevo == null) throw  new RuntimeException("La prenda requiere de un material especifico");
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.colorPrincipal = colorNuevo;
    }

    public void trama(Trama tramaNueva){
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.trama = tramaNueva;
    }

    public void colorSecundario(Color colorNuevo){
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.colorSecundario = colorNuevo;
    }

    public Prenda construirPrenda(){
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        return new Prenda(this.tipo,this.material,this.colorPrincipal,this.trama,this.colorSecundario,this.categoria);
    }
}
