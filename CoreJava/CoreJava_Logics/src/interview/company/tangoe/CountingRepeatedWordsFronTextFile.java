package interview.company.tangoe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CountingRepeatedWordsFronTextFile {

	public static FileReader fileReader = null;
	public static BufferedReader bufferedReader = null;

	public static FileWriter fileWriter = null;
	public static BufferedWriter bufferedWriter = null;

	public static void countRepWords() throws Exception {
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		fileReader = new FileReader(new File("D:\\JavaWorkSpace\\Interview\\RealTime_Programs\\src\\tangoe\\data.txt"));
		bufferedReader = new BufferedReader(fileReader);
		String line;
		
		while ((line = bufferedReader.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(line, " ");
			while (st.hasMoreTokens()) {
				String tmp = st.nextToken().toLowerCase();
				if (treeMap.containsKey(tmp)) {
					treeMap.put(tmp, treeMap.get(tmp) + 1);
				} else {
					treeMap.put(tmp, 1);
				}
			}

		}
		
		fileWriter = new FileWriter(new File("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/tangoe/sort.txt"));
		bufferedWriter = new BufferedWriter(fileWriter);

		for (Map.Entry<String, Integer> map : treeMap.entrySet()) {
			bufferedWriter.write(map.getKey() + "\t" + map.getValue());
			bufferedWriter.flush();
			System.out.println(map.getKey() + " " + map.getValue());
		}

	}

	public static void main(String[] args) throws Exception {
		countRepWords();
	}
}
