package funcionario;

import java.time.LocalDate;

import pessoa.Endereco;
import pessoa.fisica.Genero;

public class Medico extends Funcionario{
		
		private String crm;

		public Medico(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento,
				Genero genero, String cpf, String rg, String matricula, Setor setor, double salario, String crm) {
			super(nome, telefone, email, endereco, dataNascimento, genero, cpf, rg, matricula, setor, salario);
			this.crm = crm;
		}

		public String getCrm() {
			return crm;
		}

		public void setCrm(String crm) {
			this.crm = crm;
		}

		@Override
		public String toString() {
			return "Medico " +
					super.toString()
					+ "\n crm: " + crm ;
				
		}
		
		

}
