package ControleLuz;

public class ControleLuz {
    public static void main(String[] args) {
        
        Lampada[] lampadas = new Lampada[3];
        Interruptor[] interruptores = new Interruptor[3];

        for (int i = 0; i < 3; i++) {
            lampadas[i] = new Lampada(i + 1);
            interruptores[i] = new Interruptor(i + 1, lampadas[i]);
        }

        
        System.out.println("Ligando o Interruptor 1 por 10 minutos...");
        interruptores[0].ligar();

        System.out.println("Desligando o Interruptor 1 e ligando o Interruptor 2...");
        interruptores[0].desligar();
        interruptores[1].ligar();

        
        System.out.println("Visitando as lâmpadas...");
        for (Lampada lampada : lampadas) {
            lampada.verificarEstado();
        }

        
        System.out.println("\nResultados:");
        for (Interruptor interruptor : interruptores) {
            System.out.println("Interruptor " + interruptor.getId() + " controla a lâmpada " + interruptor.getLampada().getId());
        }
    }
}

class Lampada {
    private int id;
    private boolean ligada;
    private boolean quente;

    public Lampada(int id) {
        this.id = id;
        this.ligada = false;
        this.quente = false;
    }

    public int getId() {
        return id;
    }

    public void ligar() {
        ligada = true;
        quente = true; 
    }

    public void desligar() {
        ligada = false;
        quente = false; 
    }

    public void verificarEstado() {
        if (ligada) {
            System.out.println("Lâmpada " + id + " está ACESA.");
        } else if (quente) {
            System.out.println("Lâmpada " + id + " está DESLIGADA e QUENTE.");
        } else {
            System.out.println("Lâmpada " + id + " está DESLIGADA e FRIA.");
        }
    }
}

class Interruptor {
    private int id;
    private Lampada lampada;

    public Interruptor(int id, Lampada lampada) {
        this.id = id;
        this.lampada = lampada;
    }

    public int getId() {
        return id;
    }

    public Lampada getLampada() {
        return lampada;
    }

    public void ligar() {
        lampada.ligar();
    }

    public void desligar() {
        lampada.desligar();
}
}