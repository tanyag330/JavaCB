package Text_Processing;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.addWord("news");
		t.addWord("new");
		t.addWord("zen");
		t.addWord("queen");
		t.addWord("queue");
		System.out.println(t.search("new"));
		System.out.println(t.search("ne"));
		t.deleteWord("news");
		System.out.println(t.search("news"));
		System.out.println(t.search("new"));
	}

}
