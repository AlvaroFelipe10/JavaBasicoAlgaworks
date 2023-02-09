/* RESOLUÇÃO */
public class Televisor {

		Integer canal = 130;
		Integer volume = 20;
		
		void mudarCanal(Integer novoCanal){
			if (canal.equals(novoCanal)){
				System.out.println("Novo canal é também o canal atual.");
			}else {
				canal = novoCanal;
				System.out.println("Canal alterado para " + canal);
			}
		}
		
		void mudarVolume(Integer novoVolume){
			if (volume.equals(novoVolume)) {
					System.out.println("Novo volume é também o  volume atual ");
			}else {
					volume = Integer.valueOf(novoVolume);
					Integer volumeFinal = volume.intValue();
			
					System.out.println("Volume alterado para " + volumeFinal);
			}
		
		}
	
		public static void main(String[] args) {
			Televisor tv = new Televisor();
			
			// Não deveria mudar o volume e canal
			tv.mudarVolume(20);
			tv.mudarCanal(130);
			
			System.out.println("");
			
			// Deveria mudar o volume e canal
			tv.mudarVolume(300);
			tv.mudarCanal(10);
		}

}

/* PROBLEMA */


/*class Televisor {

Integer canal = 130;
Integer volume = 20;

void mudarCanal(Integer novoCanal) {
	if (canal == novoCanal) {
		System.out.println("Novo canal é também o canal atual.");
	} else {
		canal = novoCanal;
		System.out.println("Canal alterado para " + canal);
	}
}

void mudarVolume(Integer novoVolume) {
	if (novoVolume == volume) {
		System.out.println("Novo volume é também o volume atual.");
	} else {
		volume = new Integer(novoVolume.byteValue());
		System.out.println("Volume alterado para " + volume);
	}
}

// Estamos aproveitando a classe Televisor para fazer nosso teste
public static void main(String[] args) {
	Televisor tv = new Televisor();

	// Não deveria mudar o volume e canal
	tv.mudarVolume(20);
	tv.mudarCanal(130);
	
	// Deveria mudar o volume e canal
	tv.mudarVolume(300);
	tv.mudarCanal(10);
}

} */