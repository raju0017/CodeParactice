package interview.company.microgenesis;

public class ZpatternPrinting {

	// print the below pattern using java program
	
/*	#	# 	# 	# 	# 	# 	#
		#	
			#
				#
					#
						#
	#	#	#	#	#	#	# */
	
	public static void main(String[] args) {
		
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(i==0){
					System.out.print("#"+" ");
				}
				System.out.println();
				if(i==j){
					System.out.print("#"+" ");
				}
			}
		}
	}
							
	 
}
