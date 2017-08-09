import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Employee emp1 = new Employee("C1", 1);
		Employee emp2 = new Employee("A1", 2);
		Employee emp3 = new Employee("A1", 3);
	
		Set<Employee> empSet = new TreeSet<Employee>();
	
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		
		System.out.println(empSet);
	}
}
