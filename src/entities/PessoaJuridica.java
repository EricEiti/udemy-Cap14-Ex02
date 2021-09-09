package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer funcionarios;

	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, double income, Integer funcionarios) {
		super(name, income);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		if (funcionarios > 10) {
			return getIncome() * 14/100;
		}
		else {
			return getIncome() * 16/100;
		}
	}
}
