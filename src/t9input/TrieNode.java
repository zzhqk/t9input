package t9input;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TrieNode {
	private Character key;
	private Map<Character, TrieNode> childrenMap;
	private List<Integer> idList;
	
	public TrieNode(Character key){
		this.key = key;
		this.childrenMap = new HashMap<Character, TrieNode>();
		idList = new LinkedList<Integer>();
	}
	
	public Character getKey() {
		return this.key;
	}
	
	public void addValue(Integer v){
		this.idList.add(v);
	}
	public List<Integer> getValues(){
		return this.idList;
	}
	public boolean hasChildren(){
		return this.childrenMap.size() > 0;
	}
	
	public Map<Character,TrieNode> getChildren() {
		return this.childrenMap;
	}
	
	public void addChild(TrieNode childNode) {
		this.childrenMap.put(childNode.getKey(), childNode);
	}
}
