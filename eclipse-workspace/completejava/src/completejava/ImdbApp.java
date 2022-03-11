package completejava;

public class ImdbApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int yearofborn =1958;
		   String Name="Bruce Lorne Campbell";
		   String[] movietitle={"geek or go",
		   "Make Love",
		   "The Ladies of the Evil Dead Meet",
		   "Hard truth",
		   "The King Lives"};
		   
		   float []  ratings= {
				   7.7F,7.6F,9.0F,6.5F,4.5F};
		 

		
		 System.out.println("Name of the person:"+ Name);
		   System.out.println("year of born:" + yearofborn);
		   System.out.println("Age:" +(2021-yearofborn));
		 
		   for(int i=0;i< movietitle.length;i++) {
		   System.out.println("Movie title "+movietitle[i]);
		  }
		   
		   ratingsofMovies(8.0F);
		   System.out.println();
	}
  
     
  
   

 static String  ratingsofMovies(float rating) {
	   if(rating <= 5.0) {
		   return      "bad";
	   }else if(rating >5.0 && rating <=6.5) {
		   return  "average";
	   }else if(rating >6.5 && rating <=7.0) {
		   return  "good";
	   }else if(rating >7.0&& rating <=8.0) {
		   return  "very good";
	   }else if(rating   >8.0){
		   return  "amazing";
	   }
	return null;
	   
	   
	 
	   
	   
	   
 } 
}
