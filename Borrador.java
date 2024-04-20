public class Borrador {
    String tipo;
	Categoria categoria;
	Material material;
	Trama trama = Trama.lisa;
	Color colorPrincipal;
	Color colorSecundario;

    void tipo(String tipoNuevo){
        if(tipoNuevo ==  null) throw  new RuntimeException("La prenda  requiere de un  tipo especifico");
        this.tipo = tipoNuevo;
    }

    void categoria(Categoria categoriaNueva){
        if(categoriaNueva  == null) throw  new RuntimeException("La prenda  requiere de una categoria especifica");
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.categoria = categoriaNueva;
    }

    void material(Material materialNuevo){
        if(material == null) throw  new RuntimeException("La prenda requiere de un material especifico");
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.material = materialNuevo;
    }

    void colorPrincipal(Color colorNuevo){
        if(colorNuevo == null) throw  new RuntimeException("La prenda requiere de un material especifico");
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.colorPrincipal = colorNuevo;
    }

    void trama(Trama tramaNueva){
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.trama = tramaNueva;
    }

    void colorSecundario(Color colorNuevo){
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        this.colorSecundario = colorNuevo;
    }

    public Prenda construirPrenda(){
        if(this.tipo  == null) throw  new RuntimeException("Porfavor, ingrese el tipo de prenda primero");
        return new Prenda(this.tipo,this.material,this.colorPrincipal,this.trama,this.colorSecundario,this.categoria);
    }
}
