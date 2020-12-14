package tu.cit.examples.kafkaapi;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import tu.cit.examples.kafkaapi.schemas.ModelGpsData;



public class NewReadCsv {
	public String csvFileName = "data/gpsdata.csv";
    public List dataList;
    public List ReadCSVFile()  {

        try {
           CSVReader csvReader = new CSVReader(new FileReader(csvFileName));

           CsvToBean csvToBean = new CsvToBeanBuilder(csvReader)
                   .withType(tu.cit.examples.kafkaapi.schemas.ModelGpsData.class)
                   .withIgnoreLeadingWhiteSpace(true).build();

           //This method is not recommended for large CSV File
           dataList = csvToBean.parse();
           for (Object gps : dataList) {
        	   ModelGpsData gps1 = (ModelGpsData) gps;
           System.out.println(gps1.getOrderNumber()+ " : " + gps1.getOrderId());
           //System.out.println(std.getStudentid() + " : " + std.getName() + " : " + std.getDept() + " : " + std.getSubject());
       }
            csvReader.close();
        }catch(Exception FileNotFoundException){
            //e.printStackTrace();
            System.out.println("File is not available...");
        }
       
        return dataList;
}
    }
