#include <iostream>
using namespace std;

int main(){
	// Parte 1
	int numeroIf = 3;
	if (numeroIf > 0){
		cout << "es positivo" << endl;
	}
	else if (numeroIf < 0){
		cout << "es negativo" << endl;
	}
	else{
		cout << "es 0" << endl;
	}
	
	// Parte 2
	int numeroWhile = -3;
	while (numeroWhile < 3){
		numeroWhile ++;
		cout << numeroWhile << endl;
	}

	// Parte 2.1
	do{
		numeroWhile ++;
		cout << numeroWhile << endl;
	} while (numeroWhile < 3);

	// Parte 3
	int numeroFor = 0;
	for (int i = 1; numeroFor <= 3; i++){
		numeroFor++;
		cout << numeroFor << endl;
	}

	// Parte 4
	int estacion = 2;
	switch(estacion){
		case 1: cout << "es primavera" << endl;
		break;
		case 2: cout << "es verano" << endl;
		break;
		case 3: cout << "es otoño" << endl;
		break;
		case 4: cout << "es invierno" << endl;
		break;
		default: cout << "inválido" << endl;
		break;
	}
}
