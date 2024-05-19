import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Sugerencias {
    private List<Prenda>  prendasDisponibles = new ArrayList<>();
    
    public List<Map<String, Object>> condicionesClimaticas(){
        return apiDelClima.getWeather("Buenos Aires,Argentina");
    }
    
    public Prenda prendaAptaParaTemperatura(BigDecimal temperatura){
        return prendasDisponibles.stream().findAny(prenda -> prenda.soyAptaParaClima(temperatura));
    }

    public Prenda prendaAptaParaTemperaturaDeCategoria(Categoria categoria){
        return prendaAptaParaTemperatura(this.temperaturaDeHoy()).stream().findAny(prenda -> prenda.categoriaEs(categoria));
    }

    public BigDecimal temperaturaDeHoy(){
        return this.condicionesClimaticas().get(0).get("Temperature").get("Value");
    } 
}
