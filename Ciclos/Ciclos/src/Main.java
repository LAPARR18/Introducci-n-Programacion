public class Main {
    public static void main(String[] args) {
        int numeroIf=0;
        int numeroWhile=0;
        int numeroDoWhile=0;
        int numeroFor=0;
        String estacion="invierno";

        //IF
        if (numeroIf>0){
            System.out.println("El número es positivo");
        }
        else if (numeroIf==0) {
            System.out.println("El número es cero");
        }
        else{
            System.out.println("El número es negativo");
        }

        //WHILE
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("While es:"+numeroWhile);
        }

        // Do While
        // Para que se ejecute una sola vez la condición se debe cumplir
        do {
            numeroDoWhile++;
            System.out.println("DoWhile es:"+ numeroDoWhile);
        }while (numeroDoWhile<-100);

        //FOR
        for (;numeroFor<=3;){
            System.out.println("For es:"+ numeroFor);
            numeroFor++;
        }

        //CASE
        switch (estacion){
            case "primavera":
                System.out.println("Es verano");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es verano");
                break;
        }
    }
}