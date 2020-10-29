package classe;
// 26.10.2020
public class Data {
	int dia;
	String mes;
	int ano;
	
	Data() {
		dia = 1;
		mes = "Janeiro";
		ano = 1970;
	}
	
	Data(int diaInicial, String mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	String obterData() {
		return String.format("A data é %d de %s de %d.", dia, mes, ano);
	}
}
