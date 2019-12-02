package flowcontrol.hours;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hours {

  public static void main(String[] args) throws IOException {

    System.out.println("Horas: ");
    int horas;
    System.out.println("Minutos: ");
    int minutos;

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      horas = Integer.parseInt(br.readLine());
      minutos = Integer.parseInt(br.readLine());

      if ( horas == 12 && minutos == 0) {
        System.out.println("son las 12 del mediodia");
      }

      else
      if ( horas == 0 && minutos == 0) {
        System.out.println("Es la medianoche");
      }
      else
      if ( horas >= 0 && horas <= 7) {
        System.out.println("Es madrugada");
      }
      else
      if ( horas > 7 && horas <= 12) {
        System.out.println("Es la mañana");
      }
      else
      if ( horas > 12 && horas <= 21) {
        System.out.println("es la tarde");
      }
      else
      if ( horas > 21 && horas <= 23) {
        System.out.println("es la noche");
      }



    }

  }

}
