import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0, media = 0;
        while(leitor.hasNext()){
            media+= leitor.nextInt();
            contador++;
        }
        media/=contador;
        
        if(media <= 25) { System.out.println("Jovem!"); }
        else if (media<=60) { System.out.println("Adulta!"); }
        else { System.out.println("Idosa!"); }
    }
}
