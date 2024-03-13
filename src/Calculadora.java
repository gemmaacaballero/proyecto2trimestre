
    public class Calculadora {

    // en esta clase realizamos las clases par ala realizacipon de lo scalculos necesarios para que funcionara la calculadora

        public double sumar(double num1, double num2) {
            return num1 + num2;
        }

        public double restar(double num1, double num2) {
            return num1 - num2;
        }

        public double multiplicar(double num1, double num2) {
            return num1 * num2;
        }

        public double dividir(double num1, double num2) {
            if (num2 == 0) {
                return 0;
            }
            return num1 / num2;
        }
    }

