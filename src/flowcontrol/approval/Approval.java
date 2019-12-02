package flowcontrol.approval;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Approval {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Escribe una nota: ");

    int nota = Integer.parseInt(br.readLine());

    if ( nota >=0 && nota <= 10 ) {

      //nota correcta
      switch ( nota ) {
        case 5:
          System.out.println("Aprobado");
          break;
        case 7:
          System.out.println("Notable");
          break;
        case 10:
          System.out.println("Excelente");
          break;

        default:
          System.out.println("ERROR");
          break;

      }

    }
    // else
    //System.out.println("El valor es incorrecto");



  }

}
