package empresa;

public class Anexo4ConstrucaoCivil extends Empresa{
		
		public void run() {
			this.digitaFaturamento();
			this.calculaImposto();
			SaidaUsuario.relatorio(getFaturamento(), getFaturamentoTotal(), getImposto());
		}
		
		
		@Override
		public void calculaImposto() {
			// TODO Auto-generated method stub
			this.setFaturamentoTotal();
			float mes12 = this.getFaturamento().get(11);
			
			if (this.getFaturamentoTotal() >= 0 && this.getFaturamentoTotal() <= 180000.00f) {
				this.setImposto(mes12* 0.045f);
			}
			
			
			else if (this.getFaturamentoTotal() > 180000.00f && this.getFaturamentoTotal() <= 360000.00f) {
				this.setImposto(mes12* 0.09f);
						
			}
			
			else if (this.getFaturamentoTotal() > 360000.00f && this.getFaturamentoTotal() <= 720000.00f) {
				this.setImposto(mes12* 0.102f);
						
			}
			
			else if (this.getFaturamentoTotal() > 720000.00f && this.getFaturamentoTotal() <= 1800000.00f) {
				this.setImposto(mes12* 0.14f);
			}
			
			else if (this.getFaturamentoTotal() > 1800000.00f && this.getFaturamentoTotal() <= 3600000.00f) {
				this.setImposto(mes12* 0.22f);
			}
			
			else if (this.getFaturamentoTotal() > 3600000.00f && this.getFaturamentoTotal() <= 4800000.00f) {
				this.setImposto(mes12* 0.33f);
			}
			
			else {
				System.out.println("Seu perfil não se enquadra aos anexos do Simples Nacional");
			}
		}
	

}
