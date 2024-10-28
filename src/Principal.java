import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        BusquedaApi service = new BusquedaApi();
        Scanner teclado = new Scanner(System.in);
        String mensajeValorSolicitado = "Ingrese el valor a Convertir = ";
        String textoDeBienvenida = """
                ***************************************
                Sea Bienvenido al Conversor de Monedas =
                
                1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real Brasileño
                4) Real Brasileño =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) Salir
                
                ****************************************
                Elija una Opción Válida :
                """;


        while (true) {
            System.out.println(textoDeBienvenida);
            int opcionElejida = teclado.nextInt();
            if (opcionElejida == 7) {
                System.out.println("Gracias por utilizar nuestros servicios ");
                break;}
            else {
                switch (opcionElejida) {

                    case 1: {
                        System.out.println(mensajeValorSolicitado);
                        double valorIngresado = teclado.nextDouble();
                        Moneda moneda = service.busquedaDeMoneda("USD","ARS",valorIngresado);
                        System.out.println("la conversión de = " + valorIngresado + " USD " + " es de = " + moneda.conversion_result() + " ARS\n");
                        break;
                    }

                    case 2: {
                        System.out.println(mensajeValorSolicitado);
                        double valorIngresado = teclado.nextDouble();
                        Moneda moneda = service.busquedaDeMoneda("ARS","USD",valorIngresado);
                        System.out.println("la conversión de = " + valorIngresado + " ARS " + " es de = " + moneda.conversion_result() + " USD \n");
                        break;
                    }

                    case 3: {
                        System.out.println(mensajeValorSolicitado);
                        double valorIngresado = teclado.nextDouble();
                        Moneda moneda = service.busquedaDeMoneda("USD","BRL",valorIngresado);
                        System.out.println("la conversión de = " + valorIngresado + " USD " + " es de = " + moneda.conversion_result() + " BRL \n");
                        break;
                    }

                    case 4: {
                        System.out.println(mensajeValorSolicitado);
                        double valorIngresado = teclado.nextDouble();
                        Moneda moneda = service.busquedaDeMoneda("BRL","USD",valorIngresado);
                        System.out.println("la conversión de = " + valorIngresado + " BRL " + " es de = " + moneda.conversion_result() +  " USD \n");
                        break;
                    }

                    case 5: {
                        System.out.println(mensajeValorSolicitado);
                        double valorIngresado = teclado.nextDouble();
                        Moneda moneda = service.busquedaDeMoneda("USD","COP",valorIngresado);
                        System.out.println("la conversión de = " + valorIngresado + " USD " + " es de = " + moneda.conversion_result() +  " COP \n");
                        break;
                    }

                    case 6: {
                        System.out.println(mensajeValorSolicitado);
                        double valorIngresado = teclado.nextDouble();
                        Moneda moneda = service.busquedaDeMoneda("COP","USD",valorIngresado);
                        System.out.println("la conversión de = " + valorIngresado + " COP " + " es de = " + moneda.conversion_result() + " USD \n");
                        break;
                    }

                }
            }
        }
    }
}



