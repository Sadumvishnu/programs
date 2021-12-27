public class Frequency {
 public static void main(String[] args){
     String str = "vishnu";
     char ch = 'v';
     int count = 0;
     for(int i=0;i<str.length();i++){
         if(ch == str.charAt(i)){

        
             count++;
            
         }
     }
     System.out.println("print the count"+ count);
    
    
 }
}

