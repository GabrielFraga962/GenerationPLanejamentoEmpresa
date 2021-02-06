package empresa;

public class EmpresaTest extends Empresa{
	
	
	public void run() {
		this.digitaFaturamento();
		this.calculaImposto();
		SaidaUsuario.relatorio(getFaturamento(), getFaturamentoTotal(), getImposto());
		
		
	}

	@Override
	public void calculaImposto() {
		// TODO Auto-generated method stub
		this.setFaturamentoTotal();
		
		
		if (this.getFaturamentoTotal() <= 180000f) {
			this.setImposto(this.getFaturamentoTotal() * 0.3f - 100f);
		}
		
		
	}
	
}
