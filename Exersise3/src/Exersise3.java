
public class Exersise3 {

	public static void main(String[] args) {
		int[] Volume = {20,15,10};                     //Declairs the volumes of paint avalable per can
		int[] areaper = {10,15,20};                    //Declairs the area per litre covered 
		double[] price = {19.99,17.99,25};             //Declairs the price of each can
		
		int[] area = new int[3];                       //creates a new array for area covered
		double[] value = new double[3];                //creates a new array for value
		for(int i=0; i<3; i++) {
			area[i] = Volume[i] * areaper[i];          //calculated the area covered by the whole can
			value[i] = price[i] / area[i];             //calculated the price per metre squared
		}
	
		if(value[0] < value[1] && value[0] < value[2] ){                  //Determines if the first value is the lowest
				System.out.print(value[0] + "CheapoMax at £");
				System.out.printf("%.2f",value[0]);
				System.out.print(" Per square metere");
		}
			else if(value[1] < value[0] && value[1] < value[2]) {         //Determines if the second value is the lowest
					System.out.print("AverageJoes at £");
					System.out.printf("%.2f",value[1]);
					System.out.print(" Per square metere");
				}
				else{
					System.out.print("DuluxourousPaints at £");          // If neither the first or second value is the lowest then the third value must be the lowest.
					System.out.printf("%.2f",value[2]);
					System.out.print(" Per square metere");						
		}
	}
}