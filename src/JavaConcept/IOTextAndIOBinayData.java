package JavaConcept;

import java.io.*;

public class IOTextAndIOBinayData {

    // binary Data->Image,Video,audio
    // FileOutputStream->it write binary data in distination folder
    //FileInputStream->it read binary data from distination folder


    //FileWriter->create text file and write text data in distination folder
    //FileReader->read text data from distination file

    /*stream classes can be divided into two types of classes that are ByteStream classes and
     CharacterStream Classes. The ByteStream classes are further divided into InputStream classes and OutputStream classes.
      CharacterStream classes are also divided into Reader classes and Writer classes.
       The SuperMost classes for all the InputStream classes is java.io.InputStream and
        for all the output stream classes is java.io.OutPutStream. Similarly, for
         all the reader classes, the super-most class is java.io.Reader, and for all the writer classes, it is java.io.Writer.
         */

   /* ------------------------------------------------------FileReaderFileWriter--------------------------------------------*/

    public static void main(String[] args) throws Exception {
        try( BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:/Users/Admin/Desktop/Folder/mytestwriteFile.pdf"))){
            bufferedWriter.write("my name is a abhijit sagar");
            bufferedWriter.newLine();
            bufferedWriter.write("i am from supaul");
            bufferedWriter.close();
        }catch (Exception ex){
            throw new Exception();
        }

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("C:/Users/Admin/Desktop/Folder/mytestwriteFile.pdf"))){
            String line;
            while(( line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }

        }catch (Exception ex){
            throw new Exception();
        }

/*-------------------------------------------------------------IOStream---------------------------------------------*/


        byte[] image;

        try(FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Admin\\Pictures\\Camera Roll\\WIN_20231228_15_25_50_Pro.mp4")){

            image=    fileInputStream.readAllBytes();
            InputStream in = new ByteArrayInputStream(image);
            Integer l=    image.length;


        }catch(Exception ex){
            throw new Exception();
        }



        try(FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/Admin/Desktop/Folder/out.mp4")){
            fileOutputStream.write(image);
            fileOutputStream.flush();

        }catch(Exception Ex){
            throw new Exception();
        }
    }

}
