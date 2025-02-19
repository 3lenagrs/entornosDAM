import java.util.Arrays;
import java.util.List;

public class EjercicioArrays {

    public static void main(String[] args) {
        int numAlumnos = 40;
        Integer[] control = generarNotasAleatorias(numAlumnos);
        
        int minNota = encontrarMinimaNota(control);
        int maxNota = encontrarMaximaNota(control);
        
        int[] listaClase = generarListaClase(numAlumnos);
        
        List<Integer> notas = Arrays.asList(control);
        int indMinNota = notas.indexOf(minNota) + 1;
        int indMaxNota = notas.indexOf(maxNota) + 1;

        Resultados(minNota, maxNota, indMinNota, indMaxNota, listaClase, notas);

        int[] practicas = generarNotasAleatoriasPracticas(numAlumnos);
        float[] calificaciones = calcularCalificaciones(control, practicas);

        imprimirPracticasCalificaciones(practicas, calificaciones);

        float[] estadistica = calcularEstadisticas(calificaciones, numAlumnos);
        imprimirEstadisticas(estadistica);

        int[] aprobados = new int[numAlumnos];
        int[] suspensos = new int[numAlumnos];
        contarAprobadosSuspensos(calificaciones, aprobados, suspensos);

        imprimirAprobadosSuspensos(aprobados, suspensos);

        double[] calif = insertarNuevaNota();
    }

    private static Integer[] generarNotasAleatorias(int numAlumnos) {
        Integer[] control = new Integer[numAlumnos];
        for (int i = 0; i < control.length; i++) {
            control[i] = (int) (Math.random() * 11);
        }
        return control;
    }

    private static int encontrarMinimaNota(Integer[] control) {
        int minNota = 11;
        for (int nota : control) {
            if (nota < minNota) {
                minNota = nota;
            }
        }
        return minNota;
    }

    private static int encontrarMaximaNota(Integer[] control) {
        int maxNota = 0;
        for (int nota : control) {
            if (nota > maxNota) {
                maxNota = nota;
            }
        }
        return maxNota;
    }

    private static int[] generarListaClase(int numAlumnos) {
        int[] listaClase = new int[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            listaClase[i] = i + 1;
        }
        return listaClase;
    }

    private static void Resultados(int minNota, int maxNota, int indMinNota, int indMaxNota, int[] listaClase, List<Integer> notas) {
        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + indMinNota);
        System.out.println("Indice del máximo es : " + indMaxNota);
        System.out.println("Lista de clase :" + Arrays.toString(listaClase));
        System.out.println("Array de Notas :" + notas);
    }

    private static int[] generarNotasAleatoriasPracticas(int numAlumnos) {
        int[] practicas = new int[numAlumnos];
        for (int i = 0; i < practicas.length; i++) {
            practicas[i] = (int) (Math.random() * 11);
        }
        return practicas;
    }

    private static float[] calcularCalificaciones(Integer[] control, int[] practicas) {
        float[] calificaciones = new float[control.length];
        for (int i = 0; i < control.length; i++) {
            calificaciones[i] = ((float) control[i] + (float) practicas[i]) / 2;
        }
        return calificaciones;
    }

    private static void imprimirPracticasCalificaciones(int[] practicas, float[] calificaciones) {
        System.out.println("Prácticas      :" + Arrays.toString(practicas));
        System.out.println("Calificaciones :" + Arrays.toString(calificaciones));
    }

    private static float[] calcularEstadisticas(float[] calificaciones, int numAlumnos) {
        float[] estadistica = new float[10];
        for (int i = 0; i < 10; i++) {
            float count = 0;
            for (float calificacion : calificaciones) {
                if ((i < calificacion) && ((i + 1) >= calificacion)) {
                    count += 1;
                }
            }
            estadistica[i] = (count / numAlumnos) * 100;
        }
        return estadistica;
    }

    private static void imprimirEstadisticas(float[] estadistica) {
        for (int i = 0; i < estadistica.length; i++) {
            System.out.printf("Estadística nota tramo <= %d = %.2f%%\n", (i + 1), estadistica[i]);
        }
    }

    private static void contarAprobadosSuspensos(float[] calificaciones, int[] aprobados, int[] suspensos) {
        int countAprobados = 0;
        int countSuspensos = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= 5) {
                aprobados[countAprobados++] = i++;
            } else {
                suspensos[countSuspensos++] = i++;
            }
        }
    }

    private static void imprimirAprobadosSuspensos(int[] aprobados, int[] suspensos) {
        System.out.println("Relación de aprobados por nº de lista: " + Arrays.toString(aprobados));
        System.out.println("Relación de suspensos por nº de lista: " + Arrays.toString(suspensos));
    }

    private static double[] insertarNuevaNota() {
        double[] calif = new double[40];
        for (int j = 0; j < 31; j++) {
            calif[j] = (int) (Math.random() * 11);
        }
        System.out.println("Nota antigua alumno nº4: " + calif[3]);
        calif[3] = 6;
        System.out.println("Nota nueva   alumno nº4: " + calif[3]);
        return calif;
    }
}