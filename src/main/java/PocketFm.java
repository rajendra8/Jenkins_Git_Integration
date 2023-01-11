import org.testng.annotations.Test;

public class PocketFm {

    String []in="ABC".split("");
    //out=abc,bca,acb,cba,bac,cab,
    String out="";


    @Test
    public void test(){
//        for (int i = 0; i < in.length-1; i++) {
//             out=in[i];
//             i++;
//
//             out+=in[i];
//             i--;
//        }


        for (int i = 0; i <=in.length-1 ; i++) {
            out +=in[i];//a,b
            for (int j = 0; j<=in.length-1 ; j++) {
                if(j!=i) {
                    out += in[j];
                }

            }
        }
       // System.out.println(out);
        for (int i = in.length-1; i >=0 ; i--) {
            for (int j = 0; j<=in.length-1 ; j++) {
                if(j!=i) {
                    out += in[j];
                }

            }

        }
        System.out.println(out);

    }
}
