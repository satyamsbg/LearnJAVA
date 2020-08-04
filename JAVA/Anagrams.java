

public class Anagrams {
    public static void main(String[] args){
        String a = "aabcb";
        String b = "ababc";
        boolean anag =false;
        boolean visited[] = new boolean[b.length()];
        if(a.length()==b.length()){
            
            for(int i=0;i<a.length();i++){
            anag=false;
            char c = a.charAt(i);
            for(int j=0;j<b.length();j++){
                char d= b.charAt(j);
                if(c==d && visited[j]==false){
                    visited[j]=true;
                    anag=true;
                    break;
                }
            }
            if(anag==false){
                break;
            }        
        }
       
    }
            
    if(anag==true){
        System.out.println("Anagram");
        }
        else
        System.out.println("Not Anagram");

    
}
}