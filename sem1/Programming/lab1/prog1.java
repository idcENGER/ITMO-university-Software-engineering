package lab1;

import java.util.Random;
class prog1 {
    public static void main(String[] args) {
        Random random = new Random();
        long[] w = new long[]{18, 16, 14, 12, 10, 8, 6, 4, 2};
        float[] x = new float[12];
        double[][] l = new double[9][12];
        //double c = Math.atan(1/Math.pow(Math.E,1))/Math.pow(2*(3+Math.log(Math.abs(1))),Math.sin(1))+1;
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10 + 16) - 16;
        }
        for (int i=0; i < 9; i++){
            for (int j=0; j < 12; j++){
                if(w[i]==16){
                    l[i][j]=Math.log(Math.sqrt(Math.tan(Math.pow(Math.sqrt(2*x[j])/Math.pow((1-x[j])/2,x[j])-1,Math.sin(x[j])))));
                }else if(w[i]==2 || w[i]==6 || w[i]==12 || w[i]==18){
                    l[i][j]=Math.atan(1/Math.pow(Math.E,x[j]))/Math.pow(2*(3+Math.log(Math.abs(x[j]))),Math.sin(x[j]))+1;
                }else{
                    l[i][j]=Math.atan(1/Math.pow(Math.E,Math.acos(Math.pow(Math.E,Math.pow(Math.sin(x[j]),1/3)))));
                }
            }
        }
        for (int i=0; i < 9; i++){
            for (int j=0; j < 12; j++){
                System.out.printf("%.4f ",l[i][j]);
            }
            System.out.println();
        }
    }
}

