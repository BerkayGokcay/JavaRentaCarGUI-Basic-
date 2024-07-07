import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class VehicleList extends JFrame implements ActionListener {
    private int count = 0 ;
    private String fileName = "C:/Users/Berkay/Desktop/Vehicle.txt";
    private Path path = Paths.get(fileName);
    private Scanner scanner = new Scanner(path) ;
    JButton BackButton,CarButton1,CarButton2,CarButton3,CarButton4,CarButton5,CarButton6,CarButton7,CarButton8;
    public String[] carSplit = new String[10] ;
    public String[] brand = new String[10] ;
    public String[] plate = new String[10] ;
    public String[] segment = new String[10] ;
    public String[] fuelType = new String[10] ;
    public String[] transmisson = new String[10] ;
    public String[] smoke = new String[10] ;
    public String[] door = new String[10] ;
    public String[] city = new String[10] ;
    public String[] charge = new String[10] ;

    public String inputCity,inputFuel,inputTransmission,inputDoor,inputSmoke,inputSegment;
    public int inputCharge;
    Vehicle car1,car2,car3,car4,car5,car6,car7,car8;

    public VehicleList() throws IOException {
        carInformation();
        car1 = new Vehicle(brand[0],plate[0],segment[0],fuelType[0],transmisson[0],smoke[0],door[0],city[0],Integer.parseInt(charge[0]));
        car2 = new Vehicle(brand[1],plate[1],segment[1],fuelType[1],transmisson[1],smoke[1],door[1],city[1],Integer.parseInt(charge[1]));
        car3 = new Vehicle(brand[2],plate[2],segment[2],fuelType[2],transmisson[2],smoke[2],door[2],city[2],Integer.parseInt(charge[2]));
        car4 = new Vehicle(brand[3],plate[3],segment[3],fuelType[3],transmisson[3],smoke[3],door[3],city[3],Integer.parseInt(charge[3]));
        car5 = new Vehicle(brand[4],plate[4],segment[4],fuelType[4],transmisson[4],smoke[4],door[4],city[4],Integer.parseInt(charge[4]));
        car6 = new Vehicle(brand[5],plate[5],segment[5],fuelType[5],transmisson[5],smoke[5],door[5],city[5],Integer.parseInt(charge[5]));
        car7 = new Vehicle(brand[6],plate[6],segment[6],fuelType[6],transmisson[6],smoke[6],door[6],city[6],Integer.parseInt(charge[6]));
        car8 = new Vehicle(brand[7],plate[7],segment[7],fuelType[7],transmisson[7],smoke[7],door[7],city[7],Integer.parseInt(charge[7]));
        this.setSize(700,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        BackButton = new JButton("Back") ;
        CarButton1 = new JButton(brand[0]+"\t"+ plate[0] + "\t" + segment[0] + "\t" + fuelType[0] + "\t" + transmisson[0] + "\t" + smoke[0] + "\t" + door[0] + "\t" + city[0] + "\t" + charge[0] );
        CarButton2 = new JButton(brand[1]+"\t"+ plate[1] + "\t" + segment[1] + "\t" + fuelType[1] + "\t" + transmisson[1] + "\t" + smoke[1] + "\t" + door[1] + "\t" + city[1] + "\t" + charge[1] );
        CarButton3 = new JButton(brand[2]+"\t"+ plate[2] + "\t" + segment[2] + "\t" + fuelType[2] + "\t" + transmisson[2] + "\t" + smoke[2] + "\t" + door[2] + "\t" + city[2] + "\t" + charge[2] );
        CarButton4 = new JButton(brand[3]+"\t"+ plate[3] + "\t" + segment[3] + "\t" + fuelType[3] + "\t" + transmisson[3] + "\t" + smoke[3] + "\t" + door[3] + "\t" + city[3] + "\t" + charge[3] );
        CarButton5 = new JButton(brand[4]+"\t"+ plate[4] + "\t" + segment[4] + "\t" + fuelType[4] + "\t" + transmisson[4] + "\t" + smoke[4] + "\t" + door[4] + "\t" + city[4] + "\t" + charge[4] );
        CarButton6 = new JButton(brand[5]+"\t"+ plate[5] + "\t" + segment[5] + "\t" + fuelType[5] + "\t" + transmisson[5] + "\t" + smoke[5] + "\t" + door[5] + "\t" + city[5] + "\t" + charge[5] );
        CarButton7 = new JButton(brand[6]+"\t"+ plate[6] + "\t" + segment[6] + "\t" + fuelType[6] + "\t" + transmisson[6] + "\t" + smoke[6] + "\t" + door[6] + "\t" + city[6] + "\t" + charge[6] );
        CarButton8 = new JButton(brand[7]+"\t"+ plate[7] + "\t" + segment[7] + "\t" + fuelType[7] + "\t" + transmisson[7] + "\t" + smoke[7] + "\t" + door[7] + "\t" + city[7] + "\t" + charge[7] );
        Container C = getContentPane();
        C.setLayout(new GridLayout());
        if((inputSegment == "A" && inputFuel == "Diesel" && inputTransmission == "Manual" && inputSmoke == "Smoker" && inputDoor == "Four" && inputCity == "Ankara" && Integer.parseInt(charge[0])>inputCharge))
        {
            C.add(CarButton1);
        }
        if((inputSegment == "B" && inputFuel == "Gas" && inputTransmission == "Automatic" && inputSmoke == "Non-Smoker" && inputDoor == "Four" && inputCity == "Antalya" && Integer.parseInt(charge[1])>inputCharge))
        {
            C.add(CarButton2);
        }
        if((inputSegment == "B" || inputFuel == "Gas" && inputTransmission == "Manual" && inputSmoke == "Smoker" && inputDoor == "Four" && inputCity == "Mersin" && Integer.parseInt(charge[1])>inputCharge))
        {
            C.add(CarButton3);
        }
        if((inputSegment == "B" && inputFuel == "Diesel" && inputTransmission == "Automatic" && inputSmoke == "Smoker" && inputDoor == "Four" && inputCity == "Izmir" && Integer.parseInt(charge[1])>inputCharge))
        {
            C.add(CarButton4);
        }
        if((inputSegment == "A" && inputFuel == "Diesel" && inputTransmission == "Automatic" && inputSmoke == "Non-Smoker" && inputDoor == "Two" && inputCity == "Ankara" && Integer.parseInt(charge[1])>inputCharge))
        {
            C.add(CarButton5);
        }
        if((inputSegment == "B" && inputFuel == "Gas" && inputTransmission == "Manual" && inputSmoke == "Smoker" && inputDoor == "Four" && inputCity == "Istanbul" && Integer.parseInt(charge[1])>inputCharge))
        {
            C.add(CarButton6);
        }
        if((inputSegment == "C" && inputFuel == "Diesel" && inputTransmission == "Manual" && inputSmoke == "Smoker" && inputDoor == "Four" && inputCity == "Kayseri" && Integer.parseInt(charge[1])>inputCharge))
        {
            C.add(CarButton7);
        }
        if((inputSegment == "A" && inputFuel == "Gas" && inputTransmission == "Automatic" && inputSmoke == "Non-Smoker" && inputDoor == "Four" && inputCity == "Bolu" && Integer.parseInt(charge[1])>inputCharge))
        {
            C.add(CarButton8);
        }
        BackButton.addActionListener(this);
        CarButton1.addActionListener(this);
        CarButton2.addActionListener(this);
        CarButton3.addActionListener(this);
        CarButton4.addActionListener(this);
        CarButton5.addActionListener(this);
        CarButton6.addActionListener(this);
        CarButton7.addActionListener(this);
        CarButton8.addActionListener(this);

    }
    public void carInformation()
    {
        int i = 0;
        while(i<8)
        {
            String line = scanner.nextLine();
            carSplit = line.split(",");
            brand[i] = carSplit[0];
            plate[i] = carSplit[1];
            segment[i] = carSplit[2];
            fuelType[i] = carSplit[3];
            transmisson[i] = carSplit[4];
            smoke[i] = carSplit[5];
            door[i] = carSplit[6];
            city[i] = carSplit[7];
            charge[i] = carSplit[8] ;
            i++ ;
        }
    }
    public void turnCity(String str)
    {
        inputCity = str;
    }
    public void turnFuel(String str)
    {
         inputCity = str ;
    }
    public void turnTransmission(String str)
    {
        inputTransmission = str;
    }
    public void turnDoor(String str)
    {
        inputDoor = str;
    }
    public void turnSmoke(String str)
    {
        inputSmoke = str;
    }
    public void turnSegment(String str)
    {
        inputSegment = str;
    }
    public void turnCharge(int ch)
    {
        inputCharge = ch;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==BackButton)
        {
            this.setVisible(false);
            RentClass rentClass = null;
            try {
                rentClass = new RentClass();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            rentClass.setVisible(true);
        }
    }
}
