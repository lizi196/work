package work8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test1 {
	public static void main(String[] args) {
    	Books book1 = new Books("0001", "book1", 10.00, "a");
    	Books book2 = new Books("0002", "book2", 20.00, "b");
    	Books book3 = new Books("0003", "book3", 30.00, "c");
    	Books book4 = new Books("0004", "book4", 40.00, "d");
    	
    	HashMap<String, Books> BookHashMap = new HashMap<>();
    	BookHashMap.put(book1.getId(), book1);
    	BookHashMap.put(book2.getId(), book2);
    	BookHashMap.put(book3.getId(), book3);
    	BookHashMap.put(book4.getId(), book4);
    	
    	List<HashMap<String, Books>> BookList = new ArrayList<>();
    	BookList.add(BookHashMap);
    	System.out.println("编号        书名         价格     出版社");
        for (HashMap<String, Books> h : BookList) {
            //获取key
            Set<String> key = h.keySet();
            for (String i : key) {
                //再通过key找value
                System.out.println(i+ "    " + h.get(i).getName()+ "    " + h.get(i).getPrice() + "     " + h.get(i).getPress());
            }
        }
    }

}
