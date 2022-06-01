package DIO.GOF.singleton;



	public class SingletonEager {

		private static SingletonEager instancia = new SingletonEager();
		
		private SingletonEager(){
			super();
		}
		
		public static SingletonEager getinstancia() {
			return instancia;
		}
	}

