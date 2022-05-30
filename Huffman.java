// CTS2: Gullu Gasimova (3138585)

package code;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import code.Code;
import code.Code.CodeItem;

public class Huffman {
	
	private static LinkedList<CodeItem> store;
	
	private static void fill(Code c) {
		store = new LinkedList<CodeItem>();	
		for(int i = 0; i < c.size(); i++) {
			store.add(c.getAt(i));
			c.getAt(i).setEncoding("");
		}
	}
	
	private static void sorted(Code c) {
		Comparator<CodeItem> cmp = new Comparator<CodeItem>() {
			 public int compare(CodeItem a, CodeItem b){
	                if(a.getProbability() >= b.getProbability()){
	                    return 1;
	                }
	                else{
	                    return -1;
	                }
	          }
		};
		Collections.sort(store, cmp);
		
	}

	public static void generateHuffmanCode(Code c) {
		fill(c);
		sorted(c);
		CodeItem sum = null;
		int i = 1;
		HashMap<String, String> hcode = new HashMap<String, String>();
		String value1 = "0";
		String value2 = "1";
		
		while(store.size() > 1) {
			i = 1;
			String[] parts1 = store.get(i-1).getSymbol().split("");
			String[] parts2 = store.get(i).getSymbol().split("");
			for(int j = 0; j < parts1.length; j++) {
				if(hcode.containsKey(parts1[j])) {
					hcode.replace(parts1[j], "0".concat(hcode.get(parts1[j])));
				}else {
					hcode.put(parts1[j],value1);
				}
			}
			for(int j = 0; j < parts2.length; j++) {
				if(hcode.containsKey(parts2[j])){
					hcode.replace(parts2[j], "1".concat(hcode.get(parts2[j])));
				}else {
					hcode.put(parts2[j], value2);
				}
			}
			sum = add(store.get(i-1), store.get(i));
			delete(store.get(i-1), store.get(i));
			store.add(sum);
			sorted(c);
		}
		
		for(int k = 0; k < c.size(); k++) {
			c.getAt(k).setEncoding(hcode.get(c.getAt(k).getSymbol()));
		}
	}
	
	private  static CodeItem add(CodeItem c1, CodeItem c2){
		return new CodeItem(c1.getSymbol().concat(c2.getSymbol()),c1.getProbability() + c2.getProbability());	
	}
	
	private static void delete(CodeItem c1, CodeItem c2) {
		store.remove(c1);
		store.remove(c2);
	}
}