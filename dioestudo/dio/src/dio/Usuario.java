package dio;

public class Usuario {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.mudarCanal(14);
		
		System.out.println("Tv Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual? " + smartTv.canal);
		System.out.println("Volume Atual? " + smartTv.volume);
		smartTv.ligar();
		System.out.println("Novo Status - TV ligada? "+ smartTv.ligada);
		
	}

}