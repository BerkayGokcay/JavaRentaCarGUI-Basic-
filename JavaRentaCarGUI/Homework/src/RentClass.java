import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentClass extends JFrame implements ActionListener {
    private String outFile = "C:/Users/Berkay/Desktop/Reservation.txt";
    private String inFile = "C:/Users/Berkay/Desktop/Reservation.txt";
    private Path inPath = Paths.get(inFile) ;
    private Scanner inScan = new Scanner(inPath) ;

    Vehicle vehicle = new Vehicle();
    private String fileName = "C:/Users/Berkay/Desktop/Vehicle.txt";
    private Path path = Paths.get(fileName);
    private Scanner scanner = new Scanner(path) ;
    private String fileName2 = "C:/Users/Berkay/Desktop/Vehicle.txt";
    private Path path2;
    private Scanner scanner2;
    public String[][] data  = new String[9][9];
    public String[] column = new String[9] ;
    public String[] outLine = new String[8] ;
    JButton BackButton;//,CarButton1,CarButton2,CarButton3,CarButton4,CarButton5,CarButton6,CarButton7,CarButton8;
    JButton RentButton;
    JButton ShowButton;
    JButton RentCarButton ;
    JSlider priceFilter;
    JComboBox cityPickFilter;
    JComboBox smokeFilter;
    JComboBox doorFilter;
    JComboBox transmissionFilter;
    JComboBox fuelType;
    private List<String> lineBox2;
    private TextField AllCars;
    JLabel carName;
    JLabel carSegment;
    JLabel carFuelType;
    JLabel carTransmissionType;
    JLabel carPrice;
    JLabel extras;
    public String[] segments;
    public String[] smoke;
    public String[] door;
    public String[] transmission;
    public String[] fuel;
    public String[] carSplit = new String[10] ;
    public String[] brand = new String[10] ;
    public String[] plate = new String[10] ;
    public String[] segment = new String[10] ;
    public String[] fuelTypes = new String[10] ;
    public String[] transmisson = new String[10] ;
    public String[] smokes = new String[10] ;
    public String[] doors = new String[10] ;
    public String[] city = new String[10] ;
    public String[] charge = new String[10] ;
    public String finalScanCar ;
    JTable vehicleTable ;

    Vehicle car1,car2,car3,car4,car5,car6,car7,car8;

    public RentClass() throws IOException {
        carInformation();
        this.column = new String[]{"Plaka", "Marka", "Yakıt", "Vites", "Smoke", "Şehir", "Fiyat", "Segment","Fiyat"};
        car1 = new Vehicle(brand[0],plate[0],segment[0],fuelTypes[0],transmisson[0],smokes[0],doors[0],city[0],Integer.parseInt(charge[0]));
        car2 = new Vehicle(brand[1],plate[1],segment[1],fuelTypes[1],transmisson[1],smokes[1],doors[1],city[1],Integer.parseInt(charge[1]));
        car3 = new Vehicle(brand[2],plate[2],segment[2],fuelTypes[2],transmisson[2],smokes[2],doors[2],city[2],Integer.parseInt(charge[2]));
        car4 = new Vehicle(brand[3],plate[3],segment[3],fuelTypes[3],transmisson[3],smokes[3],doors[3],city[3],Integer.parseInt(charge[3]));
        car5 = new Vehicle(brand[4],plate[4],segment[4],fuelTypes[4],transmisson[4],smokes[4],doors[4],city[4],Integer.parseInt(charge[4]));
        car6 = new Vehicle(brand[5],plate[5],segment[5],fuelTypes[5],transmisson[5],smokes[5],doors[5],city[5],Integer.parseInt(charge[5]));
        car7 = new Vehicle(brand[6],plate[6],segment[6],fuelTypes[6],transmisson[6],smokes[6],doors[6],city[6],Integer.parseInt(charge[6]));
        car8 = new Vehicle(brand[7],plate[7],segment[7],fuelTypes[7],transmisson[7],smokes[7],doors[7],city[7],Integer.parseInt(charge[7]));
        this.setSize(1500,1500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vehicleTable = new JTable(data,column);
        vehicleTable.setCellSelectionEnabled(true);
        ListSelectionModel select = vehicleTable.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String data = null;
                int[] row = vehicleTable.getSelectedRows();
                int[] columns = vehicleTable.getSelectedColumns();
                for (int i = 0; i < row.length; i++) {
                    for (int j = 0; j < columns.length; j++) {
                        data = (String) vehicleTable.getValueAt(row[i], columns[j]);
                        finalScanCar = data;
                    }
                }
            }
        });
        this.path2 = Paths.get(this.fileName2);
        this.scanner2 = new Scanner(this.path2);
        this.lineBox2 = new ArrayList();
        this.segment = new String[]{"A", "B", "C"};
        this.smoke = new String[]{"Smoker", "Non-Smoker"};
        this.door = new String[]{"Two", "Four"};
        this.transmission = new String[]{"Manual", "Automatic"};
        this.fuel = new String[]{"Diesel", "Gas"};
        this.priceFilter = new JSlider(0, 300, 1000, 600);
        this.priceFilter.setMinorTickSpacing(50);
        this.priceFilter.setMajorTickSpacing(100);
        this.priceFilter.setPaintTicks(true);
        this.priceFilter.setPaintLabels(true);
        this.priceFilter.setVisible(true);
        this.RentCarButton = new JButton("Rent a Car") ;
        this.BackButton = new JButton("Back");
        this.ShowButton = new JButton("Show All Cars");
        this.RentButton = new JButton("Show Cars");
        this.AllCars = new TextField(100);
        this.cityPickFilter = new JComboBox(this.vehicle.Location);
        this.smokeFilter = new JComboBox(this.smoke);
        this.doorFilter = new JComboBox(this.door);
        this.transmissionFilter = new JComboBox(this.transmission);
        this.fuelType = new JComboBox(this.fuel);
        Container C = getContentPane();
        C.setLayout(new FlowLayout());
        C.add(priceFilter) ;
        C.add(smokeFilter) ;
        C.add(transmissionFilter) ;
        C.add(fuelType );
        C.add(cityPickFilter) ;
        C.add(doorFilter) ;
        C.add(ShowButton) ;
        C.add(RentButton) ;
        C.add(BackButton);
        C.add(vehicleTable) ;
        C.add(RentCarButton) ;
        BackButton.addActionListener(this);
        RentCarButton.addActionListener(this);
        /*CarButton1.addActionListener(this);
        CarButton2.addActionListener(this);
        CarButton3.addActionListener(this);
        CarButton4.addActionListener(this);
        CarButton5.addActionListener(this);
        CarButton6.addActionListener(this);
        CarButton7.addActionListener(this);
        CarButton8.addActionListener(this);*/
    }
    public void carInformation()
    {
        int i = 0;
        while(scanner.hasNextLine() && i<8)
        {
            String line = scanner.nextLine();
            outLine[i] = line ;
            carSplit = line.split(",");
            brand[i] = carSplit[0];
            plate[i] = carSplit[1];
            segment[i] = carSplit[2];
            fuelTypes[i] = carSplit[3];
            transmisson[i] = carSplit[4];
            smokes[i] = carSplit[5];
            doors[i] = carSplit[6];
            city[i] = carSplit[7];
            charge[i] = carSplit[8] ;
            for(int j=0;j<8;j++)
            {
                data[i][j] = carSplit[j] ;
            }
            i++ ;
        }
    }
    public String scanCar(String scanData) throws IOException {
        for(int w=0;w<8;w++)
        {
            if(plate[w] == scanData)
            {
                System.out.println(outLine[w]);
                return outLine[w] ;
            }
        }
        return null ;
    }
    public void writeReservation() throws IOException {
        FileWriter writer = new FileWriter(outFile);
        String outScanString = scanCar(finalScanCar);
        writer.write(outScanString) ;
        int k = 0;
        while (inScan.hasNextLine()) {
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            String str = inScan.nextLine();
            writer.write(str);
            k++;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== RentCarButton)
        {
            try {
                scanCar(finalScanCar) ;
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("sssssssssssssssssss");
            try {
                writeReservation();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
