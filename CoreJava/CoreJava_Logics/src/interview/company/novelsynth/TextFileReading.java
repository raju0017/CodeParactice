package interview.company.novelsynth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReading {

	public static void main(String[] args) throws Exception {
		
		String str;
		
		try{
			
			File f = new File("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/novelsynth/file.txt");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			while(( str = br.readLine())!=null)
			{
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
