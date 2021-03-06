package cdm1_OscarB;
import java.util.Random;
public class Jugadores {

		private String nombre;
		private String ficha;
		private Random dado;
		private Tablero tablero;
		
		public Jugadores(String nombre, Tablero tablero) {
			this.nombre = nombre;
			ficha = null;
			dado = new Random();
			this.tablero = tablero;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getFicha() {
			return ficha;
		}

		public void setFicha(String ficha) {
			this.ficha = ficha;
		}

		public int tirarDado() {
			return (dado.nextInt(5))+1;
		}
		
		public boolean movimientoFicha(String coords) {
			
			int fila = 0, columna = 0;
			boolean correcto = true;
			
			switch (coords) {
				case "A1" : {
					fila = 0;
					columna = 0;
					break;
				}
				case "A2" : {
					fila = 1;
					columna = 0;
					break;
				}
				case "A3" : {
					fila = 2;
					columna = 0;
					break;
				}
				case "B1" : {
					fila = 0;
					columna = 1;
					break;
				}
				case "B2" : {
					fila = 1;
					columna = 1;
					break;
				}
				case "B3" : {
					fila = 2;
					columna = 1;
					break;
				}
				case "C1" : {
					fila = 0;
					columna = 2;
					break;
				}
				case "C2" : {
					fila = 1;
					columna = 2;
					break;
				}
				case "C3" : {
					fila = 2;
					columna = 2;
					break;
				}
				default : {
					System.out.println();
					System.out.println("Por favor introduce correctamente las coordenadas");
					correcto = false;
					break;
				}
			}
			if (correcto) {
				correcto = tablero.introducirFicha(getFicha(), fila, columna);
				if (!correcto) {
					System.out.println();
					System.out.println("Casilla ocupada");
				}
			}
			return correcto;
		}
	}
