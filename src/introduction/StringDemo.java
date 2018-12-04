package introduction;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string literal= String constant pool
		String str="Hello world from veer";
		
		String str3="Hello";
		String str4="Hello";
		String str5="HelloWorld";
		//string object =Heap
		String str2= new String("Hello World");
		
		System.out.println("The lenght of string:"+ str.length());
		System.out.println("the char at"+ str.charAt(3));
		System.out.println(str.concat("To Clean code"));
		System.out.println(str.contains("to"));
		System.out.println(str.contains("To"));
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.startsWith("hello"));
		System.out.println(str.endsWith("IS"));
		System.out.println(str.endsWith("veer"));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		System.out.println(str.indexOf("v"));
		System.out.println(str.isEmpty());
		System.out.println(str.trim());
		System.out.println(str4.replace('H', 'e'));
		
		System.out.println("Substring"+ str.substring(4));
		System.out.println("Substring overload" + str.substring(6,11));
		
	    char []chararray = str.toCharArray();
	    for(int i=0; i<chararray.length;i++)
	    {
	    	System.out.println("Index "+ i + " is "+ chararray[i]);
	    }
	    
	    System.out.println(str.toLowerCase());
	    System.out.println(str.toUpperCase());


	}

}
