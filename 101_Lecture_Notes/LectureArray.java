/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 5, 8, 8, 8, 2, 4, 4};
        
        for (int c = 1; c < arr.length-1; c=c+2){
            System.out.print(arr[c]+" "+arr[c+1]+"  ");
        }
	    int dupeCheck = 8;
        for (int c = 0; c < arr.length-1; c++){
            if(dupeCheck == arr[c]){
                System.out.println(c);
            }
        }
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Duplicate "+arr[i]+" found at indexes "+i+" and "+(i+1));
            }
           int [] a = {6,2,3,7,2,4,5,0,9};
            for (int c = 0; c < a.length-1; c++){
                if (a[c]%2==0){
                    a[c]=a[c]-a[c+1];
                }
            
                System.out.print(a[c]+", ");
            }
           
        }    
            
    }
}