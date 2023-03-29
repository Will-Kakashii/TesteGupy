import java.util.Scanner;
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class TesteCod {

	public static void main(String[] args) {

		// Exercicio 1 -----------------------------------------------------------------------------
		System.out.println("=============== Exercicio 1 ===============");
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		while(k < indice) {
			k = k +1;
			soma = soma +k;
			
		}
		
		
		System.out.println("Resultado do exercicio 1: "+soma);
		System.out.println();
		
		// Exercicio 2 -----------------------------------------------------------------------------
		System.out.println("=============== Exercicio 2 ===============");
		   Scanner input = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        
	        int num = input.nextInt();

	        int a = 0, b = 1, c;
	        while (b < num) {
	            c = a + b;
	            a = b;
	            b = c;
	        }

	        if (num == b) {
	            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
	            System.out.println();
	        } else {
	            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
	            System.out.println();
	        }
	        
	     // Exercicio 3 -----------------------------------------------------------------------------
			System.out.println("=============== Exercicio 3 ===============");
			// Vetor com os valores de faturamento diário
	        double[] faturamentoDiario = {1200.5, 1800.0, 500.75, 2300.25, 800.0, 0.0, 0.0, 1500.75, 1900.0, 1000.25, 2200.5, 1800.0, 600.25, 2500.75, 2000.0, 700.25, 1900.5, 2400.0, 1100.75, 2100.25, 1700.0, 800.75, 1500.5, 2200.0, 1300.25, 2000.5, 1600.0, 900.75, 1800.25, 2200.0, 1900.5, 1200.25};

	        // Calcula o menor e o maior valor de faturamento
	        double menorFaturamento = faturamentoDiario[0];
	        double maiorFaturamento = faturamentoDiario[0];
	        for (double faturamento : faturamentoDiario) {
	            if (faturamento < menorFaturamento) {
	                menorFaturamento = faturamento;
	            }
	            if (faturamento > maiorFaturamento) {
	                maiorFaturamento = faturamento;
	            }
	        }

	        // Calcula a média mensal de faturamento, ignorando dias sem faturamento
	        double somaFaturamento = 0.0;
	        int numDiasFaturamento = 0;
	        for (double faturamento : faturamentoDiario) {
	            if (faturamento > 0.0) {
	                somaFaturamento += faturamento;
	                numDiasFaturamento++;
	            }
	        }
	        double mediaMensal = somaFaturamento / numDiasFaturamento;

	        // Calcula o número de dias no mês em que o valor de faturamento diário foi superior à média mensal
	        int numDiasAcimaMedia = 0;
	        for (double faturamento : faturamentoDiario) {
	            if (faturamento > mediaMensal) {
	                numDiasAcimaMedia++;
	            }
	        }

	        // Exibe os resultados
	        System.out.println("Menor valor de faturamento: " + menorFaturamento);
	        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
	        System.out.println("Número de dias com faturamento acima da média mensal: " + numDiasAcimaMedia);
	        System.out.println();
	        
	     // Exercicio 4 -----------------------------------------------------------------------------
	        System.out.println("=============== Exercicio 4 ===============");
	        
	        // Valor do faturamento mensal de cada estado
	        Map<String, Double> faturamentoEstados = new HashMap<>();
	        faturamentoEstados.put("SP", 67836.43);
	        faturamentoEstados.put("RJ", 36678.66);
	        faturamentoEstados.put("MG", 29229.88);
	        faturamentoEstados.put("ES", 27165.48);
	        faturamentoEstados.put("Outros", 19849.53);

	        // Cálculo do total do faturamento mensal da distribuidora
	        double faturamentoTotal = 0;
	        for (double faturamento : faturamentoEstados.values()) {
	            faturamentoTotal += faturamento;
	        }

	        // Cálculo do percentual de representação de cada estado no faturamento mensal
	        NumberFormat percentFormat = NumberFormat.getPercentInstance();
	        Map<String, Double> percentualEstados = new HashMap<>();
	        for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
	            String estado = entry.getKey();
	            Double faturamento = entry.getValue();
	            Double percentual = faturamento / faturamentoTotal;
	            percentualEstados.put(estado, percentual);
	            System.out.println(estado + " - " + percentFormat.format(percentual));
	            
	        }
	        
	        System.out.println();
	        
	     // Exercicio 5 -----------------------------------------------------------------------------
	     	System.out.println("=============== Exercicio 5 ===============");
	     	Scanner sc = new Scanner(System.in);
	        System.out.println("Digite uma string para ser invertida: ");
	        String original = sc.nextLine();
	        sc.close();

	        String invertida = "";

	        for (int i = original.length() - 1; i >= 0; i--) {
	            invertida += original.charAt(i);
	        }

	        System.out.println("A string original é: " + original);
	        System.out.println("A string invertida é: " + invertida);
	}

}
