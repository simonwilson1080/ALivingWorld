import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Definitions.Creature;
import Definitions.Territory;
import Definitions.MargCitizenship;
import Definitions.SimCitizenship;

import Entities.Simonite;
import Entities.Margartian;


public class World {

    private Territory[][] map = new Territory[50][50];
    private List<Creature> creatures;

    public World(int n) {
        Random r = new Random();
        List<Supplier<Creature>> types = Arrays.asList(
            () -> new Simonite(getRandomName(), r.nextInt(3), r.nextInt(50), r.nextInt(50)),
            () -> new Margartian(getRandomname(), r.nextInt(3), r.nextInt(50), r.nextInt(50)),
        );
    }

    public String getRandomName() throws IOException{

        ArrayList names = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("./names.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                names.add(line);
            }
        } 
        catch (IOException e) {System.out.println(e);}
        finally {if(reader != null) reader.close();}

        Random random = new Random();
        return (String) names.get(random.nextInt(names.size()-1));
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
