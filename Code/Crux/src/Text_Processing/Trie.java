package Text_Processing;

public class Trie {
	TrieNode root;
	int numWords;

	public Trie() {
		root = new TrieNode('r');
	}

	public int numWords() {
		return numWords;
	}

	public void deleteWord(String word) {
		if (deleteWord(word, root))
			numWords--;
	}

	private static boolean deleteWord(String word, TrieNode node) {
		if (word.length() == 0) {
			if (!node.isTerminal)
				return false;
			node.isTerminal = false;
			return true;
		}
		TrieNode child = node.getChild(word.charAt(0));
		if (child == null) {
			return false;
		} 
		boolean output = deleteWord(word.substring(1), child);
		if (!child.isTerminal && child.getNumChildren() == 0) {
			node.removeChild(child.getChar());
		}
		return output;
	}


	public boolean search(String word) {
		TrieNode currentNode = root;
		for (int i = 0; i < word.length(); i++) {
			TrieNode child = currentNode.getChild(word.charAt(i));
			if (child == null)
				return false;
			currentNode = child;
		}
		return currentNode.isTerminal;
	}

	private static boolean addWord(String word, TrieNode node) {
		if (word.length() == 0) {
			if (node.isTerminal)
				return false;
			node.isTerminal = true;
			return true;
		}

		TrieNode child = node.getChild(word.charAt(0));
		if (child == null) {
			child = new TrieNode(word.charAt(0));
			node.setChild(child);
		} 
		return addWord(word.substring(1), child);
	}

	public void addWord(String word) {
		if (addWord(word, root))
			numWords++;

	}
}
