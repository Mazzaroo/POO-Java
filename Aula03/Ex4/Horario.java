public class Horario{
    private int hora;
    private int minuto;
    private int segundo;

    public Horario (){}

    public Horario(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("HORA INVALIDA || SETADO PARA A HORA PADRAO ");
            this.hora = 0;
        }
    }


    public void setMinuto(int minuto){
            if (minuto >= 0 && minuto < 60) {
                this.minuto = minuto;
            } else {
                System.out.println("MINUTO INVALIDO || SETADO PARA O MINUTO PADRAO ");
                this.minuto = 0;
            }
        }

    public void setSegundo(int segundo){
            if (segundo >= 0 && segundo < 60) {
                this.segundo = segundo;
            } else {
                System.out.println("SEGUNDO INVALIDO || SETADO PARA O SEGUNDO PADRAO ");
                this.segundo = 0;
            }
        }


    public void exibirHorario(){
        System.out.println("HORA: " + hora + " MINUTO: " + minuto + " SEGUNDO: " + segundo);
    }

    public int calcularSegundos(){
        int horarioEmSegundos = hora * 3600;
        horarioEmSegundos += minuto * 60;
        horarioEmSegundos += segundo;

        return horarioEmSegundos;
    }
}