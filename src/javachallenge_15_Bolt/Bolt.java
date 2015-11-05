package javachallenge_15_Bolt;

public class Bolt {
	public static Float vasarol(float penz, Termek termek){
	   if(penz >= termek.getAr()){
		penz = new Float(penz-termek.getAr());
	   } else {
System.out.println("Nem tudod megvasarolni a termeket: " +   termek.name());
	   }
		return penz;
	}
	public enum Termek {
		CERUZA(new Float(0.1f)),
		RADIR(Float.valueOf("0.2f")),
		VONALZO(0.3f),
		TOLL((float)0.4);
		private final Float ar;
		Termek(float ar){
			this.ar = ar;
		}	
		public float getAr(){
			return this.ar;
		}
	}
	public static void main(String[] args) {
		Float penz = new Float(1.0f); 
		penz = Bolt.vasarol(penz, Termek.CERUZA); 
	}
  }
