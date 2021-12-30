public class Splitexample {
    public static void main(String [] args){
        String str = "hi am vishnu priya";
       String[] words = str.split("\\s");
       for(String w:words){
           System.out.println(w);
       }
    }




    
}
