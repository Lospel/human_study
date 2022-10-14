package exam03_1;

public class Product <T, M> {
	private T type;
	private M model;
	
	public T getType() {
		return this.type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public M getModel() {
		return this.model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
