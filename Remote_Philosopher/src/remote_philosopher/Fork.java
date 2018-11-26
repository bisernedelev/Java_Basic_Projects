class Fork{
	private boolean taken;
	String name;
	Fork(String name){
		taken = false;
		this.name=name;
	}
	synchronized void take(Philosopher p){
		while(taken){
			try{     wait();   }
			catch(InterruptedException e){
	            			System.err.println(e);
			}
		}
		System.out.println(p+" Take "+name);
		taken = true;
	}
	synchronized void pose(){
		taken = false;
		notify();
	}
	boolean canTake(){
		if (!taken)return true;
		else return false;
	}
	public String toString(){
		return name;
	}
}