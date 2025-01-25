import java.io.*;


public class ReadCharacterUseCase {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;

        System.out.println("Enter a character: ");
        ch = br.readLine().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':System.out.print("Vowel");break;
            default:System.out.println("Constants");
        }
    }
    
}
