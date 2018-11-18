import java.util.*;

public class Dictionary {
   // String language;
    Map<String, List<String>> hashmap = new HashMap< String, List<String>>();

   // public Dictionary(String language) {
  //      this.language = language;
  //  }

//    public Dictionary(Dictionary diction) {
////        diction.hashmap
////
////    }
public static void main(String[] args) {
    Dictionary dictionary1 = new Dictionary();
    dictionary1.addWord("work", "работать");
    dictionary1.addWord("relax", "отдыхать");
    dictionary1.addWord("work", "работать");
    dictionary1.addWord("relax", "не работать");
    dictionary1.returntranslation("work");
    dictionary1.printDictionary();
}

    public void addWord (String word, String          translation){
        List<String> translateList = hashmap.get(word);
        if(translateList==null){
            translateList  =  new ArrayList<>();
            translateList .add(translation);
            hashmap.put(word,translateList);
        }
        else {
          if(translateList.contains(translation)==false)
    translateList.add(translation);
        }
    }
    public void returntranslation(String word){
        if(hashmap.containsKey(word)){
            System.out.println(hashmap.get(word));
        }
    }
    public void printDictionary(){
        System.out.println(hashmap);
    }
}
