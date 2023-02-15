package GenericsSrc;

public class Bin <R, N> {
	private R recyclable;
	private N nonRecyclable;
	
	public R getRecyclable() {
		return recyclable;
	}
	
	public void setRecyclable(R recyclable) {
		this.recyclable = recyclable;
	}
	
	public N getNonrecyclable() {
		return nonRecyclable;
	}
	
	public void setNonrecyclable(N nonRecyclable) {
		this.nonRecyclable = nonRecyclable;
	}
}
