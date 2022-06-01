package DIO.GOF;

import DIO.GOF.facade.Facade;
import DIO.GOF.singleton.SingletonEager;
import DIO.GOF.singleton.SingletonLazy;
import DIO.GOF.singleton.SingletonLazyHolder;
import DIO.GOF.strategy.Comportamento;
import DIO.GOF.strategy.ComportamentoAgressivo;
import DIO.GOF.strategy.ComportamentoDefensivo;
import DIO.GOF.strategy.ComportamentoNormal;
import DIO.GOF.strategy.Robo;

public class teste {

		
		public static void main(String[] args) {
			
			
			SingletonLazy lazy = SingletonLazy.getinstancia();
			System.out.println(lazy);
			lazy = SingletonLazy.getinstancia();
			System.out.println(lazy);
			
			SingletonEager eager = SingletonEager.getinstancia();
			System.out.println(eager);
			eager = SingletonEager.getinstancia();
			System.out.println(eager);
			
			SingletonLazyHolder holder = SingletonLazyHolder.getinstancia();
			System.out.println(holder);
			holder = SingletonLazyHolder.getinstancia();
			System.out.println(holder);
		
			Comportamento normal = new ComportamentoNormal();
			Comportamento defensivo = new ComportamentoDefensivo();
			Comportamento agressivo = new ComportamentoAgressivo();
			
			Robo robo = new Robo();
			
			robo.setComportamento(normal);
			robo.mover();
			robo.mover();		
		
			robo.setComportamento(agressivo);		
			robo.mover();
			
			robo.setComportamento(defensivo);		
			robo.mover();
			robo.mover();
			
			
			Facade facade = new Facade();
			facade.migrarCliente("Camila", "89012150");
		}

	}

