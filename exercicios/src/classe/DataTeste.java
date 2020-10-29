package classe;
//26.10.2020
public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data();
		
		d1.dia = 21;
		d1.mes = "Novembro";
		d1.ano = 2017;
		
		System.out.printf("A primeira data é o aniversário de Diana: %d de %s de "
				+ "%d.\n", d1.dia, d1.mes, d1.ano);
		System.out.println(d1.obterData());
		
		Data d2 = new Data();
		
		d2.dia = 28;
		d2.mes = "Janeiro";
		d2.ano = 1981;
		
		System.out.printf("\nA segunda data é o aniversário do pai de Diana, Jovane: %d de %s de "
				+ "%d.\n", d2.dia, d2.mes, d2.ano);
		System.out.println(d2.obterData());
		
		Data d3 = new Data();
		System.out.println(d3.obterData());
		Data d4 = new Data (8, "Fevereiro", 1947);
		System.out.println(d4.obterData());
	}
}
