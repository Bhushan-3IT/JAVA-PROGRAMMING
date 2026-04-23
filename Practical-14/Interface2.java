interface Interf{
	int x=888;
}
class Demo implements Interf{
	public static void main(String[] args){
		int x=1;
		System.out.print(x);
		System.out.print(Interf.x);

	}



}