package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {
    private List<Human> humans = new ArrayList<>();

    public List<Human> getHumans() {
        return humans;
    }

    public List<Human> readHumansFromFile(Path path){
        List<String> lines;
        try{
            lines= Files.readAllLines(path);
            for (String line : lines){
                String[] parts = line.split(";");
                humans.add(new Human(parts[0], parts[1]));
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Can't read file!", ioe);
        }
        return humans;
    }

    public void writeMaleHumansToFile(Path path){
        List<String> toWrite = new ArrayList<>();
        for (int i = 0; i < humans.size(); i++){
            if (humans.get(i).getIdentityNumber().startsWith("1") ||
                    humans.get(i).getIdentityNumber().startsWith("3")){
                toWrite.add(humans.get(i).getName() + ";" + humans.get(i).getIdentityNumber());
            }
        }
        try {
            Files.write(path, toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
