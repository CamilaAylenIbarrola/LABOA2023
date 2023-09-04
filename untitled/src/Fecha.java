public class Fecha {
    private Dia nDia;
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        dia = 20;
        mes = 03;
        año = 2023;
    }

    public Fecha(Dia nDia, int dia, int mes, int año) {
        this.nDia = nDia;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }


    public void setnDia(Dia ndia) {
        this.nDia = ndia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getnDia() {
        return nDia.getNombreDia();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void valida() {
        if (this.dia < 32 && this.mes < 13 && this.año > 0) {
            if ((nDia.equals("lunes") || nDia.equals("martes") || nDia.equals("miercoles") || nDia.equals("jueves") || nDia.equals("viernes") || nDia.equals("sabado") || nDia.equals("domingo")) && (mes == 4 || mes == 6 || mes == 9 || mes == 11) && this.dia >= 31) {
                this.dia = 1;
                this.mes = 1;
                this.año = 1900;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && this.dia > 31) {
                this.dia = 1;
                this.mes = 1;
                this.año = 1900;
            } else if (mes == 2 && this.dia > 28) {
                this.dia = 1;
                this.mes = 1;
                this.año = 1900;
            }
        } else {
            this.dia = 1;
            this.mes = 1;
            this.año = 1900;
        }
    }

    public int diasMes(int mes) {
        int cantDias = 0;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            cantDias = 30;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            cantDias = 31;
        } else {
            cantDias = 28;
        }
        return cantDias;
    }

    public String corta() {
        String fechaCorta = this.dia + "-" + this.mes + "-" + this.año;
        return fechaCorta;
    }

    public String larga() {
        String fechaLarga = this.nDia + " " + this.dia + " " + "de " + this.mes + " " + "de " + this.año;
        return fechaLarga;
    }

    public void siguiente() {
        switch (this.nDia) {
            case LUNES:
                this.nDia = Dia.MARTES;
                break;
            case MARTES:
                this.nDia = Dia.MIERCOLES;
                break;
            case MIERCOLES:
                this.nDia = Dia.JUEVES;
                break;
            case JUEVES:
                this.nDia = Dia.VIERNES;
                break;
            case VIERNES:
                this.nDia = Dia.SABADO;
                break;
            case SABADO:
                this.nDia = Dia.DOMINGO;
                break;
            default:
                this.nDia = Dia.LUNES;
        }
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && this.dia == 30) {
            this.dia = 1;
            this.mes++;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && this.dia == 31) {
            this.dia = 1;
            if (mes != 12) {
                this.mes++;
            } else {
                this.mes = 1;
                this.año++;
            }
        } else if (mes == 2 && dia == 28) {
            this.dia = 1;
            this.mes = 3;
        } else {
            this.dia++;
        }
    }

    public void anterior() {
        switch (this.nDia) {
            case LUNES:
                this.nDia = Dia.DOMINGO;
                break;
            case MARTES:
                this.nDia = Dia.LUNES;
                break;
            case MIERCOLES:
                this.nDia = Dia.MARTES;
                break;
            case JUEVES:
                this.nDia = Dia.MIERCOLES;
                break;
            case VIERNES:
                this.nDia = Dia.JUEVES;
                break;
            case SABADO:
                this.nDia = Dia.VIERNES;
                break;
            default:
                this.nDia = Dia.SABADO;
        }
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 1) {
            this.dia = 31;
            this.mes--;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia == 1) {
            if (mes != 1 && mes != 8 && mes != 3) {
                this.dia = 30;
                this.mes--;
            } else if (mes == 8) {
                this.dia = 31;
                this.mes--;
            } else if (mes == 3) {
                this.dia = 28;
                this.mes--;
            } else {
                this.dia = 31;
                this.mes = 1;
                this.año--;
            }
        } else {
            this.dia--;
        }
    }

    public boolean igualQue(Fecha fecha) {
        valida();
        boolean esIgual = false;
        if (this.dia == fecha.dia && this.mes == fecha.mes && this.año == fecha.año) {
            esIgual = true;
        }
        return esIgual;
    }

    public boolean menorQue(Fecha fecha) {
        boolean esMenor = false;
        if (this.año > fecha.año) {
            esMenor= true;
        }else if(this.mes > fecha.mes){
            esMenor=true;
        }else if(this.dia > fecha.dia){
            esMenor=true;
        }
        return esMenor;
    }
    public boolean mayorQue(Fecha fecha) {
        boolean esMayor = false;
        if (this.año < fecha.año) {
            esMayor= true;
        }else if(this.mes < fecha.mes){
            esMayor=true;
        }else if(this.dia < fecha.dia){
            esMayor=true;
        }
        return esMayor;
    }
}

