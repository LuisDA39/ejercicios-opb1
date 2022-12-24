#include <iostream>
using namespace std;

void suma(int a, int b, int c);

class coche {
public:
  int puertas = 4;
  int maspuertas() { return puertas + 1; }
};
	
int main() {
  suma(3, 2, 1);
  coche micoche;
  cout << "\n"<< micoche.maspuertas();
}

void suma(int a, int b, int c){
	cout <<  a + b + c;
}
