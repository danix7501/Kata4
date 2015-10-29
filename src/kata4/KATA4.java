package kata4;

import java.io.File;

public class KATA4 {

    public static void main(String[] args) {

        String pathname = "c:\\Users\\usuario\\Documents\\";
        File file = new File(pathname);
        String [] dire = file.list();
        
        for (String dire1 : dire) {
            System.out.println(dire1);
        }
        
    }
    
}
