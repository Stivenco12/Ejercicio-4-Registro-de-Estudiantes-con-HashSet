package registro_de_estudiantes_con_hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nombres = new HashMap<>();
        try (Scanner sc = new Scanner(System.in)) {
            String menu = "1";
            do{
                
                System.out.println("Ingrese la cantidad de estudiantes que desea registrar");
                int cantidad = sc.nextInt();
                sc.nextLine();

                for(int i = 1; i <= cantidad; i++){
                    System.out.print("ingrese el nombre del estudiante = ");
                    String name = sc.nextLine();
                    System.out.print("ingrese la edad de el estudiante  = ");
                    int ed = sc.nextInt();
                    sc.nextLine();
                    nombres.put(name, ed);
                }
                

                System.out.println();
                System.out.print("Quieres buscar un nombre? \n1. si\n2. no \nElije =  ");
                int buscar = sc.nextInt();
                sc.nextLine();

                if (buscar == 1) {
                    System.out.print("ingrese el nombre del estudiante que buscas = ");
                    String names = sc.nextLine();
                    boolean existe = nombres.containsKey(names);
                    if (existe == true) {
                        System.out.println("el nombre que buscas si esta");
                    }else{
                        System.out.println("el nombre que buscas no esta");
                    }
                }
                
                System.out.println("Contenido del mapa:");
                for (Map.Entry<String, Integer> entry : nombres.entrySet()) {
                    System.out.println(entry.getKey() + " edad " + entry.getValue());
                }
                
            }while(!menu.equals("2"));
            }catch (Exception e) {
            System.out.println("error por favor vuelve a ejecutrar el programa");
        }
    }
}