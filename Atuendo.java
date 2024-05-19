import java.util.List;

public class Atuendo {
	private List<Prenda> prendas;
	
	public Atuendo(List<Prenda> prendasNuevas) {
		this.prendas = prendasNuevas;
	}
	
	public List<Prenda> prendas() {
		return prendas;
	}
}
