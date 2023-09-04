import java.util.HashSet;

public class AsistenciaEmpresa {
        private HashSet<Empleado> listaEmpleados;
        public AsistenciaEmpresa(HashSet<Empleado>listaEmpleados){
            this.listaEmpleados=listaEmpleados;
        }
        public HashSet<Empleado> getListaEmpleados() {
            return listaEmpleados;
        }
        public void setListaEmpleados(HashSet<Empleado> listaEmpleados) {
            this.listaEmpleados = listaEmpleados;
        }
        public int asistenciaMes(int mes){
            int cant=0;
            for(Empleado empleado:listaEmpleados){
                if(empleado.comprobarAsistencia(mes) > 80){
                    cant++;
                }
            }
            return cant;
        }
}

