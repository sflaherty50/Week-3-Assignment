import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employeeNames = new ArrayList<String>(); // 1
		employeeNames.add("Rob");//4
		employeeNames.add("Bob");//4
		employeeNames.add("Sam");//4
		employeeNames.add("Sean");//4
		employeeNames.add("John");//4

		Set<Integer> ids = new HashSet<Integer>(); // 2
		ids.add(1);//4
		ids.add(2);//4
		ids.add(6);//4
		ids.add(4);//4
		ids.add(3);//4

		Map<Integer, String> employeeMap = new HashMap<Integer, String>(); // 3
		int i = 0;//5

		for (Integer id : ids)//5

		{
			employeeMap.put(id, employeeNames.get(i));//5
			System.out.println(employeeNames.get(i));//5
			i = i + 1;//5
		}

		Set<Integer> employeeMapKeys = employeeMap.keySet();//6
		for (Integer key : employeeMapKeys) {//6
			System.out.println(key + " : " + employeeMap.get(key));//6
		}

		StringBuilder idsBuilder = new StringBuilder("");//7

		
		for (Integer id : ids) {//8
			idsBuilder.append(id + "-");
		}//8
			System.out.println(idsBuilder);//9

		StringBuilder namesBuilder = new StringBuilder("");//10

		
		for (String employeeName : employeeNames) {//11
			namesBuilder.append(employeeName+" ");//11
			
		}
		
		System.out.print(namesBuilder);//12
	}
}

