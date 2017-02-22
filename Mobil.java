public class Mobil{
	private boolean started;
	private int kecMax;
	private int percepatan;
	private int kecActual;
	private int Gigi;

	public Mobil() {

	}
	public Mobil(int kecMax, int percepatan, int kecActual){
		this.kecMax= kecMax;
		this.percepatan = percepatan;
		this.kecActual = kecActual;
		this.started = false;
		this.Gigi = 0;
	}

	public void setkecMax(int kecMax){
		this.kecMax = kecMax;
	}
	
	public void setpercepatan(int percepatan){
		this.percepatan = percepatan;
	}
	public void setkecActual(int kecActual){
		this.kecActual = kecActual;
	}

	public void setstarted(boolean started){
		this.started = started;
	}
	
	public void setGigi(int Gigi){
		this.Gigi = Gigi;
	}
	 
	public int getkecMax(){
		return kecMax;
	}

	public int getpercepatan(){
		return percepatan;
	}

	public int getkecActual(){
		return kecActual;
	}

	public boolean isstarted(){
		return started;
	}

	public int getGigi(){
		return Gigi;
	}

	public void started(){
		if (!started ){
			this.setkecActual(0);
		}
	}
	public void stop(){
		this.setkecActual(0);
		this.setstarted(true);
		System.out.println("Mobil sudah berhenti silahkan anda turun");
	}
	public void rem(){
		this.setkecActual(this.getkecActual()/2);
	}
	public void gantiGigi(int Gigi){
		//System.out.println("Silahkan Pilih naikan gigi:");
		//this.setpercepatan(percepatan);
		switch(Gigi){
			case 0 :
				this.setpercepatan(0);
				break;
			case 1 :
				this.setpercepatan(10);
				break;
			case 2 :
				this.setpercepatan(15);
				break;
			case 3 :
				this.setpercepatan(20);
				break;
			case 4 :
				this.setpercepatan(25);
				break;
			case 5 :
				this.setpercepatan(30);
				break;
		}
	}
	public void gas(){
		if (this.getkecActual()+this.getpercepatan() < this.getkecMax()){
			this.setkecActual(this.getkecActual()+this.getpercepatan());
		}else this.setkecActual(this.getkecMax());

				
	}


}

	


