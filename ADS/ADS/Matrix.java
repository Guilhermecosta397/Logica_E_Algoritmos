
public class Matrix{
    public static void main(String[] args) {
    
        int m[][]= {{1,2,3},{6,7,8}};
        for(int i =0; i<2 ; i++ ){
            for(int j=0; j<3; j++){
            m[i][j]= m[i][j]*2;
            System.out.println("m["+i+"]["+j+"]="+m[i][j]);
            }
        }
    }
}