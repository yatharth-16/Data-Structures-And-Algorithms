
public class TrieUse {

	public static void main(String[] args) {
		
		
		Trie t = new Trie();
		t.add("this");
		t.add("news");
		System.out.println(t.search("news"));
		t.remove("news");
		System.out.println(t.search("news"));
		
		String s ="abcd";
		
		System.out.println(s.substring(0, s.length()));

	}

}
