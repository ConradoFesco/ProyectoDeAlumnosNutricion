import java.util.ArrayList;
import java.util.List;

public class Producto {
	
	private String id;
	private List <Integer> etiquetas;
	private String path;
	public Producto(String id) {
		super();
		this.id = id;
		this.etiquetas = new ArrayList <Integer>();
	}
	public String getId() {
		return id;
	}
	public String getPath() {
		return path;
	}
	public List<Integer> getEtiquetas() {
		return etiquetas;
	}
	
	public void agregar(int i) {
		etiquetas.add(i);
	}
	
	public void setPath(String p) {
		this.path=p;
	}
	
}
