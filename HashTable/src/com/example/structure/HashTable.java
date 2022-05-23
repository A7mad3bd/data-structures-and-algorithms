package com.example.structure;

import com.example.Tree_intersection.BinaryTreeSearch;
import com.example.data.HashNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;

public class HashTable<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;
    private final HashSet<K> KEYS = new HashSet<>();

    public HashTable() {
        bucketArray = new ArrayList<>();
        buckets = 10;

        // init bucket array to prevent index out of
        // bounds exception for first time insert / retrieval
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    /*
    This is the hashing logic which produces\
    a unique array index to do inserts and
    lookups
     */
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;

//        if (arrayIndex < 0) {
//            arrayIndex = arrayIndex * -1;
//        }

        System.out.println("The index of => " + key + " is => " + arrayIndex);

        return arrayIndex;
    }

//    set
//    Arguments: key, value
//    Returns: nothing
//    This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
//    Should a given key already exist, replace its value from the value argument given to this method.

    public void put(K key, V value) {

        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.setNext(head);
        bucketArray.set(bucketIndex, newNode);

        // increase the table size
        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;

            for (int index = 0; index < buckets; index++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    put(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    //    hash
//    Arguments: key
//    Returns: Index in the collection for that key
    public int hash(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % buckets;
        index = index < 0 ? index * -1 : index;
        return index;
    }


    //    get
//    Arguments: key
//    Returns: Value associated with that key in the table
    public V get(K key) {
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        // search the linnked list
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                return head.getValue();
            }

            head = head.getNext();
        }
        return null;
    }

//    contains
//    Arguments: key
//    Returns: Boolean, indicating if the key exists in the table already.

    public Boolean contains(K key) {
        return get(key) != null;
    }

    //    keys
//    Returns: Collection of keys
    public ArrayList<K> keys() {
        ArrayList<K> Keys = new ArrayList<>();
        for (int i = 0; i < bucketArray.size(); i++) {
            HashNode<K, V> head = bucketArray.get(i);
            while (head != null) {
                Keys.add(head.getKey());
                head = head.getNext();
            }
        }
        return Keys;
    }


    //repeatedWord
    public String repeatedWord(String text) {
        String Text = text.toLowerCase(Locale.ROOT);
        String[] alltext = Text.split(" ");
        HashTable<String, Integer> HT = new HashTable<String, Integer>();
        for (String word : alltext) {
            if (word.contains(",")) {
                word = word.substring(0, word.length() - 1);
            }
            if (!word.equals("")) {
                int count;
                if (HT.get(word) != null)
                    count = HT.get(word);
                else
                    count = 0;
                if (count == 1) {
                    return word;
                }
                HT.put(word, count + 1);
            }
        }

        return "NULL";
    }
}
