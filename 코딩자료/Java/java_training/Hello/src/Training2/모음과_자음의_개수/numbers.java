package Training2.모음과_자음의_개수;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x=input.nextLine();
        int k=Integer.parseInt(x);

        String[] y=new String[k];
        int[] a=new int[k];
        int[] b=new int[k];
        for (int i=0; i<k; i++){
            y[i]=input.nextLine();
            for (int j=0;j<y[i].length();j++) {
                char z=y[i].charAt(j);
                switch (z) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        a[i]++;
                        break;
                    case ' ':
                        break;
                    default:
                        b[i]++;
                        break;
                }       
             }
        }
        for (int i=0;i<k;i++){
            System.out.println(a[i]+" "+b[i]);
        }
        input.close();
    }
}
