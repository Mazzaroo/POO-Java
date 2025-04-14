public class Main{
    public static void main(String[] args) {
        Horario horario1 = new Horario(13, 45, 21);
        horario1.exibirHorario();
        horario1.calcularSegundos();

        Horario horario2 = new Horario(32, 200, 170);
        horario2.exibirHorario();
        horario2.calcularSegundos();

        Horario horarioSemParametro = new Horario();
        horarioSemParametro.exibirHorario();
        horarioSemParametro.calcularSegundos();
    }
    }
