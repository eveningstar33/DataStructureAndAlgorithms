package ds.hashtablesarray;

public class App {

	public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        Employee evaHarat = new Employee("Eva", "Harat", 422);
        Employee tomHanks = new Employee("Tom", "Hanks", 3647);
        Employee paulBobos = new Employee("Paul", "Bobos", 1920);
        
//        SimpleHashtable ht = new SimpleHashtable();
        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("Harat", evaHarat);
        ht.put("Hanks", tomHanks);
        ht.put("Bobos", paulBobos);

        ht.printHashtable();
        
        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
        
        ht.remove("Harat");
        ht.remove("Hanks");
        ht.printHashtable();
	}

}
