package string_class;

public class Ways_to_declare {

	public static void main(String[] args) {
		
//		by String literal
		String a = "abc";
		String b = "abc";
				
//		now this will get memory allocation into SCP area of heap memory 
//		and allocation is like a = "abc"; and a=b= "abc"
//		another object will not be created by jvm
		
//		---------------------------------------------------------------------
		
//		by using new keyword
		
		String h = new String("mnop");
		String i = new String ("mnop");
		
//		 for this type 2 objects are created one in heap memory and another in SCP area
//		in heap memory
//		h="mnop"
//		i="mnop"
		
//		in SCP area
//		h = "mnop"
//				h=i="mnop"
		
	}

}
