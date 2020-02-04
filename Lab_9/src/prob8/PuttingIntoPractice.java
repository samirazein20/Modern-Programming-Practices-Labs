package prob8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2014, 300),
            new Transaction(raoul, 2013, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2011, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).

        Stream<String> streams = transactions.stream().filter((x) -> x.getYear()>2010)
                                                        .map(x -> x.getTrader() + " " + x.getValue()+ " "+x.getYear())
                                                        .sorted((x,y) -> x.compareTo(y))
                                                        //.sorted(Comparator.comparing(Transaction::getValue))
                                                     ;

        String s = streams.collect(Collectors.joining(" ,"));
        System.out.println("------------S : "+s);
        
        // Query 2: What are all the unique cities where the traders work?
        Stream<String> stream1 = transactions.stream().map(x -> x.getTrader().getCity() + " ").distinct();
        String s1 = stream1.distinct().collect(Collectors.joining(" ,"));

        System.out.println("------------S1 : "+s1);
        

        // Query 3: Find all traders from Cambridge and sort them by name.
        Stream<String> nameStream = transactions.stream().filter((y) -> y.getTrader().getCity().equalsIgnoreCase("Cambridge")).map(x -> x.getTrader().getName() + " ").sorted((str1,str2) -> str1.compareTo(str2)).distinct();
        String names = nameStream.collect(Collectors.joining(" ,"));
        System.out.println("------------name stream------------ : "+names);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        Stream<String> sortedNameStream = transactions.stream().map(x -> x.getTrader().getName() + " ").sorted((str1,str2) -> str1.compareTo(str2)).distinct();
        String sortedNames = sortedNameStream.collect(Collectors.joining(" ,"));
        System.out.println("------------sorted name stream------------ : "+sortedNames);
        

        // Query 5: Are there any trader based in Milan?
        Stream<String> milan = transactions.stream().filter((m) -> m.getTrader().getCity().equalsIgnoreCase("Milan")).map(x -> x.getTrader().getName()).distinct();
        String tradersInMilan = milan.collect(Collectors.joining(" ,"));
        System.out.println("------------traders in milan------------"+ tradersInMilan);
   
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        List<Transaction> cam = new ArrayList<>();
        for(Transaction t : transactions){
            t.getTrader().setCity("Cambridge");
            cam.add(t);
        }
        Stream<String> milanToCambridge = cam.stream().filter((m) -> m.getTrader().getCity().equalsIgnoreCase("Milan")).map(u -> u.getTrader().getCity() + " " + u.getTrader().getName());
        String r = milanToCambridge.collect(Collectors.joining(" ,"));
        System.out.println("------------------------TRY AND FAIL--------------------"+ r);
        // Query 7: What's the highest value in all the transactions?
        int maxVal = 0;
        for (Transaction v : transactions){
            if (v.getValue() > maxVal){
                maxVal = v.getValue();
            }
        }
        System.out.println("--------------MAXIMUM----------"+ maxVal);
    }
}
