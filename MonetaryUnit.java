
package assignment2;
/**This program returns the name of the monetary unit and the monetary value of the unit
 * 
 * @author Shashi Kumar Kadari Mallikarjuna
 */
public class MonetaryUnit {
	private double value;
	private String name;
	/**Constructor description of Monetary Unit which has two parameters
	 * @param amount the value of the bill or coin
	 * @param amountname the name of the bill or coin
	 */
	public MonetaryUnit(double amount,String amountname) {
		value=amount;
		name=amountname;
	}
	/**This methods returns the name of the bill or coin
	 * @return name of the bill or coin
	 */
	public String getName() {
		return name;
	}
	/**This method returns the value of the bill or coin
	 * @return value of the bill or coin
	 */
	public double getValue() {
		return value;
	}
}
