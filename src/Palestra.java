enum Luz{
    VERDE,AMBAR,VERMELHO
}


class Palestra {
    private Luz s;

    Palestra(Luz s){
        this.s=s;
    }

    public void acessa(){
        switch (s){
            case VERDE:
            System.out.println("\nEstado atual da Palestra: " + Luz.VERDE);
            System.out.println();
            break;
        
        
            case AMBAR:
            System.out.println("\nEstado atual da Palestra: " + Luz.AMBAR);
            System.out.println();
            break;

            case VERMELHO:
            System.out.println("\nEstado atual da Palestra: " + Luz.VERMELHO);
            System.out.println();
            break;

    }
}
}