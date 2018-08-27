

import java.util.HashMap;

public class KutyaGazda {
    public static void main(String[] args) {



        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("Janos", "Bordi");
        hmap.put("Bela", "Cezar");
        hmap.put("Aniko", "Hektor");
        hmap.put("Agnes", "Cezar");
        hmap.put("Jozsef", "Csibesz");
        hmap.put("Janos", "Vakkancs");

        for (
                String s : hmap.keySet()) {
            System.out.println(s + ": " + hmap.get(s));
        }

        System.out.println(hmap.values());
        System.out.println(hmap.get("Janos"));

    }
}