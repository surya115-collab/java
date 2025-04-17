public class BitsFlipper {
    public static int numToBinary(int n1,int n2,int n3) {
        StringBuilder binaryXor = new StringBuilder();
        StringBuilder binaryN3=new StringBuilder();
        String XorBinary=null;
        String n3Binary = null;
        int XorN1andN2=n1^n2;
        while(XorN1andN2!=0){
            int rem=XorN1andN2%2;
            binaryXor.append(rem);
            XorN1andN2/=2;
        }
        while(n3!=0){
            int rem=n3%2;
            binaryN3.append(rem);
            n3/=2;
        }
        if(binaryXor.length()==binaryN3.length()){
            XorBinary=binaryXor.reverse().toString();
            n3Binary=binaryN3.reverse().toString();
        }
        else{
            int sizediff=Math.abs(binaryXor.length()-binaryN3.length());
            if(binaryXor.length()>binaryN3.length()){
                for(int i=0;i<sizediff;i++){
                    binaryN3.append("0");
                }
                XorBinary=binaryXor.reverse().toString();
                n3Binary=binaryN3.reverse().toString();
            }
            else if(binaryXor.length()<binaryN3.length()){
                for(int i=0;i<sizediff;i++){
                    binaryXor.append("0");
                }
                XorBinary=binaryXor.reverse().toString();
                n3Binary=binaryN3.reverse().toString();
            }
        }
        String subString1,subString2;
        int i=XorBinary.length()-1,count=0;
        while(XorBinary.contains("1") || n3Binary.contains("1")){
            if((XorBinary.charAt(i)&1)!=(n3Binary.charAt(i)&1)){
                count++;
            }
            subString1=XorBinary.substring(0,XorBinary.length()-1);
            subString2=n3Binary.substring(0, n3Binary.length()-1);
            XorBinary=subString1;
            n3Binary=subString2;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 456;
        int n3 = 789;
        int res=numToBinary(n1, n2, n3);
        System.out.println(res);
    }
}
