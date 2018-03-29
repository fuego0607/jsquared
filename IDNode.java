
public class IDNode extends Node {

	public IDNode(String id){
		super("ID");
		this.id = id;	
	}

	@Override
	public String toString() {
		String string = this.label+" node storing variable with ID '"+this.id+ "'.";
		return string;
	}
}