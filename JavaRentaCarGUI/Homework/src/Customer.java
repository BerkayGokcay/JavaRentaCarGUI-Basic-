import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Customer
{
    private String fileName = "C:/Users/Berkay/Desktop/customerId.txt";
    private Path path = Paths.get(fileName);
    private Scanner scanner = new Scanner(path) ;
    private List<String> lineBox = new ArrayList<String>() ;
    private List<String> IdBox = new ArrayList<String>() ;
    private List<String> PaymentBox = new ArrayList<String>() ;
    private List<String> CityBox = new ArrayList<String>() ;
    public int TotalPayment ;
    public String[] split = new String[3] ;

    public int customerId ;
    public Customer() throws IOException {
        ListCustomer();
    }

    public boolean ScanCustomerId(int Id)
    {
        int i = 0;
        while(i<lineBox.size())
        {
            if(Id == Integer.parseInt(IdBox.get(i)))
            {
                return true ;
            }
            i++;
        }
        return false ;
    }
    public List ListCustomer()
    {
        int i = 0 ;
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            lineBox.add(line) ;
            split = line.split(",");
            IdBox.add(split[0]);
            PaymentBox.add(split[1]);
            CityBox.add(split[2]);
        }
        return lineBox ;
    }
    public String ShowCustomerInfo(int ShowId)
    {
        String str ;
        int i = 0;
        while(i<lineBox.size())
        {
            if(ShowId == Integer.parseInt(lineBox.get(i)))
            {
               return  str = lineBox.get(i);
            }
            i++;
        }
        return null ;
    }
    public int getCustomerId() {
        return customerId;
    }
}
