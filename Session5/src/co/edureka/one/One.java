package co.edureka.one;

// public class
public class One {

	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

// default class
class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

/* we cannot create private and protected classes like below:
private class Three{
	
}

protected class Four{
	
}
*/

// Not allowd : 1 source file can have only 1 public class: because name of source file should be same as that of public class
/*public class Five{
	
}*/

// We can have multiple default classes in the same source file