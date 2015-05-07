package interfaces;

public class InterfaceAll {
	
	private InterfaceText inter;
	
	public void setInter(InterfaceText inter){
		this.inter = inter;
	}
	
	public InterfaceText getInter(){
		return this.inter;
	}
	
	
	public void ReadData(){
		this.inter.read();
	}
	
	public void WriteData(){
		this.inter.write();
	}

}
