package entities;

public class PessoaFisica extends Pessoa{
	
	private double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, double income, double gastosSaude) {
		super(name, income);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		if (getIncome() < 20000.00) {
			return (getIncome() * 15 / 100) - (gastosSaude * 50/ 100);
		}
		else {
			return (getIncome() * 25/ 100) - (gastosSaude * 50/ 100);
		}
	}
}
