import java.util.Random;
import java.util.Scanner;

class MenuClases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al menú de tus clases 2023-2024 primer semestre");
        imprimeLinea("");
        ;
        System.out.println("Escoge que clase deseas estudiar");
        System.out.println("1: Programación, 2:Matemática, 3:TEO, 4:IGPS, 5:Fisica");
        imprimeLinea("");
        int deseoEstudioUsuario = scanner.nextInt();
        if (deseoEstudioUsuario == 1) {
            System.out.println("Ok, estudiemos programación");
            imprimeLinea("");
            System.out.println("1: Si deseas escoger un reto, 2: Si deseas que el reto sea aleatorio");
            int escogeoAleatorio = scanner.nextInt();
            String seleccionUsuarioEscogeoAleatorio;
            seleccionUsuarioEscogeoAleatorio = (escogeoAleatorio == 1) ? "Tu escoges el reto" : "Te daremos un reto aleatorio";
            System.out.println(seleccionUsuarioEscogeoAleatorio);
            imprimeLinea("");
            if (escogeoAleatorio == 1){
            deseaBuenaSuerte("");
            dibujarTrebol();
            } else {
                listaRetosProgra();
                imprimeLinea("");
                dibujaCalaveraAscii();
            }
            

        } else if (deseoEstudioUsuario == 2) {
            System.out.println("Ok, estudiemos matemáticas");
            imprimeLinea("");
            System.out.println("1: Si deseas escoger un reto, 2: Si deseas que el reto sea aleatorio");
            int escogeoAleatorio = scanner.nextInt();
            String seleccionUsuarioEscogeoAleatorio;
            seleccionUsuarioEscogeoAleatorio = (escogeoAleatorio == 1) ? "Tu escoges el reto" : "Te daremos un reto aleatorio";
            System.out.println(seleccionUsuarioEscogeoAleatorio);
            imprimeLinea("");
            if (escogeoAleatorio == 1){
                deseaBuenaSuerte("");
                dibujarTrebol();

            } else {
                listaRetosMate();
                imprimeLinea("");
                dibujaCalaveraAscii();
            }

        } else if (deseoEstudioUsuario == 3) {
            System.out.println("Ok, estudiemos TEO");
            imprimeLinea("");
            System.out.println("1: Si deseas escoger un reto, 2: Si deseas que el reto sea aleatorio");
            int escogeoAleatorio = scanner.nextInt();
            String seleccionUsuarioEscogeoAleatorio;
            seleccionUsuarioEscogeoAleatorio = (escogeoAleatorio == 1) ? "Tu escoges el reto" : "Te daremos un reto aleatorio";
            System.out.println(seleccionUsuarioEscogeoAleatorio);
            imprimeLinea("");
            if (escogeoAleatorio == 1){
                deseaBuenaSuerte("");
                dibujarTrebol();

            } else {
                listaRetosTEO();
                imprimeLinea("");
                dibujaCalaveraAscii();
            }

        } else if (deseoEstudioUsuario == 4) {
            System.out.println("Ok, estudiemos IGPS");
            imprimeLinea("");
            System.out.println("1: Si deseas escoger un reto, 2: Si deseas que el reto sea aleatorio");
            int escogeoAleatorio = scanner.nextInt();
            String seleccionUsuarioEscogeoAleatorio;
            seleccionUsuarioEscogeoAleatorio = (escogeoAleatorio == 1) ? "Tu escoges el reto" : "Te daremos un reto aleatorio";
            System.out.println(seleccionUsuarioEscogeoAleatorio);
            imprimeLinea("");
            if (escogeoAleatorio == 1){
                deseaBuenaSuerte("");
                dibujarTrebol();

            } else {
                listaRetosIGPS();
                imprimeLinea("");
                dibujaCalaveraAscii();
            }

        } else if (deseoEstudioUsuario == 5) {
            System.out.println("Ok, estudiemos fisica");
            imprimeLinea("");
            System.out.println("1: Si deseas escoger un reto, 2: Si deseas que el reto sea aleatorio");
            int escogeoAleatorio = scanner.nextInt();
            String seleccionUsuarioEscogeoAleatorio;
            seleccionUsuarioEscogeoAleatorio = (escogeoAleatorio == 1) ? "Tu escoges el reto" : "Te daremos un reto aleatorio";
            System.out.println(seleccionUsuarioEscogeoAleatorio);
            imprimeLinea("");
            if (escogeoAleatorio == 1){
                deseaBuenaSuerte("");
                dibujarTrebol();

            } else {
            listaRetosFisica();
            dibujaCalaveraAscii();
            }

        } else {
            System.out.println("¿ACASO NO SABES LEER QUE SOLO HABIA OPCIONES DEL 1 AL 5?");
            dibujarTQM();
        }

    }

    static void listaRetosProgra() {
        Random random = new Random();
        String[] retosProgra = {
            "ForIf",
                "Guerrero vs Vampiro",
                "Carrefour",
                "Escalas y acordes",
                "Aspiradora",
                "Sudoku",
                "Totito",
                "PacMan"
            };
        int indiceAleatorio = random.nextInt(retosProgra.length);
        String retoAleatorio = retosProgra[indiceAleatorio];
        
        System.out.println("Resuelve el reto: " + retoAleatorio);
    }

    static void listaRetosMate() {
        Random random = new Random();
        String[] retosMate = {
            "Ejercicios de Examen Parcial 17-18",
            "Ejercicios de Examen",
            "EJERCICIOS EXAMEN FINAL 17-18",
                "Ejercicios Examen Final 19-20",
                "Parciales 20-21",
                "Primer Parcial 19-20",
                "REC_EPM 21-22 ADE y CTA",
                "REC_EPM 21-22 IOI II y IIAA",
                "Segundo Parcial 19-20",
                "Tercer Parcial 19-20"
            };
            int[] numerosPagina = new int[44];
        for (int pagina1 = 0; pagina1 < numerosPagina.length; pagina1++) {
            numerosPagina[pagina1] = pagina1 ++;
        }
        int indiceAleatorio = random.nextInt(retosMate.length);
        int numeroPaginaAleatorio = random.nextInt(numerosPagina.length);
        String retoAleatorio = retosMate[indiceAleatorio];
        
        System.out.println("Resuelve la pagina: " + numeroPaginaAleatorio + " del examen: " + retoAleatorio);
    }

    static void listaRetosTEO(){
        Random random = new Random();
        String[] primeraOpcionConvertir = {
            "Decimal",
            "Binario",
            "Octal",
            "Hexadecimal",
            "Complemento 1",
            "Complemento 2",
            "BCD"
        };
        String[] segundaOpcionConvertir = {
            "Decimal",
            "Binario",
            "Octal",
            "Hexadecimal",
            "Complemento 1",
            "Complemento 2",
            "BCD"
        };
        String[] ejercicios6y7={
            "Ejercicios del tema 6",
            "Ejercicios del tema 7"
        };
        int[] diapositivasTemas6y7 = new int[8];
        for (int diapositiva1 = 0; diapositiva1 < diapositivasTemas6y7.length; diapositiva1++){
            diapositivasTemas6y7[diapositiva1] = diapositiva1++;
        }
        int escogerTema = random.nextInt(ejercicios6y7.length);
        int escogerQueDiapositivaDelTema6o7 = random.nextInt(diapositivasTemas6y7.length);
        String presentacion = ejercicios6y7[escogerTema];
        int diapositiva = diapositivasTemas6y7[escogerQueDiapositivaDelTema6o7];

        int[] numerosAleatorioTeo = new int[999999];
        for (int numero1 = 0; numero1 < numerosAleatorioTeo.length; numero1++) {
            numerosAleatorioTeo[numero1] = numero1 ++;
        }
        int primerConvertir = random.nextInt(primeraOpcionConvertir.length);
        int segundoConvertir = random.nextInt(segundaOpcionConvertir.length);
        int numeroAleatorioEscogido = random.nextInt(numerosAleatorioTeo.length);
        String primerCifraaConvertir = primeraOpcionConvertir[primerConvertir];
        String segundaCifraaConvertir = segundaOpcionConvertir[segundoConvertir];

        System.out.println("El numero en decimal es: " + numeroAleatorioEscogido + " conviertelo a: " + primerCifraaConvertir + " y pasalo a: " + segundaCifraaConvertir);
        System.out.println("Realiza tambien los: " + presentacion + " de la diapositiva: " + diapositiva);
    }
    
    private static void listaRetosIGPS() {
        Random random = new Random();
        String[] presentacionesIGPS = {
            "00 - IGPS Introducción",
            "01 - IGPS Software e Ingeniería(1)",
            "02 - IGPS Software e Ingeniería (2)",
            "03 - IGPS Proceso del Software (1)",
            "04 - IGPS Proceso del Software (2)",
            "05 - IGPS GIT (1)",
            "06 - IGPS GIT (2)",
            "07 - IGPS SCRUM",
            "08 - IGPS Innovación",
            "09 - IGPS Priorizacion",
            "Git Cheat Sheet",
            "Plantilla Diagramas de Gantt"
        };
        int aleatorioIGPS = random.nextInt(presentacionesIGPS.length);
        String presentacionAleatorio = presentacionesIGPS[aleatorioIGPS];
        System.out.println("Estudia la presentación: " + presentacionAleatorio);
    }

    private static void listaRetosFisica() {
        Random random = new Random();
        String[] presentacionesFisica = {
            "0_Presentacion_Fisica",
            "T1_Mecanica_Introduccion",
            "T2_Mecanica_cinematica",
            "T3_Mecanica_Dinamica",
            "T4_Mecanica_leyes_conservacion",
            "T5_1_La atmosfera",
            "T5_Mecanica_Ondas",
            "T6.Fluidos2.0",
            "T7_Mecánica_Ensayo Final",
            "T8.1_Electrostatica",
            "T8.2_Electromagnetismo",
            "T9_Repaso",
            "T10_Termodinamica",
            "T11_Optica",
            "T12_Fisica moderna",
            "T13_Repaso",
            "Examen_Parcial_1_A_sol",
            "Examen_Parcial_2_A_sol",
            "Examen_Parcial_2_B_sol",
            "Examen_Parcial_2_C_SOL"
        };
        int aleatorioFisica = random.nextInt(presentacionesFisica.length);
        String presentacionAleatorio = presentacionesFisica[aleatorioFisica];
        System.out.println("Estudia: " + presentacionAleatorio);
    }

    static void dibujaCalaveraAscii() {
        System.out.println("     .-.                     .-.");
        System.out.println("  .--' /                     \\ '--.");
        System.out.println(" '--. \\       _______       / .--'");
        System.out.println("     \\ \\   .-\"       \"-.   / /");
        System.out.println("      \\ \\ /             \\ / /");
        System.out.println("       \\ /               \\ /");
        System.out.println("        \\|   .--. .--.   |/ ");
        System.out.println("         | )/   | |   \\( |");
        System.out.println("         |/ \\__/   \\__/ \\|");
        System.out.println("         /      /^\\      \\");
        System.out.println("         \\__    '='    __/");
        System.out.println("           |\\         /|");
        System.out.println("           |           |");
        System.out.println("            `-._____.-'");
        System.out.println("           / /       \\ \\");
        System.out.println("          / /         \\ \\");
        System.out.println("         / /           \\ \\");
        System.out.println("        / /             \\ \\");
        System.out.println("     ,-' (               ) `-,");
        System.out.println("     `-'._)             (_.'-`");
    }
    static void dibujarTQM() {
        System.out.println(
            "    _______  ___  _ _  _ ___ ___  ___\n" +
            "   /_  _| _ /   \\| | || |  _|   \\/   \\\n" +
            "    | ||  _   |  | | || |  _| ' /  |\n" + 
            "    |_||___ \\__\\/\\___/|_|___|_|_\\____/"
        );
    }

    static void dibujarTrebol(){
        System.out.println(
            "                                                  \r\n" + //
                    "                        *%#####%*                 \r\n" + //
                    "             ****      #(###########%,            \r\n" + //
                    "          **/******   ((((((###########.          \r\n" + //
                    "       /**////*/*///  /((((((((#((######          \r\n" + //
                    "      ////*/////////* //((((((((((((((##          \r\n" + //
                    "     **/////////((((( (/(((((((/((((/(/           \r\n" + //
                    "     .*/*/////(/(((((( ((##((((((/(/              \r\n" + //
                    "       **/////////((//( #####%..%########(        \r\n" + //
                    "                   (((/ ##(((((#(######(###(      \r\n" + //
                    "           *//(//((/((( ((((((#####((((((((#/     \r\n" + //
                    "        */*//////(/(/(( ((((((((((((((((((((#     \r\n" + //
                    "      .*/**//////(//(// ((((//(((#((((((((((      \r\n" + //
                    "       *///////((////// (((//*/(((((((((((        \r\n" + //
                    "        //*////*/////// /(///////(((((            \r\n" + //
                    "          **//*////***  .///////((/(              \r\n" + //
                    "             */******    /                        \r\n" + //
                    "                         /                        "
        );
    }

    static void deseaBuenaSuerte(String SUERTE){
        System.out.println("Buena suerte, la necesitarás");
    }

    
    static void imprimeLinea(String LINEA) {
        System.out.println("----------------------------------------------");
    }
}