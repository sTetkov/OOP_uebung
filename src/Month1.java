public enum Month1{
	Jan(false),Feb(false),Mar(false),Arp(false),
	May(false),Jun(true),Jul(true),Aug(true),
	Sep(false),Oct(false),Nov(false),Dec(false);
	
	private boolean summerMonth;
	
	Month1(boolean summer){
		summerMonth=summer;
	}
	
	public boolean isSummer(){
		return summerMonth;
		}
}
