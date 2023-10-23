package Ejercicio.src;

public class Circulo {
        private double radio;
        public Circulo(){
            radio=2;
        }
        public Circulo(double radio){
            this.radio=radio;
        }
        public void setradio(double radio){
            this.radio=radio;
        }
        public double getradio(){
            return radio;
        }
        public double area(){
            double a=(Math.PI *(this.radio*this.radio));
            return a;
        }
        public double perimetro(){
            double p= (2* Math.PI *this.radio);
            return p;
        }
    }
