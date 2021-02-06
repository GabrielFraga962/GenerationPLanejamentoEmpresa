package empresa;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public abstract class Empresa {
	//dados gerais da empresa 
	private String nomeEmpresa;
	private String cnpj;
	//dados sobre faturamento
	private List<Float> faturamento;
	private float faturamentoTotal;
	private float imposto;

	//construtor 
	public Empresa() {
		this.faturamento = new ArrayList<>();
	}
	
	public Empresa(String nomeEmpresa, String cnpj) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.faturamento = new ArrayList<>();
		
	}
	
	public void setFaturamentoTotal() {
		this.faturamentoTotal= this.faturamento
								.stream()
								.reduce(0f, (subtotal, element)-> subtotal + element);
	}
	
	public abstract void calculaImposto();
		
	

	
	
	public void digitaFaturamento() {
		float valor;
		for (int i = 1; i <= 12; i++) {
			System.out.print("\nDigite o valor do mês "+i+": ");
			try {
				valor = EntradaUsuario.getFloat();
				this.faturamento.add(valor);
			}catch(InputMismatchException ie) {
				System.out.println("Erro: "+ie);
				i--; //faço ele voltar a digitar esse valor 
			}
			catch(NumberFormatException ne) {
				System.out.println("Erro: "+ne);
				i--; //faço ele voltar a digitar esse valor 
			}

		}
		System.out.println();
		//já calcula o faturamento total 
		this.setFaturamentoTotal();
	}
	
	public abstract void run();
	
	
	//get and set 
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public List<Float> getFaturamento() {
		return faturamento;
	}


	public void setFaturamento(List<Float> faturamento) {
		this.faturamento = faturamento;
	}


	public float getFaturamentoTotal() {
		return faturamentoTotal;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	
	
	
	

	
}
