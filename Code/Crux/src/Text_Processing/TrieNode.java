package Text_Processing;

public class TrieNode {
	private char data;
	boolean isTerminal;
	
	private TrieNode[] children;
	private int numChildren;
	
	public TrieNode(char data) {
		if (data >= 'A' && data <= 'Z') {
			data = (char)(data - 'A' + 'a');
		}
		this.data = data;
		children = new TrieNode[26];
	}
	
	public char getChar() {
		return data;
	}
	
	public int getNumChildren() {
		return numChildren;
	}
	
	public TrieNode getChild(char childData) {
		if (childData < 'a' || childData >'z')
			return null;
		
		return children[childData - 'a'];
	}
	
	public void removeChild(char childData) {
		if (children[childData - 'a'] == null)
			return;
		children[childData - 'a'] = null;
		numChildren--;
	}
	
	public void setChild(TrieNode child) {
		char childChar = child.data;
		if (children[childChar - 'a'] == null) {
			numChildren++;
		}
		children[childChar - 'a'] = child;
	}
}
