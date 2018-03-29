
public class INTNode extends Node {
		
	public INTNode(String value){
		super("INT");
		this.value = Integer.parseInt(value);	
	}

	@Override
	public String toString() {
		String string = this.label+" node storing value of "+this.value+ ".";
		return string;
	}
}

