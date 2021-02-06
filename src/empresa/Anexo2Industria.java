package empresa;

public class Anexo2Industria extends Empresa {

	public void run() {
		this.digitaFaturamento();
		this.calculaImposto();
		SaidaUsuario.relatorio(getFaturamento(), getFaturamentoTotal(), getImposto());
	}
	
	
	@Override
	public void calculaImposto() {
		// TODO Auto-generated method stub
		this.setFaturamentoTotal();
		
		
		if (this.getFaturamentoTotal() >= 0 && this.getFaturamentoTotal() <= 180000.00f) {
			this.setImposto(this.getFaturamentoTotal() * 0.045f);
		}
		
		else if (this.getFaturamentoTotal() > 180000.00f && this.getFaturamentoTotal() <= 360000.00f) {
			this.setImposto(this.getFaturamentoTotal() * 0.078f - 5940.00f);
		}
		
		else if (this.getFaturamentoTotal() > 360000.00f && this.getFaturamentoTotal() <= 720000.00f) {
			this.setImposto(this.getFaturamentoTotal() * 0.010f - 13860.00f);
		}
		
		else if (this.getFaturamentoTotal() > 720000.00f && this.getFaturamentoTotal() <= 1800000.00f) {
			this.setImposto(this.getFaturamentoTotal() * 0.112f - 22500.00f);
		}
		
		else if (this.getFaturamentoTotal() > 1800000.00f && this.getFaturamentoTotal() <= 3600000.00f) {
			this.setImposto(this.getFaturamentoTotal() * 0.147f - 85500.00f);
		}
		
		else if (this.getFaturamentoTotal() > 3600000.00f && this.getFaturamentoTotal() <= 4800000.00f) {
			this.setImposto(this.getFaturamentoTotal() * 0.3f - 720000.00f);
		}
		
		else {
			System.out.println("Seu perfil não se enquadra aos anexos do Simples Nacional");
		}
		
	}
}