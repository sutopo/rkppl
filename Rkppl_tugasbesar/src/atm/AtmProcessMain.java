/**
 * @Project Nama : RKPPL
 * @Package Nama : TUGAS_BESAR RKPPL
 * @Nama Anggota: *Muhammad Tyand.N(113040 ), *Sutopo(113040221), *Zulian Dwi.J(113040222)
 * @File Nama : AtmProcessMain.java
 */
 
package atm;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class AtmProcessMain {
	private final int kelPenarikan = 50000;
	

	/*
	 * function inputKeyboad for to Enter Value
	 */
	String inputKeyboard() {
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String temp = "";

		try {
			temp = read.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("I/O Error");
		}

		return temp;
	}

	/*
	 * Method penarikanTunai
	 */
	private void penarikanTunai(AtmCard ac) {
		boolean valid = false;
		int penarikan = 0;
		do {
			System.out.println("\n---------PENARIKAN TUNAI-----------");
			System.out.println("Hanya untuk Kelipatan Rp." + kelPenarikan);
			System.out
					.println("Batas Penarikan Maximal Untuk Sekali Penarikan Rp.1.500.000,-");
			System.out.print("Masukan Nominal Uang : ");
			penarikan = Integer.parseInt(inputKeyboard());
			if (penarikan % kelPenarikan == 0) {
				if (penarikan <= 1500000) {
					if (ac.getSaldo() > penarikan) {
						int sisaSaldo = ac.getSaldo() - penarikan;
						ac.setSaldo(sisaSaldo);
						System.out
								.println("SELAMAT !! \n anda berhasil melakukan penarikan sebesar Rp."
										+ penarikan + ",-");
						valid = false;
					} else {
						System.out
								.println("Saldo anda tidak mencukupi untuk melakukan Penarikan Tunai");
						valid = false;
					}
				} else {
					System.out
							.println("MAAF !! \nBatas Maximal untuk Sekali Penarikan Rp.1.500.000,-");
					valid = true;
				}
			} else {
				System.out.println("Hanya Kelipatan Rp.50.000,-");
				valid = true;
			}
			System.out.print("");
		} while (valid);

	}

	/*
	 * Method resetPin
	 */
	private void resetPin(AtmCard ac) {
		ac.setPin(ac.getPinDefault());
		System.out.println("Selamat Anda Berhasil me-Reset PIN anda");
	}

	/*
	 * Method cekSalod
	 */
	private void cekSaldo(AtmCard ac) {
		System.out.println("\n---------- Bank Mandiri -----------");
		 
		System.out.println("Sisa saldo anda saat ini adalah Rp."
				+ ac.getSaldo());
		System.out.println("----------- TERIMA KASIH -----------");
	}

	/*
	 * Method transferUang
	 */
	private void transferUang(AtmCard ac) {
		boolean valid = false;
		System.out.println("--------- Transfer Uang ----------");
		System.out.print("\nMasukan No.Rekening tujuan : ");
		String noRek = inputKeyboard();
		do {
			System.out.print("Masukan Nominal Uang : ");
			int nominal = Integer.parseInt(inputKeyboard());
			if (nominal > 0) {
				if (nominal < ac.getSaldo()) {
					System.out
							.println("\nSelamat Anda Berhasil Melakukan Transaksi Transfer Uang");
					System.out.println("No Rekening \t: " + noRek);
					System.out.println("Nominal \t: Rp." + nominal + ",-");
					int sisaSaldo = ac.getSaldo() - nominal;
					ac.setSaldo(sisaSaldo);
					valid = false;
				} else {
					System.out.println("Saldo Anda tidak cukup");
					System.out.println("Untuk Melakukan Transaksi ini\n");
					valid = false;
				}
			} else {
				System.out.println("Nominal Uang harus lebih dari 0");
				valid = true;
			}
		} while (valid);

	}

	/*
	 * method menuGantiPin
	 */
	private void menuGantiPin(AtmCard ac) {
		boolean valid = false;
		do {
			System.out.println("\n------------ GANTI PIN -----------");
			System.out.println("-> 1. Ganti PIN");
			System.out.println("-> 2. Reset PIN");
			System.out.print("Masukan Pilihan Anda : ");
			String pilihan = inputKeyboard();

			if (pilihan.equalsIgnoreCase("1")) {
				gantiPin(ac);
			} else if (pilihan.equalsIgnoreCase("2")) {
				resetPin(ac);
			} else {
				System.out.println("Pilihan Anda tidak ada");
				valid = true;
			}
		} while (valid);

	}

	private void listOperatorCellular(AtmCard ac) {
		System.out.println("\n-------- List Operator -------");
		System.out.println("-> 1. Telkomsel ");
		System.out.println("-> 2. Indosat ");
		System.out.println("-> 3. XL ");
		System.out.print("Masukan Pilihan Anda : ");
		String temp = inputKeyboard();
		if (temp.equalsIgnoreCase("1")) {
			System.out.println("\n-> 1. 10.000 \t -> 2. 20.000");
			System.out.println("-> 3. 25.000 \t -> 4. 50.000");
			System.out.print("Masukan Pilihan Anda : ");
			temp = inputKeyboard();
			if (temp.equalsIgnoreCase("1")) {
				int saldo = ac.getSaldo() - 10000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.10000");
			} else if (temp.equalsIgnoreCase("2")) {
				int saldo = ac.getSaldo() - 20000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.20000");
			} else if (temp.equalsIgnoreCase("3")) {
				int saldo = ac.getSaldo() - 25000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.25000");
			} else {
				int saldo = ac.getSaldo() - 50000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.50000");
			}
		} else if (temp.equalsIgnoreCase("2")) {
			System.out.println("\n-> 1. 10.000 \t -> 2. 20.000");
			System.out.println("-> 3. 25.000 \t -> 4. 50.000");
			System.out.print("Masukan Pilihan Anda : ");
			temp = inputKeyboard();
			if (temp.equalsIgnoreCase("1")) {
				int saldo = ac.getSaldo() - 10000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.10000");
			} else if (temp.equalsIgnoreCase("2")) {
				int saldo = ac.getSaldo() - 20000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.20000");
			} else if (temp.equalsIgnoreCase("3")) {
				int saldo = ac.getSaldo() - 25000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.25000");
			} else {
				int saldo = ac.getSaldo() - 50000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.50000");
			}
		} else {
			System.out.println("-> 1. 10.000 \t -> 2. 20.000");
			System.out.println("-> 3. 25.000 \t -> 4. 50.000");
			System.out.println("Masukan Pilihan Anda : ");
			temp = inputKeyboard();
			if (temp.equalsIgnoreCase("1")) {
				int saldo = ac.getSaldo() - 10000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.10000");
			} else if (temp.equalsIgnoreCase("2")) {
				int saldo = ac.getSaldo() - 20000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.20000");
			} else if (temp.equalsIgnoreCase("3")) {
				int saldo = ac.getSaldo() - 25000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.25000");
			} else {
				int saldo = ac.getSaldo() - 50000;
				ac.setSaldo(saldo);
				System.out.print("Masukan No HP : ");
				temp = inputKeyboard();
				System.out
						.println("Selamat Anda Berhasil Melakukan Pengisian Ulang Pulsa ");
				System.out.println("No HP \t: " + temp);
				System.out.println("Nominal : Rp.50000");
			}
		}
	}

	/*
	 * Method Isi Pulsa
	 */
	private void isiPulsa(AtmCard ac, Nasabah n) {
		System.out.println("\n------- ISI PULSA -------");
		System.out.println("-> 1. Pilih Operator ");
		System.out.println("-> 2. Kembali ");
		System.out.print("Masukan Pilihan Anda : ");
		String temp = inputKeyboard();
		if (temp.equalsIgnoreCase("1")) {
			listOperatorCellular(ac);
		} else {
			showMenuAtm(n, ac);
		}

	}

	/*
	 * Method showWelcome
	 */
	private void showWelcome() {
		System.out.println("-----------ATM UNPAS-----------");
		System.out.println("|                             |");
		System.out.println("|   Welcome To Bank Mandiri		|");
		System.out.println("|                             |");
		System.out.println("----------ATM Bersama-----------");
	}

	/*
	 * Method gantiPin
	 */
	private void gantiPin(AtmCard ac) {
		boolean valid = false;
		do {
			System.out.println("\n---------- GANTI PIN ----------");
			System.out.print("Masukan Pin Anda : ");
			String input = inputKeyboard();
			if (input.equals(ac.getPin())) {
				do {
					valid = false;
					System.out.print("Masukan Pin Baru : ");
					String pinBaru = inputKeyboard();
					System.out.print("Masukan Kembali Pin : ");
					String pinBaru1 = inputKeyboard();
					if (pinBaru.equals(pinBaru1)) {
						ac.setPin(pinBaru1);
						 System.out.println("\n---------- Bank Mandiri -----------");
							
						System.out.println("Selamat Anda Berhasil Melakukan Pergantian PIN");
						System.out.println("PIN Anda Saat ini :"+ ac.getPin());
						System.out.println("\n---------- TERIMA KASIH -----------");
						
					} else {
						System.out.println("Pin Validasi Tidak Cocok !!");
						valid = true;
					}

				} while (valid);
			} else {
				System.out.println("Pin Anda Tidak Cocok !!");
				valid = true;
			}
		} while (valid);

	}

	/*
	 * Method transaksiUtama
	 */
	private void transaksiUtama(Nasabah n, AtmCard ac) {
		boolean valid = false;
		do {
			System.out.print("Masukan Pilihan Anda : ");
			int pilihan = Integer.parseInt(inputKeyboard());
			if ((pilihan <= 6) && (pilihan > 0)) {
				valid = false;
				switch (pilihan) {
				case 1:
					tambahsaldo(ac);
					break;
				case 2:
					cekSaldo(ac);
					break;
				case 3:
					menuGantiPin(ac);
					break;
				case 4:
					transferUang(ac);
					break;
				case 5:
					isiPulsa(ac, n);
					break;
				case 6:
					penarikanTunai(ac);
					break;

				default:
					System.out
							.println("\n------------- TERIMA KASIH TELAH MELAKUKAN TRANSAKSI------------");
					System.exit(0);
					break;
				}
				System.out.print("\nApakah anda ingin lanjut ? [y/n] ");
				String validasi = inputKeyboard();
				if (validasi.equalsIgnoreCase("Y")) {
					System.out.println("\n");
					validasiPin(n, ac);
				} else {
					System.out
							.println("\n------------- TERIMA KASIH TELAH MELAKUKAN TRANSAKSI------------");
					System.exit(0);
				}

			} else {
				System.out.println("Inputan Tidak Ada \n");
				valid = true;
			}
		} while (valid);
	}

	/*
	 * Method menu utama Mesin ATM
	 */
	private void showMenuAtm(Nasabah n, AtmCard ac) {
		System.out.println("\nNama Nasabah \t: " + n.getNama());
		System.out.println("No.Rekening \t: " + ac.getNoRek());
		System.out.println("Alamat \t \t: " + n.getAlamat());
		System.out.println(n.gettanggal());
		System.out.println("\n------ MENU ATM --------\n");
		System.out.println("-> 1. Tambah saldo");
		System.out.println("-> 2. Cek Saldo");
		System.out.println("-> 3. PIN");
		System.out.println("-> 4. Transfer Uang");
		System.out.println("-> 5. ISI PULSA");
		System.out.println("-> 6. Penarikan Tunai\n");
		System.out.println("-> 7. Exit\n");
		transaksiUtama(n, ac);
	}

	/*
	 * Method untuk Validasi PIN
	 */
	private void validasiPin(Nasabah n, AtmCard ac) {
		boolean validasi = false;
		int iterasi = 1;
		do {
			System.out.print("Masukan PIN Anda : ");
			String pin = inputKeyboard();
			if (iterasi <= 3) {
				if (pin.equals(ac.getPin())) {
					showMenuAtm(n, ac);
				} else {
					System.out.println("PIN ANDA SALAH !!");
					int i = 3 - iterasi;
					System.out.println("Kesempatan Memasukan Pin Tinggal " + i
							+ " Kali\n");
					validasi = true;
				}
			} else {
				System.out.println("Anda telah melebihi batas memasukan PIN");
				System.out.println("Kartu Anda Di Blokir !!\n");

			}
			iterasi++;
		} while (validasi);
		System.out.println("\n---------- TERIMA KASIH -----------");
	}
	private void tambahsaldo( AtmCard ac){
		boolean validasi = false;
		int masukan = 0;
		
		System.out.println("masukan Nominal uang :");
		masukan = Integer.parseInt(inputKeyboard());
		ac.setSaldo(ac.getSaldo() + masukan);
		
		if (masukan > 0) {
			System.out.println("\n---------- Bank Mandiri -----------");
				System.out.println("\nSelamat Anda Berhasil Menambah saldo");
				System.out.println("No.Rekening \t: " + ac.getNoRek());
				System.out.println("Saldo Anda Sekarang \t: Rp." +	ac.getSaldo());
			} else {
				System.out.println("anda belum menambah saldo");
				
				validasi = false;
			}
	 while (validasi);
	
	System.out.println("\n---------- TERIMA KASIH -----------");
	}
	public static void main(String[] args) {
		Nasabah n = new Nasabah(); // intansiasi objek atau pembuatan konstruktor
		AtmCard ac = new AtmCard();// intansiasi objek atau pembuatan konstruktor
		AtmProcessMain apm = new AtmProcessMain();// intansiasi objek atau pembuatan Konstruktor
		ac.setSaldo(0); // pemanggilan method setSaldo
		apm.showWelcome(); // pemanggilan method showWelcome
		apm.validasiPin(n, ac); // pemanggilan mehtod validasiPin

	}
}
