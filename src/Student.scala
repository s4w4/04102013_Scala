/*
class Student {
	private final String name;
	private final int matNr;
	
	public Student(String name, int matNr){
	  this.name = name;
	  this.matNr = matNr;
	}
	
	public String getName() {return name;}
	
	public int getMatNr(){return matNr;}
	
	public boolean equals(Object other) {return true /* ... */}
	
	public int hashCode() {return 1;} //nicht OK
	
	public String toString(){return "Student("+name+","+matNr+")";}
}

*/


case class Student(name:String,matNr:Int)
