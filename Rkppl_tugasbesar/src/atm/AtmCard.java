/**
 * @Project Nama : RKPPL
 * @Package Nama : TUGAS_BESAR RKPPL
 * @Nama Anggota: *Muhammad Tyand.N(113040 ), *Sutopo(113040221), *Zulian Dwi.J(113040222)
 * @File Nama : AtmCard.java
 */
 
package atm;


class AtmCard {

	private String noRek;
	private String pin;
	private final String pinDefault = "0123";
	private int saldo;

	/**
	 * @return the pinDefault
	 */
	String getPinDefault() {
		return pinDefault;
	}

	/**
	 * @param noRek
	 * @param pin
	 * @param saldo
	 */
	public AtmCard() {
		this.noRek = "123-00-0123456";
		this.pin = "123";
	}

	/**
	 * @return the noRek
	 */
	String getNoRek() {
		return noRek;
	}

	/**
	 * @return the saldo
	 */
	int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the pin
	 */
	String getPin() {
		return pin;
	}

	/**
	 * @param pin
	 *            the pin to set
	 */
	void setPin(String pin) {
		this.pin = pin;
	}

	public void setSaldo(String saldobaru1) {
		// TODO Auto-generated method stub
		
	}

}
