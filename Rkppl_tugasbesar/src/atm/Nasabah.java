/**
 * @Project Nama : RKPPL
 * @Package Nama : TUGAS_BESAR RKPPL
 * @Nama Anggota: *Muhammad Tyand.N(113040 ), *Sutopo(113040221), *Zulian Dwi.J(113040222)
 * @File Nama : Nasabah.java
 */
 
package atm;

import java.util.Date;


class Nasabah {

	private String nama;
	private String alamat;
	private Date tanggal;
	
	/**
	 * @param nama
	 * @param alamat
	 */
	public Nasabah() {
		this.nama = "Kelompok-3";
		this.alamat = "Jl.SetiaBudi";
		this.tanggal= new Date();
	}

	/**
	 * @return the nama
	 */
	String getNama() {
		return nama;
	}

	/**
	 * @return the alamat
	 */
	String getAlamat() {
		return alamat;
	}
Date gettanggal() {
		
		return tanggal;
	}

}
