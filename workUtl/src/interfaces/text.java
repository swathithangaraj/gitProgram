package interfaces;

public class text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceAll all = new InterfaceAll();
		InterfaceText a = new textA();
		all.setInter(a);
		all.WriteData();
		all.ReadData();
	}

}
