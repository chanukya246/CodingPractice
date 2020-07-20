package com.arena;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HashTableEx {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public char getUniqueElements(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = str.toCharArray();
            for (char ch : charArray) {
                int count = map.containsKey(ch) ? map.get(ch) : 0;
                map.put(ch, count + 1);
            }

            for (char ch :charArray)
                if(map.get(ch) == 1)
                    return ch;

        return Character.MIN_VALUE;
    }

    public void put(int key, String value){

        Entry entry = getEntry(key);
        if(entry == null){
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).add(new Entry(key, value));
    }

    private int hash(int key){
        return (key % entries.length);
    }

    public String get(int key){
        Entry entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }

    public void remove(int key){

        Entry entry = getEntry(key);
        if(entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);

    }

    private Entry getEntry(int key){
        LinkedList<Entry> bucket = getBucket(key);
        if(bucket != null){
            for(Entry entry : bucket){
                if(entry.key == key)
                    return entry;
            }
        }
        return null;
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if(bucket == null)
            entries[index] = new LinkedList<>();

        return bucket;
    }

}
