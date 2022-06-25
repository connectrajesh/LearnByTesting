package org.grow.engineering;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int add(int a, int b)
    {
        return a+b;
    }
    public float add(float a, float b)
    {
        return a+b;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
    public long add(long a, long b)
    {
        return a+b;
    }

    //return json string
public String getJsonString()
    {
        return "{\"name\":\"Rajesh\",\"age\":30}";
    }

    //build a function that has recursive call
    public int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    //function that accecpts array and return sum of all elements
    public int sumOfArray(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    //function that accepts max capacity of integer array and return array of random numbers
    public int[] getRandomArray(int maxCapacity)
    {
        int[] arr=new int[maxCapacity];
        for(int i=0;i<maxCapacity;i++)
        {
            arr[i]=(int)(Math.random()*100);
        }
        return arr;
    }
    //swap two numbers without using a third variable
    public void swap(int a, int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
    }
    //example for iterators
    public void iterateArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    //example for enumerables
    public void enumerateArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    //listiterator example
    public void listIterator(int[] arr)
    {
        java.util.List<Integer> list=new java.util.ArrayList<Integer>();
        for(int i:arr)
        {
            list.add(i);
        }
        java.util.ListIterator<Integer> listIterator=list.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }

    //how a hashmap works
    public void hashMap()
    {
        java.util.HashMap<String,String> map=new java.util.HashMap<String,String>();
        map.put("name","Steve");
        map.put("age","27");
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
    }

    //how a linkedlist works
    public void linkedList()
    {
        java.util.LinkedList<String> list=new java.util.LinkedList<String>();
        list.add("Steve");
        list.add("Rajesh");
        list.add("Liviu");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
    //write a hashmap that accepts key and value as parameters and return the value
    public String getValue(String key, String value)
    {
        java.util.HashMap<String,String> map=new java.util.HashMap<String,String>();
        map.put(key,value);
        return map.get(key);
    }

    //write a hashmap with five key value pairs and return 5th value
    public String getValueFromEmployeeHash(String key)
    {
        java.util.HashMap<String,String> map=new java.util.HashMap<String,String>();
        map.put("name","Steve");
        map.put("age","27");
        map.put("city","Bangalore");
        map.put("country","India");
        map.put("salary","100000");
        return map.get(key);
    }

    //write iterator for hashmap
    public void iterateHashMap(java.util.HashMap<String,String> map)
    {
        java.util.Set<String> keys=map.keySet();
        java.util.Iterator<String> iterator=keys.iterator();
        while(iterator.hasNext())
        {
            String key=iterator.next();
            System.out.println(key+"="+map.get(key));
        }
    }

    //hashmap with entryset
    public void iterateHashMapWithEntrySet(java.util.HashMap<String,String> map)
    {
        java.util.Set<java.util.Map.Entry<String,String>> entrySet=map.entrySet();
        java.util.Iterator<java.util.Map.Entry<String,String>> iterator=entrySet.iterator();
        while(iterator.hasNext())
        {
            java.util.Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

    //Open-Closed Principle
    public void openClosedPrinciple()
    {
        java.util.HashMap<String,String> map=new java.util.HashMap<String,String>();
        map.put("name","Steve");
        map.put("age","27");
        map.put("city","Bangalore");
        map.put("country","India");
        map.put("salary","100000");
        java.util.Set<java.util.Map.Entry<String,String>> entrySet=map.entrySet();
        java.util.Iterator<java.util.Map.Entry<String,String>> iterator=entrySet.iterator();
        while(iterator.hasNext())
        {
            java.util.Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

    //build a microservice that accepts a json string and return the value of the key
    public String getValueFromJson(String json, String key)
    {
        java.util.HashMap<String,String> map=new java.util.HashMap<String,String>();
        map.put("name","Steve");
        map.put("age","27");
        map.put("city","Bangalore");
        map.put("country","India");
        map.put("salary","100000");
        return map.get(key);
    }

    //http basics - get request
    public void getRequest()
    {
        try
        {
            callCommonConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void callCommonConnection() throws IOException {
        java.net.URL url=new java.net.URL("https://www.google.com");
        java.net.HttpURLConnection con=(java.net.HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        int responseCode=con.getResponseCode();
        System.out.println(responseCode);
    }

    //Bank accounting - calculate interest
    public void calculateInterest(int amount, int years, float rate)
    {
        float interest=(amount*years*rate)/100;
        System.out.println("Interest is "+interest);
    }

    //return all http status codes
    public void getHttpStatusCodes()
    {
        try
        {
            callCommonConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    //Return Http status codes for a given url
    public void getHttpStatusCodes(String url)
    {
        try
        {
            java.net.URL url1=new java.net.URL(url);
            java.net.HttpURLConnection con=(java.net.HttpURLConnection)url1.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            int responseCode=con.getResponseCode();
            System.out.println(responseCode);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
