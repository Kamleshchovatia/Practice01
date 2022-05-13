public class study {

    public static void main(String[] args) {

        int a1[]={5,10,15,20,25};
        int max=a1[0];
        int min=a1[0];

        for (int i = 1; i <a1.length ; i++) {

            if(a1[i]>max){

                max=a1[i];

            }

        }
        System.out.println(" Maximum value is = " +max);


        for (int i = 1; i <a1.length ; i++) {

            if(a1[i]< min) {

                min=a1[i];

            }

        }
        System.out.println(" Minimum value is = "+min);
    }

}
