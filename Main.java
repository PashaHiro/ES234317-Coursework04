/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2026-2027
 * Coursework   : 04
 * Student ID   : 5026251205
 * Full Name    : Muhammad Haekal Pashahudin
 * Class        : C
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Problem Test Case 1:");
        Integer [] a = {1, 3, 1, 4, 3, 7, -2, 0, 7, -2, -2, 1};
        ArrayList<Integer> v = new ArrayList<Integer> (Arrays.asList(a));
        System.out.println(twice(v));
        
        System.out.println("Problem Test Case 2:");
        String [] fNames ={"Marty", "Stuart", "Jessica", "Amanda", "Meghan", "Hal"};
        String [] lNames ={"Stepp", "Reges", "Miller", "Camp", "Miller", "Perkins"};
        String [] lNamesX ={"Stepp", "Reges", "Muller", "Camp", "Miller", "Perkins"};
        
        TreeMap<String, String> m1 = new TreeMap<String, String>();
        for(int i=0;i<fNames.length;i++){
            m1.put(fNames[i],lNames[i]);
        }
        
        TreeMap<String, String> m2 = new TreeMap<String, String>();
        for(int i=0;i<fNames.length;i++){
            m2.put(fNames[i],lNamesX[i]);
        }
        
        System.out.println(hasDuplicateValue(m1));
        System.out.println(hasDuplicateValue(m2));
        
        System.out.println("Problem Test Case 3:");
        Integer d1 [] = {3, 8, 17, 9, 17, 8, 3};
        Integer d2 [] = {3, 8, 17, 9, 4, 17, 8, 3};
        
        Queue<Integer> q1 = new LinkedList<Integer> (Arrays.asList(d1));
        Queue<Integer> q2 = new LinkedList<Integer> (Arrays.asList(d2));
        
        System.out.println(isPalindrome(q1));
        System.out.println(isPalindrome(q2));
        
        
        
    }
    
    public static Set<Integer> twice(List<Integer> l){
        Set<Integer> s = new TreeSet<Integer>(); // Tempat hasil akhir yang muncul tepat 2 kali
        Set<Integer> munculSatuKali = new HashSet<Integer>(); // Wadah untuk angka yang baru muncul 1 kali
        
        for (int angka : l) {
            if (s.contains(angka)) {

                s.remove(angka);
            } 
            else if (munculSatuKali.contains(angka)) {
                s.add(angka);
            } 
            else {
                munculSatuKali.add(angka);
            }
        }
        
        return s;

    }
    
    public static boolean  hasDuplicateValue(Map<String,String> m){
        if (m.size() <= 1) {
            return false;
        }
        
        Set<String> wadahValue = new HashSet<>();
        
        for (String namaBelakang : m.values()) {
            if (wadahValue.contains(namaBelakang)) {
                return true;
            }
            wadahValue.add(namaBelakang);
        }
        return false;

    }
    
    public static boolean isPalindrome(Queue<Integer> q){
        if (q.isEmpty()) {
            return true;
        }
        
        Stack<Integer> tumpukan = new Stack<>();
        int jumlahElemen = q.size();
        
        for (int i = 0; i < jumlahElemen; i++) {
            int angka = q.remove();
            tumpukan.push(angka);
            q.add(angka);
        }
        
        boolean statusPalindrom = true;
        
        for (int i = 0; i < jumlahElemen; i++) {
            int angkaQueue = q.remove();
            int angkaStack = tumpukan.pop();
            
            if (angkaQueue != angkaStack) {
                statusPalindrom = false;
            }
            q.add(angkaQueue);
        }
        return statusPalindrom;
    }
}
