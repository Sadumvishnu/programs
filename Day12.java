public class Day12{
public static void main(String[] args){
String str = "He is a very very good boy , isn ' t he?";
String[] words = str.split("\\s"); 
for(String w : words){
System.out.println(w);
}
}
}