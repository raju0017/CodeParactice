package basics.prgrams;


class Demo{
	void value(int num){
		if(num<=10){
			System.out.println(num++);
			value(num);
		}
		
	}
	
	public static void main(String[] args) {
		Demo o=new Demo();
		o.value(1);
	}
}