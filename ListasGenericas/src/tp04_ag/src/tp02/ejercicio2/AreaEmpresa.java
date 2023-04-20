package tp04_ag.src.tp02.ejercicio2;

public class AreaEmpresa {
	private String id;
	private int ret;
	
	
	public AreaEmpresa(int a, String b) {
		this.ret = a;
		this.id = b;
	}
	public void setId (String id) {
		this.id = id;
	}



	public int getRet() {
		return ret;
	}



	public void setRet(int ret) {
		this.ret = ret;
	}



	public String getId() {
		return id;
	}
	
}
