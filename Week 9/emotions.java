import java.util.Arrays;


class Main {
  public static void main(String[] args) {

    pangrams();
    // reverseSentence();
    // System.out.println("\n");
    // reverseWord();
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
    String sentence = "Sixty zippers were quickly picked from the woven jute bag.";
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

    Boolean[] booArr = new Boolean[]{a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};

    

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

    for(int loop = 0; loop < booArr.length; loop++){
      Boolean panagramFound = true;
      if(booArr[loop] == false){
        panagramFound = false;
      }
    }

    if(panagramFound == false){
      System.out.println("The sentence " + sentence + " is a panagram!");
    }else{
      System.out.println("The sentence " + sentence + " is NOT a panagram!");
    }
    }
    

    
  
    
  
