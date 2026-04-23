interface I{
	default void sample(){
		System.out.print("from I");
	}
}

interface J{
	default void sample(){
		System.out.print("from J");
	}
}

class Demo implements I,J{
	 public  void sample(){
		System.out.print("from main");
	}
	public static void main(String[] args){
		Demo d=new Demo();
		d.sample();	
		
	}
}

