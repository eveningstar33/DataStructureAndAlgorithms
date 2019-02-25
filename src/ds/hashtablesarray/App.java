package ds.hashtablesarray;

public class App {

	public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        Employee cacat = new Employee("Mars", "Cacat", 422);
        Employee gaga = new Employee("Gaga", "Ertyu", 3647);
        Employee paul = new Employee("Paul", "Bobos", 1920);
        
        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("Cacat", cacat);
        ht.put("Ertyu", gaga);
        ht.put("Bobos", paul);

        ht.printHashtable();
        
        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
	}

}
