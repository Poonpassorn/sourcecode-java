import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCF {

	public static void main(String[] args) {
		//Map
		Map<String, Integer> employees = new HashMap<>();
		employees.put("somkiat", 30);
		employees.put("pui", 40);
		employees.put("pui", 20);
		System.out.println(employees.get("somkiat"));
		System.out.println(employees.get("pui"));//20 (last index)
		if( !employees.containsKey("xxx")) {//ใช้แบบนี้
			System.out.println("Key not found");
		}
		
		// Map + iterate
		Set<String> keys = employees.keySet();
		for (String key : keys) {
//			System.out.println("%s -> %d\n",key.employees.get(key));
		}
		//array :: fix length
		int[] numbers = {1,2,3};
		System.out.println(numbers.length);
		for (int i : numbers) {
			System.out.println(i +", ");
		}
		
		System.out.println();
		//List :: dynamic array
		// JDK <= 1.7
		List<Integer> numberList1 = new ArrayList<Integer>();
		// JDK > 1.7
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		int size = numberList.size(); // สร้างแบบนี้แทน
		System.out.println(size);
		for (Integer integer : numberList) {
			System.out.print(integer +", ");
		}
		
		for (int i = 0; i < size; i++) {  //numberList.size(); ไม่ควรใช้บ่อยๆ 
			System.out.print(numberList.add(i) +", ");
			
		}
	}

}
