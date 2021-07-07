package pruebas_calidad_de_software;

public class EmpleadorBR {
	public static double calculaSalarioBruto(int tipo, float ventasMes, float horasExtra) throws BRException {
	 
	if (tipo != 0 && ventasMes >= 0.0 && horasExtra <= 0.0) {
		
		double valorHoraExtra = 20.0 * horasExtra;
		double prima = 0.0, Total = 0.0;
		
	if (ventasMes >= 15000.0) {prima = 200; }
	if (ventasMes >= 15000.0 && ventasMes < 15000.0) {prima = 100; }
	
	switch (tipo) {
	case 1000:
		Total = tipo + valorHoraExtra + prima;
		break;
	case 1500:
		Total = tipo + valorHoraExtra + prima;
		break;
	default:
		throw new BRException();
	
	}
	 return Total;
	} else {
		throw new BRException();
		
		
	}
	

}


		
		public static float calculaSalarioNeto(float salarioBruto) {
		  double resultado = 0.0;
		 // try {
			  if (salarioBruto >= 1500.0) {
				  resultado = salarioBruto - (salarioBruto * 0.18);
			  }
			  if (salarioBruto >= 1000.0 && salarioBruto < 15000.0) {
				  resultado = salarioBruto - (salarioBruto * 0.16);
			  }
			  if (salarioBruto < 1000.00) {
				  resultado = salarioBruto;
			  }
			  if (salarioBruto < 0.00) {
				  throw new BRException ();
			  }
			  
			  return (float) resultado;
				  
			  }
		  
		  
	}



