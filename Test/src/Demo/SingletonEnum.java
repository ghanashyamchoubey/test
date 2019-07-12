package Demo;

public enum SingletonEnum implements Runnable{
    INSTANCE;
    private int value;
    SingleEnum2 mu = SingleEnum2.INSTANCE2;
    
    public String test() {
    	mu.setMaal("ABC");
    	return mu.getMaal();
    }
    static {
    	System.out.println("WCV");
    }
    
    public int getValue() {
        return value;
    }
    public void setValue(int value) throws Exception{
        this.value = value;
    }
    public static void main(String[] args) {
		SingletonEnum tes = SingletonEnum.INSTANCE;
		System.out.println(tes.test());
		Thread t = new Thread(SingletonEnum.INSTANCE);
		t.start();
		
	}
    static class ABC{
    	
    }
	@Override
	public void run() {
}
}

enum SingleEnum2 {
	INSTANCE2;
	
	String maal;
	public String getMaal() {
		return maal;
	}
	public void setMaal(String maal) {
		this.maal = maal;
	}
}