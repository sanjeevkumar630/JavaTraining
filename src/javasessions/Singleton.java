package javasessions;

public class Singleton {
	
	private static Singleton singleton_instance=null;
	public String str;
	
	private Singleton() {
		
		str="Hey I am using singleton Class ";
		
	}
	public static Singleton getInstance() {
		if(singleton_instance==null)
			singleton_instance=new Singleton();
		return singleton_instance;
	}

	public static void main(String[] args) {

		Singleton s=singleton_instance.getInstance();
		Singleton s2=singleton_instance.getInstance();
		Singleton s3=singleton_instance.getInstance();
		
		s.str=(s.str.toUpperCase());
		System.out.println(s.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		
		s3.str=(s.str.toLowerCase());
		System.out.println(s.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		
		
		
		
		
		
		
	}

}
