package com.HashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashTableTest {
    @Test
      public void find_frequency_of_given_words(){

        String sentence="To be or not to be";
        HashTable<String,Integer> hashTable=new HashTable<>();

        String[] words=sentence.toLowerCase().split(" ") ;

        for(String word : words){
            Integer value=hashTable.get(word);
            if(value == null){
                value=1;
            }
            else {
                value=value+1;
            }
            hashTable.add(word,value);
        }
        int frequency = hashTable.get("be");
        System.out.println(hashTable);
        Assertions.assertEquals(2,frequency);
    }

    @Test
    public void find_frequency_of_given_paragraph(){
        String para="Paranoids are not"+
                "paranoid because they are paranoid but"+
                "because they keep putting themselves"+
                "deliberately into paranoid avoidable"+
                "situations";

        HashTable<String,Integer> hashTable=new HashTable<>();
        String[] words=para.toLowerCase().split(" ") ;

        for(String word : words){
            Integer value=hashTable.get(word);
            if(value == null){
                value=1;
            }
            else {
                value=value+1;
            }
            hashTable.add(word,value);
        }
        int frequency = hashTable.get("are");
        System.out.println(hashTable);
        Assertions.assertEquals(2,frequency);
    }

}