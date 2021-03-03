package basics.interfaces;


public class MyMarkerImpl  implements MyMarker{

	public void permision(MyMarker obj){
		
		if(obj instanceof MyMarker){
			System.out.println("permission given");
		}
		else{
			System.out.println("permission not given");
		}
	}
}
