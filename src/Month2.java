
public enum Month2 {
	Jan,Feb,Mar,Arp,
	May,Jun,Jul,Aug,
	Sep,Oct,Nov,Dec;
	
	public boolean isSummer()
	{
		return this==Jun || this==Jul || this==Aug;
	}
}
