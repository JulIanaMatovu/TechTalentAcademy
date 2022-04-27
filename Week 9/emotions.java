
import java.util.ArrayList;
  
  
  
      class Main {
        public static void main(String[] args) {
  
        pangrams();
        System.out.println("\n");
        reverseSentence();
        System.out.println("\n");
        reverseWord();
          }
      
        public static void reverseSentence(){
          String sentence = "Are you as excited as I am?";
          System.out.println(sentence);
      String reverseSentence = "";
      
      String[] words = sentence.split(" ");
      
          for(int i = words.length - 1; i > 0; i--){
      
            if(i == 6){
              reverseSentence += "Am ";
            }else{
              reverseSentence += words[i] + " ";
            }
          }
          reverseSentence += "?";
      
          System.out.println(reverseSentence);
        }
      
        public static void reverseWord(){
          String[] wordList = new String[] {"Stressed", "Parts", "Straw", "Keep", "Wolf"};
          String reversedWord = "";
      
          for(int i = 0; i < wordList.length; i++){//loop through each word
            wordList[i] = wordList[i].toLowerCase();
            for(int j = wordList[i].length() - 1; j >= 0; j--){ //loop through letters of each word
              char letter = wordList[i].charAt(j);
              if(j == wordList[i].length() - 1){
                letter = Character.toUpperCase(letter);
              }
              reversedWord += letter;
            }
            System.out.println(reversedWord);
            reversedWord = "";
          }
        }
      
        public static void pangrams(){
          String sentence = "A wizard’s job is to vex chumps quickly in fog.";
          Boolean a = false;
          Boolean b = false;
          Boolean c = false;
          Boolean d = false;
          Boolean e = false;
          Boolean f = false;
          Boolean g = false;
          Boolean h = false;
          Boolean i = false;
          Boolean j = false;
          Boolean k = false;
          Boolean l = false;
          Boolean m = false;
          Boolean n = false;
          Boolean o = false;
          Boolean p = false;
          Boolean q = false;
          Boolean r = false;
          Boolean s = false;
          Boolean t = false;
          Boolean u = false;
          Boolean v = false;
          Boolean w = false;
          Boolean x = false;
          Boolean y = false;
          Boolean z = false;
          Boolean whiteSpaceFound = false;
      
          for(int counter = 0; counter < sentence.length() - 1; counter++){
      
            switch(sentence.charAt(counter)){
              case 'a':
                a = true;
                break;
                case 'b':
                b = true;
                break;
                case 'c':
                c = true;
                break;
                case 'd':
                d = true;
                break;
                case 'e':
                e = true;
                break;
                case 'f':
                f = true;
                break;
                case 'g':
                g= true;
                break;
                case 'h':
                h = true;
                break;
                case 'i':
                i = true;
                break;
                case 'j':
                j = true;
                break;
                case 'k':
                k = true;
                break;
                case 'l':
                l = true;
                break;
                case 'm':
                m = true;
                break;
                case 'n':
                n = true;
                break;
                case 'o':
                o = true;
                break;
                case 'p':
                p = true;
                break;
                case 'q':
                q = true;
                break;
                case 'r':
                r = true;
                break;
                case 's':
                s = true;
                break;
                case 't':
                t = true;
                break;
                case 'u':
                u = true;
                break;
                case 'v':
                v = true;
                break;
                case 'w':
                w = true;
                break;
                case 'x':
                x = true;
                break;
                case 'y':
                y = true;
                break;
                case 'z':
                z = true;
                break;
              default:
                whiteSpaceFound = true;
                break;
            }
            
          }
       Boolean[] booArr = new Boolean[]{a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
      Boolean panagramFound = true;
          
          for(int loop = 0; loop < booArr.length; loop++){
            if(booArr[loop] == false){
              panagramFound = false;
            }
          }
          System.out.println("\nPanagram: " + panagramFound);
          if(panagramFound){
            System.out.println("The sentence \"" + sentence + "\" is a panagram!");
          }else{
            System.out.println("The sentence \"" + sentence + "\" is NOT a panagram!");
          }
          letterOccurence(sentence);
          }
  
        public static void letterOccurence(String inputSentence){
          inputSentence = inputSentence.toLowerCase();
          char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  
  
          
          ArrayList<Character> missingLetters = new ArrayList<Character>();
          for(int i = 0; i < alphabet.length; i++){
            System.out.println(alphabet[i]);
            int counter = 0;
            for(int j =0; j < inputSentence.length(); j++){
              if(inputSentence.charAt(j) == alphabet[i]){
                counter++;
              }
            }
            System.out.println("The letter \'" + alphabet[i] + "\' appears " + counter + " times.");
            if(counter == 0){
              missingLetters.add(alphabet[i]);
            }
          }
          if(missingLetters.size() != 0){
            System.out.println("Missing letters are: " + missingLetters);
          }else{
            System.out.println("There are no missing letters");
          }
          
        }
        
      }
  
  
      
    
      
    
  