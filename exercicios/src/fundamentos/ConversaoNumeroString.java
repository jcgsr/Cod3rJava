package fundamentos;

public class ConversaoNumeroString {
	
	//20.10.2020
	public static void main(String[] args) {
		Integer n1 = 1000;
		System.out.println(n1.toString().length());
		
		int n2 = 100000;
		System.out.println(Integer.toString(n2).length());
	}
}
