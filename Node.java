import java.util.LinkedList;

public class Node {
	String label;
	LinkedList<Node> children;
	int child_count;
	int value;
	String id;
	
	public Node(String label){
		this.label=label;
		this.child_count = 0;
		this.children = new LinkedList<Node>();
	}
	
	public void addChild(Node n){
		if(children == null){
			this.children = new LinkedList<Node>();	
		}
		this.children.add(n);
		this.child_count++;
	}

	public String getLabel() {
		return this.label;
	}

	public int getValue() {
		return this.value;
	}

	public String getID() {
		return this.id;
	}

	@Override
	public String toString() {
		String string = this.label+" node with "+this.child_count+ " children.";
		return string;
	}
	
}
