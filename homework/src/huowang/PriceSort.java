package huowang;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class PriceSort {

    public void proceSort() throws IOException{
        //read file
        InputStream is = new FileInputStream("products.txt");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is));
        String line;
        Map sortedProduct = new HashMap<String,Integer>();
        while(reader.ready()){
            line = reader.readLine();
            //System.out.println(line);
            String[] s = line.split(",");
            sortedProduct.put(s[0],s[1]);
        }
        reader.close();
        is.close();

        //write file
        FileWriter fw =  new FileWriter("Sorted.txt");
        BufferedWriter bufw = new BufferedWriter(fw);

        List<Map.Entry<String, Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>(sortedProduct.entrySet());
        Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int value1 = Integer.parseInt(o1.getValue()+"");
//                System.out.println(value1);
                int value2 = Integer.parseInt(o2.getValue()+"");
                if(value1>value2){
                    return 1;
                }
                if(value1<value2){
                    return -1;
                }
                return 0;
            }
        });


        //after sort list1
        //Set treeSet = sortedProduct.keySet();
        for(Map.Entry<String, Integer> entry : list1){
            bufw.write(entry.getKey()+","+entry.getValue());
            bufw.newLine();
            //System.out.println("key="+i+",,,value="+sortedProduct.get(i));
        }
        bufw.flush();
        bufw.close();
        fw.close();
    }
}