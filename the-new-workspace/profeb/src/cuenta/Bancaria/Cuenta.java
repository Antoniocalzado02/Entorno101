package cuenta.Bancaria;

public class Cuenta {

		private double saldo=0.0;
		private double reintegro=0.0;
		private double ingreso=0.0;
		private double SaldoFinal=0.0;
		private static int contadorReintegros=0;
		private static int contadorIngresos=0;
		
		
		
		//constructores//
		
		public Cuenta(double saldo) {
			super();
			setSaldo(saldo);
		}
		
		//metodos//
		
		public double IngresarCuenta() {
			double SaldoFinal=0;
			
			if (ingreso>0) {
				SaldoFinal=saldo+ingreso;
			}
			
			setSaldo(SaldoFinal);
			contadorIngresos++;
			return SaldoFinal;
		}
		
		public double RetirarCuenta() {
			double SaldoFinal=0;
			
			if (reintegro<getSaldo()) {
				SaldoFinal=saldo-reintegro;
			}else {
				System.out.println("El reintegro supera al Saldo, imposible realizar el reintegro");
			}
			
			setSaldo(SaldoFinal);
			contadorReintegros++;
			return SaldoFinal;
			
		}
		
		public double ConsultarSaldo() {
			
			return saldo;
			
		}

		public double getSaldo() {
			return saldo;
		}

		public double getReintegro() {
			return reintegro;
		}

		public double getIngreso() {
			return ingreso;
		}

		public double getSaldoFinal() {
			return SaldoFinal;
		}

		public static int getContadorReintegros() {
			return contadorReintegros;
		}

		public static int getContadorIngresos() {
			return contadorIngresos;
		}

		public void setSaldo(double saldo) {
			if (saldo>0) {
				this.saldo = saldo;
			}else {
				System.out.println("Saldo incorrecto");
			}
		}

		public void setReintegro(double reintegro) {
			if (reintegro<saldo) {
				this.reintegro = reintegro;
			}
			
		}

		public void setIngreso(double ingreso) {
			this.ingreso = ingreso;
		}
		
		public void setSaldoFinal(double saldoFinal) {
			saldoFinal=saldo;
			SaldoFinal = saldoFinal;
		}
}



























