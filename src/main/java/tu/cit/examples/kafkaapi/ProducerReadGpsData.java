package tu.cit.examples.kafkaapi;

import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import tu.cit.examples.kafkaapi.schemas.ModelGpsData;
import tu.cit.examples.kafkaapi.serde.JsonSerializer;

public class ProducerReadGpsData {

   // private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args)  {

        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG,"my-app-readcsv");
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"b-2.awsmskdatabackbone.d4ayz3.c1.kafka.eu-west-1.amazonaws.com:9092,b-1.awsmskdatabackbone.d4ayz3.c1.kafka.eu-west-1.amazonaws.com:9092,b-3.awsmskdatabackbone.d4ayz3.c1.kafka.eu-west-1.amazonaws.com:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);


        System.out.println("Producer has been created...Start sending Gps Record ");

        KafkaProducer<String,ModelGpsData> producer = new KafkaProducer<String,ModelGpsData>(props);

        NewReadCsv readCSV = new NewReadCsv();
        List gpsList = readCSV.ReadCSVFile(); //It will return the gps data
        for (Object gpsObject : gpsList) {
            ModelGpsData gpsDataObject = (ModelGpsData) gpsObject;
            System.out.println(gpsDataObject.getOrderId());
            producer.send(new ProducerRecord<String,ModelGpsData >("AWSKafkaTopics",gpsDataObject.getOrderNumber(),gpsDataObject));
         }
        System.out.println("Producer has sent all Gpst records successfully...");
        producer.close();
    }

}
