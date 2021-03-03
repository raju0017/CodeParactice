package interview.company.tangoe;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DuplicateWordsCount {

	public TreeMap<String, Integer> getWordCount(String fileName) {

		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");

				while (st.hasMoreTokens()) {
					String tmp = st.nextToken().toLowerCase();
					if (wordMap.containsKey(tmp)) {
						wordMap.put(tmp, wordMap.get(tmp) + 1);
					} else {
						wordMap.put(tmp, 1);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
		}
		return wordMap;
	}

	public static void main(String a[]) {
		DuplicateWordsCount dwc = new DuplicateWordsCount();
		TreeMap<String, Integer> wordMap = dwc
				.getWordCount("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/tangoe/data1.txt");
		for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}
	}

}
