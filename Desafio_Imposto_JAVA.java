import java.util.Scanner;

public class Desafio_Imposto_JAVA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Renda anual com salario: ");
		double salario = sc.nextDouble();
		System.out.print("Renda anual com prestacao de servico: ");
		double prestacao_de_servico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double ganho_de_capital = sc.nextDouble();
		System.out.print("Gastos medicos: ");
		double gastos_medicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double gastos_educacionais = sc.nextDouble();
		System.out.println();

		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();

		System.out.println("CONSOLIDADO DE RENDA: ");
		double imposto_sobre_salario;

		if (salario <= 3000) {
			imposto_sobre_salario = 0.00;
		} else if ((salario / 12 > 3000) && (salario / 12 <= 5000)) {
			imposto_sobre_salario = salario * 0.1;
		} else {
			imposto_sobre_salario = salario * 0.2;
		}

		System.out.println("Imposto sobre salário: " + String.format("%.2f", imposto_sobre_salario));

		double imposto_sobre_servicos = prestacao_de_servico * 0.15;
		System.out.println("Imposto sobre serviços: " + String.format("%.2f", imposto_sobre_servicos));

		double imposto_sobre_ganho_capital = ganho_de_capital * 0.20;
		System.out.println("Imposto sobre ganho de capital: " + String.format("%.2f", imposto_sobre_ganho_capital));
		System.out.println();

		double imposto_bruto_total = imposto_sobre_salario + imposto_sobre_servicos + imposto_sobre_ganho_capital;

		System.out.println("DEDUÇÕES: ");
		double maximo_dedutivel = imposto_bruto_total * 0.3;
		System.out.println("Máximo dedutível: " + String.format("%.2f", maximo_dedutivel));

		double gastos_dedutiveis = gastos_medicos + gastos_educacionais;
		System.out.println("Gastos dedutíveis: " + String.format("%.2f", gastos_dedutiveis));
		System.out.println();

		System.out.println("RESUMO: ");
		System.out.println("Imposto bruto total: " + String.format("%.2f", imposto_bruto_total));
		double abatimento;
		if (gastos_dedutiveis >= maximo_dedutivel) {
			abatimento = maximo_dedutivel;
		} else {
			abatimento = gastos_dedutiveis;
		}
		System.out.println("Abatimento: " + String.format("%.2f", abatimento));

		double imposto_devido = imposto_bruto_total - abatimento;
		System.out.println("Imposto devido: " + String.format("%.2f", imposto_devido));

		sc.close();

	}

}
